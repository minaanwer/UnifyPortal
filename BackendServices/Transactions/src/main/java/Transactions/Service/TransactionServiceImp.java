package Transactions.Service;

import Transactions.Data.TransactionEntity;
import Transactions.Data.TransactionRepository;
import Transactions.Shared.DTO.SpecificationsBuilder;
import Transactions.Shared.DTO.TransactionDTO;
import Transactions.Shared.DTO.TransactionSearchCriteriaDTO;
import Transactions.Shared.Exceptions.ResourceNotFoundException;
import Transactions.Shared.Extensions.ModelMapperExtended;
import Transactions.Shared.Extensions.StringExtended;
import net.bytebuddy.implementation.bytecode.Throw;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TransactionServiceImp implements TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;
@Autowired
private TransactionRepository repo;



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

        if(!StringExtended.IsNullOrEmpty(searchCriteriaDTO.getTransactionId()))
            builder.with("transactionId","==",searchCriteriaDTO.getTransactionId());

/*
        if(!StringExtended.IsNullOrEmpty(searchCriteriaDTO.getCreationDateFrom()))
        builder.with("LOCAL_DATE",">",searchCriteriaDTO.getCreationDateFrom());
*/

        Specification<TransactionEntity> spec = builder.build();
        List<TransactionEntity> trxLst =   repo.findAll(spec);
        return  new ModelMapperExtended().mapList(trxLst,TransactionDTO.class);

/*
        List<TransactionDTO> lst = new ArrayList<TransactionDTO>();
        lst.add(new TransactionDTO("99"));
        lst.add(new TransactionDTO("79"));
        lst.add(new TransactionDTO("7"));
        lst.add(new TransactionDTO("89"));
        return lst;

 */
    }
}
