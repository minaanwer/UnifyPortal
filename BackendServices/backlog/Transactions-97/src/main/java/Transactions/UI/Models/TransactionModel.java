package Transactions.UI.Models;
import lombok.Data;

@Data
public class TransactionModel {

    private String TransactionId;  //Generated  transaction Id by system
    private String MSGTYPE ;
    private String MATCH_FLAG;
    private String PAN;
    private String PCODE;
    private String SETTLEMENT_DATE;
    private String AMOUNT;
    private String SETTLEMENT_AMOUNT;
    private String CARDHOLDER_AMOUNT;
    private  String SETTLEMENT_RATE;
    private  String    ISS_CONV_RATE;
    private  String LOCAL_DATE;
    private  String LOCAL_TIME;
    private  String EXPIRY_DATE;
    private  String POS_ENTRY_MODE;
    private  String CABC;
    private  String ESCODE;
    private  String ACQ_REFDATA;
    private  String RRN;
    private  String AUTH_NUMBER;
    private  String TERMID;
    private  String ACCEPTOR_ID;
    private  String ACCEPTOR_NAME;
    private  String P0023;
    private  String P0052;
    private  String ACQ_CURRENCY_CODE;
    private  String SETTLEMENT_CURRENCY_CODE;
    private  String ISS_CURRENCY_CODE;
    private  String ACQUIER_ID;
    private  String FORWARD_ID;
    private  String ICA;
    private  String CollectionFlag;
    private  String Auth_Trace;
    private  String Auth_Reference_Number;
    private  String Auth_Account_Number;
    private  String P0001_1;
    private  String P0002_2;
    private  String Trace_ID;
    private  String Recon_Date;
    private  String Recon_Cycle;
    private  String Central_Date;
    private  String P0670;
    private  String P0671;
    private  String P0674;
    private  String STATUS;
    private  String PROCESSING_STATUS;


    public TransactionModel() {

    }

    public TransactionModel(String transactionId) {
        TransactionId = transactionId;
        this.ACCEPTOR_ID="any" ;
        this.AMOUNT = "100";
    }
}