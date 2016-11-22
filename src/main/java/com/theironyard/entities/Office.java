package com.theironyard.entities;

import java.util.ArrayList;

/**
 * Created by jeffryporter on 11/22/16.
 */
public class Office
{
    private String name
            ;
    private ArrayList<String> divisionId;

    private ArrayList<String> levels;

    private ArrayList<String> roles;

    private ArrayList<Source> sources;

    public Office()
    {
    }

    public Office(String name, ArrayList<String> divisionId, ArrayList<String> levels, ArrayList<String> roles, ArrayList<Source> sources)
    {
        this.name = name;
        this.divisionId = divisionId;
        this.levels = levels;
        this.roles = roles;
        this.sources = sources;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public ArrayList<String> getDivisionId()
    {
        return divisionId;
    }

    public void setDivisionId(ArrayList<String> divisionId)
    {
        this.divisionId = divisionId;
    }

    public ArrayList<String> getLevels()
    {
        return levels;
    }

    public void setLevels(ArrayList<String> levels)
    {
        this.levels = levels;
    }

    public ArrayList<String> getRoles()
    {
        return roles;
    }

    public void setRoles(ArrayList<String> roles)
    {
        this.roles = roles;
    }

    public ArrayList<Source> getSources()
    {
        return sources;
    }

    public void setSources(ArrayList<Source> sources)
    {
        this.sources = sources;
    }
}
