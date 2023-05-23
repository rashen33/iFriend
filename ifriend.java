import java.util.*;
import java.time.*;

public class ifriend{
        //Global Variables
        public static String[] contactID = new String[0];
        public static String[] name = new String[0];
        public static String[] tpNumber = new String[0];
        public static String[] company = new String[0];
        public static int[] salary = new int[0];
        public static String[] birthday = new String[0];
        
        //Main Method
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        printMainMenue();
        int option = input.nextInt();

        switch(option){
            case 1: addContacts(option); 
            //case 2: updateContacts(option);
            //case 3: deleteContacts(option);
            //case 4: searchContacts(option);
            //case 5: listContacts(option);
            //default: System.out.println("Thank you for using iFriend!")

        }
    }

    //Clear Console Method
    public final static void clearConsole() {
        try {
        final String os = System.getProperty("os.name");
        if (os.contains("Windows")) {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        }
        } catch (final Exception e) {
        e.printStackTrace();
        // Handle any exceptions.
        }
    
    }
    
    //Main Menue Print Method
    public static void printMainMenue(){
        System.out.println("+---------------------------------------------------+");
		System.out.println("|                    iFRIEND                        |");
		System.out.println("+---------------------------------------------------+");
        System.out.println("[01] ADD Contacts");
		System.out.println("[02] UPDATE Contacts");
		System.out.println("[03] DELETE Contacts");
		System.out.println("[04] SEARCH Contacts");
		System.out.println("[05] LIST Contacts");
		System.out.println("[06] Exit\n");
        System.out.print("Enter an option to contuniue -> ");
    }
    
    //Add Contacts Print Method
    public static void addContactsPrint(){
        System.out.println("+---------------------------------------------------+");
		System.out.println("|            ADD Contact to the list                |");
		System.out.println("+---------------------------------------------------+");

    }

    //Extend CID array
    public static void extendCIDArray(){
        int lengthCID = contactID.length;
        String[] tempCID = new String[lengthCID+1];
        for(int i=0; i<lengthCID; i++){
            tempCID[i]=contactID[i];
        }
        contactID=tempCID;
    }

    //Add CID array
    public static String addCIDArray(){
        extendCIDArray();
        String id = String.format("C%04d",(contactID.length));
        contactID[contactID.length-1] = id;
        return id;
    }

    //Extend name array
    public static void extendnameArray(){
        int lengthName = name.length;
        String[] tempName = new String[lengthName+1];
        for(int i=0; i<lengthName; i++){
            tempName[i]=name[i];
        }
        name=tempName;
    }

    //Add name to the array
    public static void addName(String enterName){
        extendnameArray();
        name[name.length-1]=enterName;
    }
    
    //Extend phone number array
    public static void extendTPNumberArray(){
        int lengthTP = tpNumber.length;
        String[] tempTP = new String[lengthTP+1];
        for(int i=0; i<lengthTP; i++){
            tempTP[i]=tpNumber[i];
        }
        tpNumber=tempTP;
    }

    //Add phone number to the array
    public static void addTPNumber(String phoneNumber){
        extendTPNumberArray();
        tpNumber[tpNumber.length-1]=phoneNumber;
    }


    //Generate Contact ID , store it in the CID array and Print
    public static void printCID(){
        System.out.println(addCIDArray());
        System.out.println("=============");
    }

    //Input a new name and store it in the name array
    public static void printInputName(){
        Scanner input = new Scanner(System.in);
        System.out.print("Name\t\t\t: ");
        String enterName = input.next();
        addName(enterName);
    }

    //Insert code to validate the name here


    //Input the phone number and validate
    public static void printInputPhoneNumber(){
        Scanner input = new Scanner(System.in);
        L1:do{
            System.out.print("Phone Number\t\t: ");
            String phoneNumber = input.next();
            boolean PNvalid = isValidPhoneNumber(phoneNumber);
    
            if(isValidPhoneNumber(phoneNumber)){
                addTPNumber(phoneNumber);
                break;
            }else{
                System.out.println("\t\tInvalid phone number...");
                System.out.print("Do you want to add phone number again (Y/N) : ");
                String yn = input.next();
                if(yn.equalsIgnoreCase("Y")){
                    //Clears 3 rows upward
                    System.out.print("\033[3A");
                    //Clears the user input in the 3rd row
                    System.out.print("\033[0J");
                    //If the user input is "y" the code runes from the start of the do while loop labeled L1
                    continue L1;
                }else if(yn.equalsIgnoreCase("N")){
                    //clearConsole();
                    break;
                }
            }
        }while(true);
    }

    //Validation for the phone number
    public static boolean isValidPhoneNumber(String phoneNumber){
        // Check if the phone number is null or empty
        if (phoneNumber == null || phoneNumber.isEmpty()) {
            return false;
        }
        
        // Check if the phone number starts with a zero
        if (phoneNumber.charAt(0) != '0') {
            return false;
        }

        //Check all the numbers are digits
        for(int i=0; i<phoneNumber.length(); i++){
            if(!Character.isDigit(phoneNumber.charAt(i))){
                return false;
            }
        }

        return phoneNumber.length() == 10;
    }

    //Extend the company name array
    public static void extendCompnayArray(){
        int lengthComp = company.length;
        String[] tempComp = new String[lengthComp+1];
        for(int i=0; i<lengthComp; i++){
            tempComp[i]=company[i];
        }
        company=tempComp;
    }

    //Add a company name to the array
    public static void addCompany(String comp){
        extendCompnayArray();
        company[company.length-1]=comp;
    }

    //Input a company name (No validations)
    public static void printCompanyName(){
        Scanner input = new Scanner(System.in);
        System.out.print("Compnay\t\t\t: ");
        String comp = input.next();
        addCompany(comp);  
    }

    //Extend the salary array
    public static void extendSalaryArray(){
        int lengthSal = salary.length;
        int[] tempSal = new int[lengthSal+1];
        for(int i=0; i<lengthSal; i++){
            tempSal[i]=salary[i];
        }
        salary=tempSal;
    }

    //Add the sarlary to the array
    public static void addSalary(int sal){
        extendSalaryArray();
        salary[salary.length-1]=sal;
    }

    //Input the salary and print it after validating
    public static void printSalary(){
        L2:do{
            Scanner input = new Scanner(System.in);
            System.out.print("Salary\t\t\t: ");
            int sal = input.nextInt();
            boolean SALval = isSalValid(sal);
    
            if(isSalValid(sal)){
                addSalary(sal);
                break;
            }else{
                System.out.println("\t\tInvalid input...");
                System.out.print("Do you want to add the salary again (Y/N) : ");
                String yn = input.next();
                if(yn.equalsIgnoreCase("Y")){
                    //Clears 3 rows upward
                    System.out.print("\033[3A");
                    //Clears the user input in the 3rd row
                    System.out.print("\033[0J");
                    //If the user input is "y" the code runes from the start of the do while loop labeled L1
                    continue L2;
                }else if(yn.equalsIgnoreCase("N")){
                    break;
                }
            }
        }while(true);
    }

    //Validation for the salary
    public static boolean isSalValid(int sal){
        if(sal<0){
            return false;
        }

        return true;
    }
    
    public static void addContacts(int option){
        clearConsole();
        addContactsPrint();
        
        //Generate Contact ID , store it in the CID array and Print
        printCID();
        
        //Input a new name and store it in the name array
        printInputName();

        //Input a new phone number
        printInputPhoneNumber();

        //Input Company name
        printCompanyName();

        //Input Salary
        printSalary();

        //Input Birthday

    






        
    }





}



