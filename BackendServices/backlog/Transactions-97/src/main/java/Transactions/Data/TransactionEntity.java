package Transactions.Data;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "AuthTransaction")

public class TransactionEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(nullable = false,length = 500)
    private String transactionId;  //Generated  transaction Id by system

    @Column(nullable = false,length = 500)
    private String MSGTYPE ;
    @Column(nullable = false,length = 500)

    private String MATCH_FLAG;
    @Column(nullable = false,length = 500)
    private String PAN;

    @Column(nullable = false,length = 500)
    private String PCODE;

    @Column(nullable = false,length = 500)
    private String SETTLEMENT_DATE;

    @Column(nullable = false,length = 500)
    private String AMOUNT;

    @Column(nullable = false,length = 500)
    private String SETTLEMENT_AMOUNT;

    @Column(nullable = false,length = 500)
    private String CARDHOLDER_AMOUNT;

    @Column(nullable = false,length = 500)
    private String SETTLEMENT_RATE;

    @Column(nullable = false,length = 500)
    private String ISS_CONV_RATE;

    @Column(nullable = false,length = 500)
    private String LOCAL_DATE;

    @Column(nullable = false,length = 500)
    private String LOCAL_TIME;

    @Column(nullable = false,length = 500)
    private String EXPIRY_DATE;

    @Column(nullable = false,length = 500)
    private String POS_ENTRY_MODE;

    @Column(nullable = false,length = 500)
    private String CABC;

    @Column(nullable = false,length = 500)
    private String ESCODE;

    @Column(nullable = false,length = 500)
    private String ACQ_REFDATA;

    @Column(nullable = false,length = 500)
    private  String RRN;

    @Column(nullable = false,length = 500)
    private  String AUTH_NUMBER;

    @Column(nullable = false,length = 500)
    private  String TERMID;

    @Column(nullable = false,length = 500)
    private  String ACCEPTOR_ID;

    @Column(nullable = false,length = 500)
    private  String ACCEPTOR_NAME;

    @Column(nullable = false,length = 500)
    private  String P0023;

    @Column(nullable = false,length = 500)
    private  String P0052;

    @Column(nullable = false,length = 500)
    private  String ACQ_CURRENCY_CODE;

    @Column(nullable = false,length = 500)
    private  String SETTLEMENT_CURRENCY_CODE;

    @Column(nullable = false,length = 500)
    private  String ISS_CURRENCY_CODE;

    @Column(nullable = false,length = 500)
    private  String ACQUIER_ID;

    @Column(nullable = false,length = 500)
    private  String FORWARD_ID;

    @Column(nullable = false,length = 500)
    private  String ICA;

    @Column(nullable = false,length = 500)
    private  String CollectionFlag;

    @Column(nullable = false,length = 500)
    private  String Auth_Trace;

    @Column(nullable = false,length = 500)
    private  String Auth_Reference_Number;

    @Column(nullable = false,length = 500)
    private  String Auth_Account_Number;

    @Column(nullable = false,length = 500)
    private  String P0001_1;

    @Column(nullable = false,length = 500)
    private  String P0002_2;

    @Column(nullable = false,length = 500)
    private  String Trace_ID;

    @Column(nullable = false,length = 500)
    private  String Recon_Date;

    @Column(nullable = false,length = 500)
    private  String Recon_Cycle;

    @Column(nullable = false,length = 500)
    private  String Central_Date;

    @Column(nullable = false,length = 500)
    private  String P0670;

    @Column(nullable = false,length = 500)
    private  String P0671;

    @Column(nullable = false,length = 500)
    private  String P0674;

    @Column(nullable = false,length = 500)
    private  String STATUS;

    @Column(nullable = false,length = 500)
    private  String PROCESSING_STATUS;


    public TransactionEntity() {

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        transactionId = transactionId;
    }

    public String getMSGTYPE() {
        return MSGTYPE;
    }

    public void setMSGTYPE(String MSGTYPE) {
        this.MSGTYPE = MSGTYPE;
    }

    public String getMATCH_FLAG() {
        return MATCH_FLAG;
    }

    public void setMATCH_FLAG(String MATCH_FLAG) {
        this.MATCH_FLAG = MATCH_FLAG;
    }

    public String getPAN() {
        return PAN;
    }

    public void setPAN(String PAN) {
        this.PAN = PAN;
    }

    public String getPCODE() {
        return PCODE;
    }

    public void setPCODE(String PCODE) {
        this.PCODE = PCODE;
    }

    public String getSETTLEMENT_DATE() {
        return SETTLEMENT_DATE;
    }

    public void setSETTLEMENT_DATE(String SETTLEMENT_DATE) {
        this.SETTLEMENT_DATE = SETTLEMENT_DATE;
    }

    public String getAMOUNT() {
        return AMOUNT;
    }

    public void setAMOUNT(String AMOUNT) {
        this.AMOUNT = AMOUNT;
    }

    public String getSETTLEMENT_AMOUNT() {
        return SETTLEMENT_AMOUNT;
    }

    public void setSETTLEMENT_AMOUNT(String SETTLEMENT_AMOUNT) {
        this.SETTLEMENT_AMOUNT = SETTLEMENT_AMOUNT;
    }

    public String getCARDHOLDER_AMOUNT() {
        return CARDHOLDER_AMOUNT;
    }

    public void setCARDHOLDER_AMOUNT(String CARDHOLDER_AMOUNT) {
        this.CARDHOLDER_AMOUNT = CARDHOLDER_AMOUNT;
    }

    public String getSETTLEMENT_RATE() {
        return SETTLEMENT_RATE;
    }

    public void setSETTLEMENT_RATE(String SETTLEMENT_RATE) {
        this.SETTLEMENT_RATE = SETTLEMENT_RATE;
    }

    public String getISS_CONV_RATE() {
        return ISS_CONV_RATE;
    }

    public void setISS_CONV_RATE(String ISS_CONV_RATE) {
        this.ISS_CONV_RATE = ISS_CONV_RATE;
    }

    public String getLOCAL_DATE() {
        return LOCAL_DATE;
    }

    public void setLOCAL_DATE(String LOCAL_DATE) {
        this.LOCAL_DATE = LOCAL_DATE;
    }

    public String getLOCAL_TIME() {
        return LOCAL_TIME;
    }

    public void setLOCAL_TIME(String LOCAL_TIME) {
        this.LOCAL_TIME = LOCAL_TIME;
    }

    public String getEXPIRY_DATE() {
        return EXPIRY_DATE;
    }

    public void setEXPIRY_DATE(String EXPIRY_DATE) {
        this.EXPIRY_DATE = EXPIRY_DATE;
    }

    public String getPOS_ENTRY_MODE() {
        return POS_ENTRY_MODE;
    }

    public void setPOS_ENTRY_MODE(String POS_ENTRY_MODE) {
        this.POS_ENTRY_MODE = POS_ENTRY_MODE;
    }

    public String getCABC() {
        return CABC;
    }

    public void setCABC(String CABC) {
        this.CABC = CABC;
    }

    public String getESCODE() {
        return ESCODE;
    }

    public void setESCODE(String ESCODE) {
        this.ESCODE = ESCODE;
    }

    public String getACQ_REFDATA() {
        return ACQ_REFDATA;
    }

    public void setACQ_REFDATA(String ACQ_REFDATA) {
        this.ACQ_REFDATA = ACQ_REFDATA;
    }

    public String getRRN() {
        return RRN;
    }

    public void setRRN(String RRN) {
        this.RRN = RRN;
    }

    public String getAUTH_NUMBER() {
        return AUTH_NUMBER;
    }

    public void setAUTH_NUMBER(String AUTH_NUMBER) {
        this.AUTH_NUMBER = AUTH_NUMBER;
    }

    public String getTERMID() {
        return TERMID;
    }

    public void setTERMID(String TERMID) {
        this.TERMID = TERMID;
    }

    public String getACCEPTOR_ID() {
        return ACCEPTOR_ID;
    }

    public void setACCEPTOR_ID(String ACCEPTOR_ID) {
        this.ACCEPTOR_ID = ACCEPTOR_ID;
    }

    public String getACCEPTOR_NAME() {
        return ACCEPTOR_NAME;
    }

    public void setACCEPTOR_NAME(String ACCEPTOR_NAME) {
        this.ACCEPTOR_NAME = ACCEPTOR_NAME;
    }

    public String getP0023() {
        return P0023;
    }

    public void setP0023(String p0023) {
        P0023 = p0023;
    }

    public String getP0052() {
        return P0052;
    }

    public void setP0052(String p0052) {
        P0052 = p0052;
    }

    public String getACQ_CURRENCY_CODE() {
        return ACQ_CURRENCY_CODE;
    }

    public void setACQ_CURRENCY_CODE(String ACQ_CURRENCY_CODE) {
        this.ACQ_CURRENCY_CODE = ACQ_CURRENCY_CODE;
    }

    public String getSETTLEMENT_CURRENCY_CODE() {
        return SETTLEMENT_CURRENCY_CODE;
    }

    public void setSETTLEMENT_CURRENCY_CODE(String SETTLEMENT_CURRENCY_CODE) {
        this.SETTLEMENT_CURRENCY_CODE = SETTLEMENT_CURRENCY_CODE;
    }

    public String getISS_CURRENCY_CODE() {
        return ISS_CURRENCY_CODE;
    }

    public void setISS_CURRENCY_CODE(String ISS_CURRENCY_CODE) {
        this.ISS_CURRENCY_CODE = ISS_CURRENCY_CODE;
    }

    public String getACQUIER_ID() {
        return ACQUIER_ID;
    }

    public void setACQUIER_ID(String ACQUIER_ID) {
        this.ACQUIER_ID = ACQUIER_ID;
    }

    public String getFORWARD_ID() {
        return FORWARD_ID;
    }

    public void setFORWARD_ID(String FORWARD_ID) {
        this.FORWARD_ID = FORWARD_ID;
    }

    public String getICA() {
        return ICA;
    }

    public void setICA(String ICA) {
        this.ICA = ICA;
    }

    public String getCollectionFlag() {
        return CollectionFlag;
    }

    public void setCollectionFlag(String collectionFlag) {
        CollectionFlag = collectionFlag;
    }

    public String getAuth_Trace() {
        return Auth_Trace;
    }

    public void setAuth_Trace(String auth_Trace) {
        Auth_Trace = auth_Trace;
    }

    public String getAuth_Reference_Number() {
        return Auth_Reference_Number;
    }

    public void setAuth_Reference_Number(String auth_Reference_Number) {
        Auth_Reference_Number = auth_Reference_Number;
    }

    public String getAuth_Account_Number() {
        return Auth_Account_Number;
    }

    public void setAuth_Account_Number(String auth_Account_Number) {
        Auth_Account_Number = auth_Account_Number;
    }

    public String getP0001_1() {
        return P0001_1;
    }

    public void setP0001_1(String p0001_1) {
        P0001_1 = p0001_1;
    }

    public String getP0002_2() {
        return P0002_2;
    }

    public void setP0002_2(String p0002_2) {
        P0002_2 = p0002_2;
    }

    public String getTrace_ID() {
        return Trace_ID;
    }

    public void setTrace_ID(String trace_ID) {
        Trace_ID = trace_ID;
    }

    public String getRecon_Date() {
        return Recon_Date;
    }

    public void setRecon_Date(String recon_Date) {
        Recon_Date = recon_Date;
    }

    public String getRecon_Cycle() {
        return Recon_Cycle;
    }

    public void setRecon_Cycle(String recon_Cycle) {
        Recon_Cycle = recon_Cycle;
    }

    public String getCentral_Date() {
        return Central_Date;
    }

    public void setCentral_Date(String central_Date) {
        Central_Date = central_Date;
    }

    public String getP0670() {
        return P0670;
    }

    public void setP0670(String p0670) {
        P0670 = p0670;
    }

    public String getP0671() {
        return P0671;
    }

    public void setP0671(String p0671) {
        P0671 = p0671;
    }

    public String getP0674() {
        return P0674;
    }

    public void setP0674(String p0674) {
        P0674 = p0674;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }

    public String getPROCESSING_STATUS() {
        return PROCESSING_STATUS;
    }

    public void setPROCESSING_STATUS(String PROCESSING_STATUS) {
        this.PROCESSING_STATUS = PROCESSING_STATUS;
    }
}


