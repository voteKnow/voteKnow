# voteKnow
An app to get accurate information out to the public regarding elections in the US.

Current Table variables:

public class Politician
{
    int id;

    String name;

    String profilePictureLocation;

    String partyAffiliation;

    boolean currentlyHoldingOffice;

    String position;

    ArrayList<String> previousPositions;

    int age;

    int yearsInPolitics;

    HashMap<String, Boolean> votingRecord;
}

public class Bill
{
    int id;

    String referenceNumber;

    String billName;

    Date dateSubmitted;

    Date dateUpForVote;

    String billCreators;

    String billBody;

    String billSynopsis;

    ArrayList<String> amendments;

    ArrayList<String> amendmentSynopsis;

    ArrayList<String> amendmentCreators;
}


