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

Java defined routes

    /politician       Create - saves a new politician; takes politician JSON, returns politician JSON
                      Read - takes a level and region, returns Iterable of politician JSON;
                      Update - updates a politician; takes politician JSON, returns politician JSON

    /politician/{id}  Read - find an individual politician; takes an int ID, returns politician JSON
                      Delete - removes a politician from the database; takes an int ID, returns politician JSON

    /bill             Create - saves a new bill; takes bill JSON, returns bill JSON
                      Read - takes a level and region, returns Iterable of bill JSON;
                      Update - updates a bill; takes bill JSON, returns bill JSON

    /bill/{id}        Read - find an individual bill; takes an int ID, returns bill JSON
                      Delete - removes a bill from the database; takes an int ID, returns bill JSON
                     
Front End Build System:

   Install npm dependencies listed in package.json from command line:
   
            cd voteKnow 
            npm install
   
   All work should be in the frontend directory:
   
            cd frontend
    
   Run gulp in the frontend directory to output to public directory. This watches for any changes and will throw errors if something is not right:
   
             gulp


    
