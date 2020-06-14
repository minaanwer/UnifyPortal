package Transactions.Service;

import Transactions.Data.PaginatedTransactionRepository;
import Transactions.Data.TransactionEntity;
import Transactions.Data.TransactionRepository;
import Transactions.Shared.DTO.SpecificationsBuilder;
import Transactions.Shared.DTO.TransactionDTO;
import Transactions.Shared.DTO.TransactionSearchCriteriaDTO;
import Transactions.Shared.Exceptions.ResourceNotFoundException;
import Transactions.Shared.Extensions.ModelMapperExtension;
import Transactions.Shared.Extensions.StringExtension;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImp implements TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;
    @Autowired
    private PaginatedTransactionRepository  PaginatedRepo;



    @Override
    public TransactionDTO GetTransactionById(String id) throws ResourceNotFoundException {
        TransactionEntity transactionEntity = transactionRepository.findByTransactionId( (id));
        if (transactionEntity == null)
            throw new ResourceNotFoundException("transaction with id : " + id + "is not exists ");
        return new ModelMapper().map(transactionEntity,TransactionDTO.class);
    }

    @Override
    public List<TransactionDTO> Search(TransactionSearchCriteriaDTO searchCriteriaDTO) {

        SpecificationsBuilder builder = new SpecificationsBuilder();
        if(!StringExtension.IsNullOrEmpty(searchCriteriaDTO.getTransactionId()))
            builder.with("transactionId","==",searchCriteriaDTO.getTransactionId());
/*
        if(!StringExtended.IsNullOrEmpty(searchCriteriaDTO.getCreationDateFrom()))
        builder.with("LOCAL_DATE",">",searchCriteriaDTO.getCreationDateFrom());
*/
        Specification<TransactionEntity> spec = builder.build();
        List<TransactionEntity> trxLst =   transactionRepository.findAll(spec);
        return  new ModelMapperExtension().map(trxLst,TransactionDTO.class);
    }

    @Override
    public Page<TransactionDTO> Search(TransactionSearchCriteriaDTO searchCriteriaDTO, Long page) {
        SpecificationsBuilder builder = new SpecificationsBuilder();

        if(searchCriteriaDTO.getTransactionId() !=null )
            builder.with("transactionId","==",searchCriteriaDTO.getTransactionId());
     /*   if(searchCriteriaDTO.getPAN()!=null)
            builder.with("PAN","==",searchCriteriaDTO.getPAN());
        if(searchCriteriaDTO.getMSGTYPE()!= null)
            builder.with("MSGTYPE","==",searchCriteriaDTO.getMSGTYPE());
*/


        Specification<TransactionEntity> spec = builder.build();
        Page<TransactionEntity> trxLst =   PaginatedRepo.findAll(spec, PageRequest.of(page.intValue(), 10, Sort.unsorted())); // new PageRequest(page.intValue(),12,Sort.unsorted()));
     return new ModelMapperExtension().map(trxLst,TransactionDTO.class);

    }

}
