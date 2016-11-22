package com.theironyard.entities;

/**
 * Created by jeffryporter on 11/22/16.
 */
public class Source
{
    private String name;

    private Boolean official;

    public Source()
    {
    }

    public Source(String name, Boolean official)
    {
        this.name = name;
        this.official = official;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Boolean getOfficial()
    {
        return official;
    }

    public void setOfficial(Boolean official)
    {
        this.official = official;
    }
}
