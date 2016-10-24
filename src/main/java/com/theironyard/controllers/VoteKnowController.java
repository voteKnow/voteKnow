package com.theironyard.controllers;

import com.theironyard.entities.Bill;
import com.theironyard.entities.Politician;
import com.theironyard.services.BillRepository;
import com.theironyard.services.PoliticianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by jeffryporter on 8/9/16.
 */
@Controller
public class VoteKnowController
{
    @Autowired
    BillRepository bills;

    @Autowired
    PoliticianRepository politicians;

    //***************************************************************************************
    //
    //                  BILL ROUTES
    //
    //***************************************************************************************

    //creates a bill and saves it to the database
    @RequestMapping(path = "/bill-create", method = RequestMethod.POST)
    public String createBill(String referenceNumber, String billName, Date dateSubmitted, Date dateUpForVote, String billCreators, String billBody, String billSynopsis)
    {
        Bill bill = new Bill(referenceNumber, billName, dateSubmitted, dateUpForVote, billCreators, billBody, billSynopsis);
        bills.save(bill);
        return "redirect:/user-profile";
    }

    //shows a particular bill by id
    @RequestMapping(path = "/bill-read", method = RequestMethod.GET)
    public Bill getBill(int id)
    {
        Bill bill = bills.findOne(id);
        return bill;
    }

    //shows all bills
    @RequestMapping(path = "/bill-read", method = RequestMethod.GET)
    public Iterable<Bill> getBill()
    {
        Iterable<Bill> billList = bills.findAll();
        return billList;
    }

    //updates a bill
    @RequestMapping(path = "/bill-update", method = RequestMethod.POST)
    public String updateBill( int id, String referenceNumber, String billName, Date dateSubmitted, Date dateUpForVote, String billCreators, String billBody, String billSynopsis)
    {
        Bill bill = new Bill(referenceNumber, billName, dateSubmitted, dateUpForVote, billCreators, billBody, billSynopsis);
        bill.setId(id);
        bills.save(bill);
        return"";
    }

    //"deletes" a bill.  bill is kept in database, but is not visible anymore.
    @RequestMapping(path = "/bill-delete", method = RequestMethod.POST)
    public String deleteBill (int id, HttpServletRequest request)
    {
        bills.delete(id);
        String referer = request.getHeader("Referer");
        return "redirect:" + referer;
    }

    //***************************************************************************************
    //
    //                  POLITICIAN ROUTES
    //
    //***************************************************************************************

    //creates a politician and saves it to the database
    @RequestMapping(path = "/politician-create", method = RequestMethod.POST)
    public String createPolitician(String name, String partyAffiliation, boolean currentlyHoldingOffice, String position, ArrayList<String> previousPositions, int age, int yearsInPolitics, HashMap<String, Boolean> votingRecord)
    {
        Politician politician = new Politician(name, partyAffiliation, currentlyHoldingOffice, position, previousPositions, age, yearsInPolitics, votingRecord);
        politicians.save(politician);
        return "";
    }

    //shows a particular politician by id
    @RequestMapping(path = "/politician-read", method = RequestMethod.GET)
    public Politician getPolitician(int id)
    {
        Politician politician = politicians.findOne(id);
        return politician;
    }

    //shows all politician
    @RequestMapping(path = "/politician-read", method = RequestMethod.GET)
    public Iterable<Politician> getPolitician()
    {
        Iterable<Politician> politicianList = politicians.findAll();
        return politicianList;
    }

    //updates a politician
    @RequestMapping(path = "/politician-update", method = RequestMethod.POST)
    public String updatePolitician(int id, String name, String partyAffiliation, boolean currentlyHoldingOffice, String position, ArrayList<String> previousPositions, int age, int yearsInPolitics, HashMap<String, Boolean> votingRecord)
    {
        Politician politician = new Politician(name, partyAffiliation, currentlyHoldingOffice, position, previousPositions, age, yearsInPolitics, votingRecord);
        politician.setId(id);
        politicians.save(politician);
        return"";
    }

    //"deletes"  a politician.  item is kept in database, but is not visible anymore.
    @RequestMapping(path = "/politician-delete", method = RequestMethod.POST)
    public String deletePolitician (int id, HttpServletRequest request)
    {
        politicians.delete(id);
        String referer = request.getHeader("Referer");
        return "redirect:" + referer;
    }
}
