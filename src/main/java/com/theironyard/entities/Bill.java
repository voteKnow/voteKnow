package com.theironyard.entities;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by jeffryporter on 5/22/16.
 */
public class Bill {
    private String referenceNumber;
    private String billName;
    private Date dateSubmitted;
    private Date dateUpForVote;
    private String billCreators;
    private String billBody;
    private String billSynopsis;
    private ArrayList<String> amendments;
    private ArrayList<String> amendmentSynopsis;
    private ArrayList<ArrayList<String>> amendmentCreators;

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getBillName() {
        return billName;
    }

    public void setBillName(String billName) {
        this.billName = billName;
    }

    public Date getDateSubmitted() {
        return dateSubmitted;
    }

    public void setDateSubmitted(Date dateSubmitted) {
        this.dateSubmitted = dateSubmitted;
    }

    public Date getDateUpForVote() {
        return dateUpForVote;
    }

    public void setDateUpForVote(Date dateUpForVote) {
        this.dateUpForVote = dateUpForVote;
    }

    public String getBillCreators() {
        return billCreators;
    }

    public void setBillCreators(String billCreators) {
        this.billCreators = billCreators;
    }

    public String getBillBody() {
        return billBody;
    }

    public void setBillBody(String billBody) {
        this.billBody = billBody;
    }

    public String getBillSynopsis() {
        return billSynopsis;
    }

    public void setBillSynopsis(String billSynopsis) {
        this.billSynopsis = billSynopsis;
    }

}
