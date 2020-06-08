package Transactions.Shared.DTO;

import lombok.*;

public class TransactionSearchCriteriaDTO {

    private String CreationDateFrom ;

    private String CreationDateto ;

    private String transactionId ;

    private String PAN ;

    private String MSGTYPE ;

    public TransactionSearchCriteriaDTO() {
    }

    public TransactionSearchCriteriaDTO(String creationDateFrom, String creationDateto, String transactionId, String PAN, String MSGTYPE) {
        CreationDateFrom = creationDateFrom;
        CreationDateto = creationDateto;
        this.transactionId = transactionId;
        this.PAN = PAN;
        this.MSGTYPE = MSGTYPE;
    }

    public String getCreationDateFrom() {
        return CreationDateFrom;
    }

    public void setCreationDateFrom(String creationDateFrom) {
        CreationDateFrom = creationDateFrom;
    }

    public String getCreationDateto() {
        return CreationDateto;
    }

    public void setCreationDateto(String creationDateto) {
        CreationDateto = creationDateto;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getPAN() {
        return PAN;
    }

    public void setPAN(String PAN) {
        this.PAN = PAN;
    }

    public String getMSGTYPE() {
        return MSGTYPE;
    }

    public void setMSGTYPE(String MSGTYPE) {
        this.MSGTYPE = MSGTYPE;
    }
}