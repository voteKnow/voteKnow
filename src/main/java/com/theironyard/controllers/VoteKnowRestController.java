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
    public Politician addPolitician(@RequestBody Politician politician)
    {
        politicians.save(politician);
        return politician;
    }

    @RequestMapping(path = "/politician", method = RequestMethod.PUT)
    public Politician editPolitician(@RequestBody Politician politician)
    {
        politicians.save(politician);
        return politician;
    }

    @RequestMapping(path = "/politician/{id}", method = RequestMethod.DELETE)
    public Politician deletePolitician(@PathVariable("id") int id)
    {
        Politician politician = politicians.findOne(id);
        politicians.delete(id);
        return politician;
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
    public Bill addBill(@RequestBody Bill bill)
    {
        bills.save(bill);
        return bill;
    }

    @RequestMapping(path = "/bills", method = RequestMethod.PUT)
    public Bill editBill(@RequestBody Bill bill)
    {
        bills.save(bill);
        return bill;
    }

    @RequestMapping(path = "/bill/{id}", method = RequestMethod.DELETE)
    public Bill deleteBill(@PathVariable("id") int id)
    {
        Bill bill = bills.findOne(id);
        bills.delete(id);
        return bill;
    }

    @RequestMapping(path = "/bill/{id}", method = RequestMethod.GET)
    public Bill getBill(@PathVariable("id") int id)
    {
        return bills.findOne(id);
    }
}
