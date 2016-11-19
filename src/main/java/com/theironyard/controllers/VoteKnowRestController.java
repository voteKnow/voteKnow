package com.theironyard.controllers;

import com.theironyard.entities.Bill;
import com.theironyard.entities.Politician;
import com.theironyard.services.BillRepository;
import com.theironyard.services.PoliticianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by jeffryporter on 8/9/16.
 */
@RestController
public class VoteKnowRestController
{
    @Autowired
    PoliticianRepository politicians;

    @Autowired
    BillRepository bills;


    //***************************************************************************************
    //
    //               Politicians Routes
    //
    //***************************************************************************************
    @RequestMapping(path = "/politician", method = RequestMethod.GET)
    public Iterable<Politician> getPolitician(@PathVariable("region") String region, @PathVariable("level") Enum level)
    {
        return politicians.findPoliticianByLevelAndRegion(level, region);
    }

    @RequestMapping(path = "/politician", method = RequestMethod.POST)
    public void addPolitician(@RequestBody Politician politician)
    {
        politicians.save(politician);
    }

    @RequestMapping(path = "/politician", method = RequestMethod.PUT)
    public void editPolitician(@RequestBody Politician politician)
    {
        politicians.save(politician);
    }

    @RequestMapping(path = "/politician/{id}", method = RequestMethod.DELETE)
    public void deletePolitician(@PathVariable("id") int id)
    {
        politicians.delete(id);
    }

    @RequestMapping(path = "/politician/{id}", method = RequestMethod.GET)
    public Politician getPolitician(@PathVariable("id") int id)
    {
        return politicians.findOne(id);
    }



    //***************************************************************************************
    //
    //               Bills Routes
    //
    //***************************************************************************************
    @RequestMapping(path = "/bills", method = RequestMethod.GET)
    public Iterable<Bill> getBills(@PathVariable("region") String region, @PathVariable("level") Enum level)
    {
        return bills.findBillByLevelAndRegion(level, region);
    }

    @RequestMapping(path = "/bills", method = RequestMethod.POST)
    public void addBill(@RequestBody Bill appointment)
    {
        bills.save(appointment);
    }

    @RequestMapping(path = "/bills", method = RequestMethod.PUT)
    public void editBill(@RequestBody Bill bill)
    {
        bills.save(bill);
    }

    @RequestMapping(path = "/bill/{id}", method = RequestMethod.DELETE)
    public void deleteBill(@PathVariable("id") int id)
    {
        bills.delete(id);
    }

    @RequestMapping(path = "/bill/{id}", method = RequestMethod.GET)
    public Bill getBill(@PathVariable("id") int id)
    {
        return bills.findOne(id);
    }
}
