package Transactions;

import Transactions.Data.TransactionEntity;
import Transactions.Data.TransactionRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TransactionRepoTests {


@Autowired
TransactionRepository transactionRepository;

    @Test
    public void NormalJPA_Repo_Query(){
      //TransactionEntity trx =  transactionRepository.GetTransactionByTransactionId("11");
        TransactionEntity trx =  transactionRepository.findByTransactionId("11");

        assertEquals(false,trx.equals(null) );
    }



    @Test
    public void CustomJPA_Repo_Query(){
        //TransactionEntity trx =  transactionRepository.GetTransactionByTransactionId("11");
        TransactionEntity trx =  transactionRepository.GetTransactionByTransactionId("11");

        assertEquals(false,trx.equals(null) );
    }

    @Test
    public void CustomJPA_Repo_Query_using_Predict(){



    }




}
