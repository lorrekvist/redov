package wagesystemPackage;

import java.util.ArrayList;

public class Test {

    @org.junit.Test
    public void unitTest(){

        ArrayList<String> adminList = new ArrayList<String>();
        ArrayList<String> regUserList = new ArrayList<String>();
        ArrayList<String> adminBankAccounts = new ArrayList<String>();
        ArrayList<String> bankAccounts = new ArrayList<String>();
        ArrayList<String> adminWageList = new ArrayList<String>();
        ArrayList<String> wageList = new ArrayList<String>();
        ArrayList<String> roleRequests = new ArrayList<String>();
        ArrayList<String> raiseRequest = new ArrayList<String>();
        ArrayList<String> approvedRoleRequests = new ArrayList<String>();
        ArrayList<String> approvedRaiseRequests = new ArrayList<String>();
        adminList.add( "admin1");
        adminList.add( "admin1234");

        regUserList.add( "madlad");
        regUserList.add( "madlad1234");
        regUserList.add( "madlass");
        regUserList.add( "madlass1234");

        adminBankAccounts.add( "admin1");
        adminBankAccounts.add( "50000");

        adminWageList.add( "admin1");
        adminWageList.add( "35000");

        bankAccounts.add( "madlad");
        bankAccounts.add( "33000");
        bankAccounts.add( "madlass");
        bankAccounts.add( "38000");


        wageList.add( "madlad");
        wageList.add( "27500");
        wageList.add( "madlass");
        wageList.add( "25500");

        roleRequests.add( "madlad");
        raiseRequest.add( "madlad");
        //The index returned (temporarily for this test) starts at 33000,
        // it is the bank account for user "madlad".
        //This users wage is 27500.
        //Therefore the expected outcome would be 60500.
        Admin admin = new Admin("bonk", "admin", 30000, 30000, true);
        //int output = admin.pushWages(bankAccounts, wageList);
        //Assert.assertEquals(60500, output);
    }
}
