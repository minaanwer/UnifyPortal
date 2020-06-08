package Transactions.Service;


import Transactions.Shared.DTO.SearchCriteria;
import Transactions.Shared.DTO.TransactionDTO;
import Transactions.Shared.DTO.TransactionSearchCriteriaDTO;
import Transactions.Shared.Exceptions.ResourceNotFoundException;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface  TransactionService {


   TransactionDTO GetTransactionById(String id) throws ResourceNotFoundException;
   List<TransactionDTO> Search (TransactionSearchCriteriaDTO searchCriteriaDTO);

    Page<TransactionDTO> Search(TransactionSearchCriteriaDTO transactionSearchCriteriaDTO, Long page);
}
