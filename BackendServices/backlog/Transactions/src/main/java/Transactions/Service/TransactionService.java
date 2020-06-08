package Transactions.Service;


import Transactions.Shared.DTO.TransactionDTO;
import Transactions.Shared.Exceptions.ResourceNotFoundException;

import java.util.Optional;

public interface  TransactionService {


   TransactionDTO GetTransactionById(String id) throws ResourceNotFoundException;
}
