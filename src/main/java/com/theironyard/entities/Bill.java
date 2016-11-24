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
    private String name;

    @Column(nullable = false)
    private Date dateSubmitted;

    @Column(nullable = false)
    private Date dateUpForVote;

    @Column(nullable = false)
    private ArrayList<String> creators;

    @Column(nullable = false)
    private String body;

    @Column(nullable = false)
    private String synopsis;

    @Column(nullable = false)
    private String region;

    @Column(nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private Level level;

    private ArrayList<Amendment> amendments;

    public Bill()
    {
    }

    public Bill(int id, String referenceNumber, String name, Date dateSubmitted, Date dateUpForVote, ArrayList<String> creators, String body, String synopsis, String region, Level level, ArrayList<Amendment> amendments)
    {
        this.id = id;
        this.referenceNumber = referenceNumber;
        this.name = name;
        this.dateSubmitted = dateSubmitted;
        this.dateUpForVote = dateUpForVote;
        this.creators = creators;
        this.body = body;
        this.synopsis = synopsis;
        this.region = region;
        this.level = level;
        this.amendments = amendments;
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

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
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

    public ArrayList<String> getCreators()
    {
        return creators;
    }

    public void setCreators(ArrayList<String> creators)
    {
        this.creators = creators;
    }

    public String getBody()
    {
        return body;
    }

    public void setBody(String body)
    {
        this.body = body;
    }

    public String getSynopsis()
    {
        return synopsis;
    }

    public void setSynopsis(String synopsis)
    {
        this.synopsis = synopsis;
    }

    public String getRegion()
    {
        return region;
    }

    public void setRegion(String region)
    {
        this.region = region;
    }

    public Level getLevel()
    {
        return level;
    }

    public void setLevel(Level level)
    {
        this.level = level;
    }

    public ArrayList<Amendment> getAmendments()
    {
        return amendments;
    }

    public void setAmendments(ArrayList<Amendment> amendments)
    {
        this.amendments = amendments;
    }
}