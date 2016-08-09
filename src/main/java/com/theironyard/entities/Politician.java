package com.theironyard.entities;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * Created by jeffryporter on 5/22/16.
 */
public class Politician
{
    //declare variables
    private String name;
    private String profilePictureLocation;
    private String partyAffiliation;
    private boolean currentlyHoldingOffice;
    private String position;
    private ArrayList<String> previousPositions;
    private int age;
    private int yearsInPolitics;
    private HashMap<String, Boolean> votingRecord;

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
        yearsInPolitics = yearsInPolitics;
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


