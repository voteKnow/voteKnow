package com.theironyard.entities;

/**
 * Created by jeffryporter on 11/22/16.
 */
public class Channel
{
    private String type;

    private String ID;

    public Channel()
    {
    }

    public Channel(String type, String ID)
    {
        this.type = type;
        this.ID = ID;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getID()
    {
        return ID;
    }

    public void setID(String ID)
    {
        this.ID = ID;
    }
}
