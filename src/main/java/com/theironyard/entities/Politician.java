package com.theironyard.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashMap;

/*
 * Created by jeffryporter on 5/22/16.
 */
@Entity
@Table(name = "politicians")
public class Politician
{
    //declare variables
    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private String name;

    private String profilePictureLocation;

    @Column(nullable = false)
    private String partyAffiliation;

    @Column(nullable = false)
    private boolean currentlyHoldingOffice;

    @Column(nullable = false)
    private String position;

    @Column(nullable = false)
    private ArrayList<String> previousPositions;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false)
    private int yearsInPolitics;

    @Column(nullable = false)
    private HashMap<String, Boolean> votingRecord;

    @Column(nullable = false)
    private String region;

    @Column(nullable = false)
    private Enum level;

    public Politician()
    {
    }

    public Politician(String name, String partyAffiliation, boolean currentlyHoldingOffice, String position, ArrayList<String> previousPositions, int age, int yearsInPolitics, HashMap<String, Boolean> votingRecord)
    {
        this.name = name;
        this.partyAffiliation = partyAffiliation;
        this.currentlyHoldingOffice = currentlyHoldingOffice;
        this.position = position;
        this.previousPositions = previousPositions;
        this.age = age;
        this.yearsInPolitics = yearsInPolitics;
        this.votingRecord = votingRecord;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getProfilePictureLocation()
    {
        return profilePictureLocation;
    }

    public void setProfilePictureLocation(String profilePictureLocation)
    {
        this.profilePictureLocation = profilePictureLocation;
    }

    public String getPartyAffiliation()
    {
        return partyAffiliation;
    }

    public void setPartyAffiliation(String partyAffiliation)
    {
        this.partyAffiliation = partyAffiliation;
    }

    public boolean isCurrentlyHoldingOffice()
    {
        return currentlyHoldingOffice;
    }

    public void setCurrentlyHoldingOffice(boolean currentlyHoldingOffice)
    {
        this.currentlyHoldingOffice = currentlyHoldingOffice;
    }

    public String getPosition()
    {
        return position;
    }

    public void setPosition(String position)
    {
        this.position = position;
    }

    public ArrayList<String> getPreviousPositions()
    {
        return previousPositions;
    }

    public void setPreviousPositions(ArrayList<String> previousPositions)
    {
        this.previousPositions = previousPositions;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getYearsInPolitics()
    {
        return yearsInPolitics;
    }

    public void setYearsInPolitics(int yearsInPolitics)
    {
        this.yearsInPolitics = yearsInPolitics;
    }

    public HashMap<String, Boolean> getVotingRecord()
    {
        return votingRecord;
    }

    public void setVotingRecord(HashMap<String, Boolean> votingRecord)
    {
        this.votingRecord = votingRecord;
    }
}