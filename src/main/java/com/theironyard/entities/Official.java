package com.theironyard.entities;

import java.util.ArrayList;

/**
 * Created by jeffryporter on 11/22/16.
 */
public class Official
{
    private String name;

    private ArrayList<Address> address;

    private String party;

    private ArrayList<String> phones;

    private ArrayList<String> urls;

    private String photoUrl;

    private ArrayList<String> email;

    private ArrayList<Channel> channels;

    public Official()
    {
    }

    public Official(String name, ArrayList<Address> address, String party, ArrayList<String> phones, ArrayList<String> urls, String photoUrl, ArrayList<String> email, ArrayList<Channel> channels)
    {
        this.name = name;
        this.address = address;
        this.party = party;
        this.phones = phones;
        this.urls = urls;
        this.photoUrl = photoUrl;
        this.email = email;
        this.channels = channels;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public ArrayList<Address> getAddress()
    {
        return address;
    }

    public void setAddress(ArrayList<Address> address)
    {
        this.address = address;
    }

    public String getParty()
    {
        return party;
    }

    public void setParty(String party)
    {
        this.party = party;
    }

    public ArrayList<String> getPhones()
    {
        return phones;
    }

    public void setPhones(ArrayList<String> phones)
    {
        this.phones = phones;
    }

    public ArrayList<String> getUrls()
    {
        return urls;
    }

    public void setUrls(ArrayList<String> urls)
    {
        this.urls = urls;
    }

    public String getPhotoUrl()
    {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl)
    {
        this.photoUrl = photoUrl;
    }

    public ArrayList<String> getEmail()
    {
        return email;
    }

    public void setEmail(ArrayList<String> email)
    {
        this.email = email;
    }

    public ArrayList<Channel> getChannels()
    {
        return channels;
    }

    public void setChannels(ArrayList<Channel> channels)
    {
        this.channels = channels;
    }
}
