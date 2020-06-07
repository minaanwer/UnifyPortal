package Transactions.Data;


import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TransactionRepository  extends CrudRepository<TransactionEntity,Long> {

    TransactionEntity findByTransactionId(String TransactionId);

}
