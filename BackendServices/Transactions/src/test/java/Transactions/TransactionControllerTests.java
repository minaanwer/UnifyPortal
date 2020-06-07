package Transactions;

import Domain.AbstractTest;
import Transactions.UI.Models.TransactionModel;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.jdbc.SqlConfig;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.Assert.assertEquals;

public class TransactionControllerTests extends AbstractTest {


    @Override
    @Before
    public void setUp() {
        super.setUp();
    }

    @Test
    public void GetTransactionStatus_shouldReturn_ok() throws Exception {
     String uri = "/api/transaction/status" ;
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
                .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
        int status = mvcResult.getResponse().getStatus();

        assertEquals(200,status);
         String content = mvcResult.getResponse().getContentAsString();
         assertEquals(true,content.equals("transaction controller says: i'm ok!") );

    }


    @Test
    public void GetTransactionById_ShouldReturn_Transaction_with_Correct_Id() throws Exception {
        String uri = "/api/transaction/" ;
        String transactionId = "11";
        uri+=transactionId;

        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
                .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
        int status = mvcResult.getResponse().getStatus();

        assertEquals(200,status);
        String content = mvcResult.getResponse().getContentAsString();

        TransactionModel trx = super.mapFromJson(content,TransactionModel.class);

    }


}
