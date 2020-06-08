package Transactions.Data;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface PaginatedTransactionRepository  extends  JpaSpecificationExecutor<TransactionEntity>, PagingAndSortingRepository<TransactionEntity, Integer> {

}
