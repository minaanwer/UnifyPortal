package Transactions.Data;


import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface TransactionRepository  extends CrudRepository<TransactionEntity,Long> , JpaSpecificationExecutor<TransactionEntity> {

    TransactionEntity findByTransactionId(String TransactionId);


@Query("select u  from TransactionEntity u  where u.transactionId = :trxId ")
    TransactionEntity GetTransactionByTransactionId(@Param("trxId") String trxId);

}
