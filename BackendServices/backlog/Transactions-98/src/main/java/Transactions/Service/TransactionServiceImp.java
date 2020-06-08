package Transactions.Service;

import Transactions.Data.TransactionEntity;
import Transactions.Data.TransactionRepository;
import Transactions.Shared.DTO.TransactionDTO;
import Transactions.Shared.Exceptions.ResourceNotFoundException;
import net.bytebuddy.implementation.bytecode.Throw;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TransactionServiceImp implements TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;


    @Override
    public TransactionDTO GetTransactionById(String id) throws ResourceNotFoundException {
        TransactionEntity transactionEntity = transactionRepository.findByTransactionId( (id));
        if (transactionEntity == null)
            throw new ResourceNotFoundException("transaction with id : " + id + "is not exists ");

        return new ModelMapper().map(transactionEntity,TransactionDTO.class);
    }
}
