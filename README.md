# voteKnow
An app to get accurate information out to the public regarding elections in the US.

Current Java variables:

    Politician
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
        enum Level level;
        String region;
        HashMap<String, Boolean> votingRecord;
    }

    Bill
    {
        int id;
        String referenceNumber;
        String billName;
        Date dateSubmitted;
        Date dateUpForVote;
        String billCreators;
        String billBody;
        String billSynopsis;
        enum Level level;
        String region;
        ArrayList<String> amendments;
        ArrayList<String> amendmentSynopsis;
        ArrayList<String> amendmentCreators;
    }


