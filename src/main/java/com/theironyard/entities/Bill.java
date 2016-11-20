package com.theironyard.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by jeffryporter on 5/22/16.
 */

@Entity
@Table(name = "bills")
public class Bill
{
    public enum Level
    {
        FEDERAL,
        STATE,
        LOCAL
    }

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private String referenceNumber;

    @Column(nullable = false)
    private String billName;

    @Column(nullable = false)
    private Date dateSubmitted;

    @Column(nullable = false)
    private Date dateUpForVote;

    @Column(nullable = false)
    private String billCreators;

    @Column(nullable = false)
    private String billBody;

    @Column(nullable = false)
    private String billSynopsis;

    @Column(nullable = false)
    private String region;

    @Column(nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private Level level;

    private ArrayList<String> amendments;

    private ArrayList<String> amendmentSynopsis;

    private ArrayList<ArrayList<String>> amendmentCreators;

    public Bill()
    {
    }

    public Bill(String referenceNumber, String billName, Date dateSubmitted, Date dateUpForVote, String billCreators, String billBody, String billSynopsis, String region, Level level, ArrayList<String> amendments, ArrayList<String> amendmentSynopsis, ArrayList<ArrayList<String>> amendmentCreators)
    {
        this.referenceNumber = referenceNumber;
        this.billName = billName;
        this.dateSubmitted = dateSubmitted;
        this.dateUpForVote = dateUpForVote;
        this.billCreators = billCreators;
        this.billBody = billBody;
        this.billSynopsis = billSynopsis;
        this.region = region;
        this.level = level;
        this.amendments = amendments;
        this.amendmentSynopsis = amendmentSynopsis;
        this.amendmentCreators = amendmentCreators;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getReferenceNumber()
    {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber)
    {
        this.referenceNumber = referenceNumber;
    }

    public String getBillName()
    {
        return billName;
    }

    public void setBillName(String billName)
    {
        this.billName = billName;
    }

    public Date getDateSubmitted()
    {
        return dateSubmitted;
    }

    public void setDateSubmitted(Date dateSubmitted)
    {
        this.dateSubmitted = dateSubmitted;
    }

    public Date getDateUpForVote()
    {
        return dateUpForVote;
    }

    public void setDateUpForVote(Date dateUpForVote)
    {
        this.dateUpForVote = dateUpForVote;
    }

    public String getBillCreators()
    {
        return billCreators;
    }

    public void setBillCreators(String billCreators)
    {
        this.billCreators = billCreators;
    }

    public String getBillBody()
    {
        return billBody;
    }

    public void setBillBody(String billBody)
    {
        this.billBody = billBody;
    }

    public String getBillSynopsis()
    {
        return billSynopsis;
    }

    public void setBillSynopsis(String billSynopsis)
    {
        this.billSynopsis = billSynopsis;
    }

    public ArrayList<String> getAmendments()
    {
        return amendments;
    }

    public void setAmendments(ArrayList<String> amendments)
    {
        this.amendments = amendments;
    }

    public ArrayList<String> getAmendmentSynopsis()
    {
        return amendmentSynopsis;
    }

    public void setAmendmentSynopsis(ArrayList<String> amendmentSynopsis)
    {
        this.amendmentSynopsis = amendmentSynopsis;
    }

    public ArrayList<ArrayList<String>> getAmendmentCreators()
    {
        return amendmentCreators;
    }

    public void setAmendmentCreators(ArrayList<ArrayList<String>> amendmentCreators)
    {
        this.amendmentCreators = amendmentCreators;
    }

    public Level getLevel()
    {
        return level;
    }

    public void setLevel(Level level)
    {
        this.level = level;
    }

    public String getRegion()
    {
        return region;
    }

    public void setRegion(String region)
    {
        this.region = region;
    }
}