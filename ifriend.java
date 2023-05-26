//comment
import java.util.*;
import java.time.*;

public class ifriend{
    //Global Variables
    public static String[] contactID = {"C0001","C0002","C0003","C0004","C0005"};
    public static String[] name = {"Sam","Andy","Sammy","Shan","Dam"};
    public static String[] tpNumber = {"0113848957","0116784532","0716784532","0777492085","0768091234"};
    public static String[] company = {"Apple","Google","Amazon","Microsoft","Dialog"};
    public static double[] salary = {20000,50000,450000,230000,456000};
    public static String[] birthday = {"1990-06-15","1985-12-03","2001-08-22","1978-04-10","2002-07-22"};
        
    //===========Main Method===========
    public static void main(String[] args){
        homePage();
    }
    
    //Home page Method
    public static void homePage(){
        Scanner input = new Scanner(System.in);
        printMainMenue();
        int option = input.nextInt();

        switch(option){
            case 1: addContacts(option); break;
            case 2: updateContacts(option); break;
            case 3: deleteContacts(option); break;
            case 4: searchContacts(option); break;
            case 5: listContacts(option); break;
            default: System.out.println("\t\tThank you for using iFriend!");

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
    
    //=====================[05]Methods related to SORT CONTACTS option=======================
    //Printing the list contacts options and take the user input
    public static void listContacts(int option){
        clearConsole();
        sortContactsPrint();
        sortContactOptionSelect();

    }

    //======(02)sortByBirthday============
    public static void SortingByBirthday(){
        clearConsole();
        listByBirthdayPrint();
        listByHeaderPrint();

        int n = birthday.length;
        
        // Bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (birthday[j].compareTo(birthday[j + 1]) > 0) {
                    // Swap CID
                    String tempCID = contactID[j];
                    contactID[j] = contactID[j + 1];
                    contactID[j + 1] = tempCID;
                    
                    // Swap names
                    String tempName = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = tempName;
                    
                    // Swap tpNumber
                    String tempTP = tpNumber[j];
                    tpNumber[j] = tpNumber[j + 1];
                    tpNumber[j + 1] = tempTP;

                    // Swap compnay
                    String tempCom = company[j];
                    company[j] = company[j + 1];
                    company[j + 1] = tempCom;

                    // Swap salaries
                    double tempSalary = salary[j];
                    salary[j] = salary[j + 1];
                    salary[j + 1] = tempSalary;
                    
                    // Swap birthdays
                    String tempBirthday = birthday[j];
                    birthday[j] = birthday[j + 1];
                    birthday[j + 1] = tempBirthday;


                }
            }
        }

        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.printf("| %-12s | %-8s | %-14s | %-10s | %-10.2f | %-10s |%n", contactID[i], name[i], tpNumber[i],
                    company[i], salary[i], birthday[i]);
        }
        System.out.println("+--------------+----------+----------------+------------+------------+------------+");

        Scanner input = new Scanner(System.in);
        System.out.print("Do you want to go to Home Page (Y/N) : ");
        String yn = input.next();
        if (yn.equalsIgnoreCase("Y")){
            clearConsole();
            homePage();
        }else if(yn.equalsIgnoreCase("N")){
            clearConsole();
        }

    }

    public static void listByBirthdayPrint(){
        System.out.println("\t\t+---------------------------------------------------+");
        System.out.println("\t\t|             LIST Contact by Birthday              |");
        System.out.println("\t\t+---------------------------------------------------+");  
    }

    //======(02)sortBySalary============
    public static void SortingBySalary(){
        clearConsole();
        listBySalaryPrint();
        listByHeaderPrint();

        int n = salary.length;
        
        // Bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (salary[j] > salary[j + 1]) {
                    // Swap CID
                    String tempCID = contactID[j];
                    contactID[j] = contactID[j + 1];
                    contactID[j + 1] = tempCID;
                    
                    // Swap names
                    String tempName = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = tempName;
                    
                    // Swap tpNumber
                    String tempTP = tpNumber[j];
                    tpNumber[j] = tpNumber[j + 1];
                    tpNumber[j + 1] = tempTP;

                    // Swap compnay
                    String tempCom = company[j];
                    company[j] = company[j + 1];
                    company[j + 1] = tempCom;

                    // Swap salaries
                    double tempSalary = salary[j];
                    salary[j] = salary[j + 1];
                    salary[j + 1] = tempSalary;
                    
                    // Swap birthdays
                    String tempBirthday = birthday[j];
                    birthday[j] = birthday[j + 1];
                    birthday[j + 1] = tempBirthday;


                }
            }
        }

        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.printf("| %-12s | %-8s | %-14s | %-10s | %-10.2f | %-10s |%n", contactID[i], name[i], tpNumber[i],
                    company[i], salary[i], birthday[i]);
        }
        System.out.println("+--------------+----------+----------------+------------+------------+------------+");

        Scanner input = new Scanner(System.in);
        System.out.print("Do you want to go to Home Page (Y/N) : ");
        String yn = input.next();
        if (yn.equalsIgnoreCase("Y")){
            clearConsole();
            homePage();
        }else if(yn.equalsIgnoreCase("N")){
            clearConsole();
        }

    }
    
    public static void listBySalaryPrint(){
        System.out.println("\t\t+---------------------------------------------------+");
        System.out.println("\t\t|               LIST Contact by Salary              |");
        System.out.println("\t\t+---------------------------------------------------+");  
    }
    
    
    
    //======(01)sortByName============
    public static void SortingByName(){
        clearConsole();
        listByNamePrint();
        listByHeaderPrint();

        int n = name.length;
        
        // Bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (name[j].compareTo(name[j + 1]) > 0) {
                    // Swap CID
                    String tempCID = contactID[j];
                    contactID[j] = contactID[j + 1];
                    contactID[j + 1] = tempCID;
                    
                    // Swap names
                    String tempName = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = tempName;
                    
                    // Swap tpNumber
                    String tempTP = tpNumber[j];
                    tpNumber[j] = tpNumber[j + 1];
                    tpNumber[j + 1] = tempTP;

                    // Swap compnay
                    String tempCom = company[j];
                    company[j] = company[j + 1];
                    company[j + 1] = tempCom;

                    // Swap salaries
                    double tempSalary = salary[j];
                    salary[j] = salary[j + 1];
                    salary[j + 1] = tempSalary;
                    
                    // Swap birthdays
                    String tempBirthday = birthday[j];
                    birthday[j] = birthday[j + 1];
                    birthday[j + 1] = tempBirthday;


                }
            }
        }

        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.printf("| %-12s | %-8s | %-14s | %-10s | %-10.2f | %-10s |%n", contactID[i], name[i], tpNumber[i],
                    company[i], salary[i], birthday[i]);
        }
        System.out.println("+--------------+----------+----------------+------------+------------+------------+");

        Scanner input = new Scanner(System.in);
        System.out.print("Do you want to go to Home Page (Y/N) : ");
        String yn = input.next();
        if (yn.equalsIgnoreCase("Y")){
            clearConsole();
            homePage();
        }else if(yn.equalsIgnoreCase("N")){
            clearConsole();
        }

    }

    //Header of the sorting table
    public static void listByHeaderPrint(){
        System.out.println("+--------------+----------+----------------+------------+------------+------------+");
        System.out.println("|  Contact ID  |   Name   |  Phone Number  |   Company  |   Salary   |  Birthday  |");
        System.out.println("+--------------+----------+----------------+------------+------------+------------+");
    }

    public static void listByNamePrint(){
        System.out.println("\t\t+---------------------------------------------------+");
        System.out.println("\t\t|               LIST Contact by Name                |");
        System.out.println("\t\t+---------------------------------------------------+");  
    }
    
    public static void sortContactsPrint(){
        System.out.println("+---------------------------------------------------+");
        System.out.println("|                    SORT Contact                   |");
        System.out.println("+---------------------------------------------------+");         
        System.out.println("\n");
        System.out.println("\t[01] Sorting by Name");
        System.out.println("\t[02] Sorting by Salary");
        System.out.println("\t[03] Sorting by Birthday");
        System.out.println("\n");
    }
    
    //Method for taking the user input in the sorting menue
    public static void sortContactOptionSelect(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an option to continue -> ");
        int opS = input.nextInt();

        switch(opS){
            case 1: SortingByName(); break;
            case 2: SortingBySalary(); break;
            case 3: SortingByBirthday(); break;
        }
    }
    
    //=====================[04]Methods related to SEARCH CONTACTS option=======================
    
    public static void searchContactsPrint(){
        System.out.println("+---------------------------------------------------+");
		System.out.println("|                  SEAECH Contact                   |");
		System.out.println("+---------------------------------------------------+");

    }

    public static void searchContacts(int option){
        clearConsole();
        L1:do{
            Scanner input = new Scanner(System.in);            
            searchContactsPrint();
            String userIn = getUserInput();
            printSearchedContact(userIn);
            System.out.println("\n");
            System.out.print("Do you want to search another contact (Y/N) -> ");
            String yn = input.next();
            if(yn.equalsIgnoreCase("Y")){
                clearConsole();
                continue L1;
            }else if(yn.equalsIgnoreCase("N")){
                clearConsole();
                homePage();
                break;
            }
        }while(true);
    }


    //=====================[03]Methods related to DELETE CONTACTS option=======================
    
    public static void deleteContacts(int option) {
        Scanner input = new Scanner(System.in);


        L8:do {
            clearConsole();
            deleteContactsPrint();
            // Take the user input to search the contact
            System.out.print("Search Contact by Name or Phone Number - ");
            String userInput = input.next();

            // Search the contact and store the index of that contact
            int index = searchContacts(userInput);

            // Checking the validation of the input
            if (index != -1) {
                printUserSearchedContact(index);
            } else {
                System.out.println("\t\tNo contact found for " + userInput + " ...");
                System.out.print("Do you want to Search again (Y/N) : ");
                String yn = input.next();
                if (yn.equalsIgnoreCase("Y")) {
                    clearConsole();
                    continue L8;
                } else if (yn.equalsIgnoreCase("N")) {
                    clearConsole();
                    homePage();
                    break;
                }
            }

            System.out.print("Do you want to delete this Contact (Y/N) : ");
            String yn = input.next();
            if (yn.equalsIgnoreCase("Y")) {
                deleteContDetails(index);
                System.out.println("\tContact has been deleted successfully...\n");
                System.out.print("Do you want to delete another Contact (Y/N) : ");
                yn = input.next();
                if (yn.equalsIgnoreCase("Y")) {
                    clearConsole();
                    continue L8;
                } else if (yn.equalsIgnoreCase("N")) {
                    clearConsole();
                    break;
                }
            }else{
                clearConsole();
                homePage();
            }
        } while (true);

    }

    public static int searchContacts(String userInput) {
        for (int i = 0; i < name.length; i++) {
            if (name[i].equalsIgnoreCase(userInput) || tpNumber[i].equals(userInput)) {
                return i;
            }
        }
        return -1;
    }

    public static void deleteContDetails(int index) {
        deleteCID(index);
        deleteName(index);
        deleteTPNumber(index);
        deleteCompany(index);
        deleteSalary(index);
        deleteBday(index);
    }

    public static void deleteCID(int index) {
        String[] temp = new String[contactID.length - 1];

        for (int i = 0; i < index; i++) {
            temp[i] = contactID[i];
        }
        for (int i = index; i < temp.length; i++) {
            temp[i] = contactID[i + 1];
        }
        contactID = temp;
    }

    public static void deleteName(int index) {
        String[] temp = new String[name.length - 1];
        for (int i = 0; i < index; i++) {
            temp[i] = name[i];
        }
        for (int i = index; i < temp.length; i++) {
            temp[i] = name[i + 1];
        }
        name = temp;
    }

    public static void deleteTPNumber(int index) {
        String[] temp = new String[tpNumber.length - 1];

        for (int i = 0; i < index; i++) {
            temp[i] = tpNumber[i];
        }
        for (int i = index; i < temp.length; i++) {
            temp[i] = tpNumber[i + 1];
        }
        tpNumber = temp;
    }

    public static void deleteCompany(int index) {
        String[] temp = new String[company.length - 1];
        for (int i = 0; i < index; i++) {
            temp[i] = company[i];
        }
        for (int i = index; i < temp.length; i++) {
            temp[i] = company[i + 1];
        }
        company = temp;
    }

    public static void deleteSalary(int index) {
        double[] temp = new double[salary.length - 1];

        for (int i = 0; i < index; i++) {
            temp[i] = salary[i];
        }
        for (int i = index; i < temp.length; i++) {
            temp[i] = salary[i + 1];
        }
        salary = temp;
    }

    public static void deleteBday(int index) {
        String[] temp = new String[birthday.length - 1];
        for (int i = 0; i < index; i++) {
            temp[i] = birthday[i];
        }
        for (int i = index; i < temp.length; i++) {
            temp[i] = birthday[i + 1];
        }
        birthday = temp;
    }

    public static void deleteContactsPrint() {
        System.out.println("+---------------------------------------------------+");
        System.out.println("|                  DELETE Contact                   |");
        System.out.println("+---------------------------------------------------+");
    }

   
    //=====================[02]Methods related to UPDATE option=======================
    
    public static void updateContactsPrint(){
        System.out.println("+---------------------------------------------------+");
		System.out.println("|                  UPDATE Contact                   |");
		System.out.println("+---------------------------------------------------+");

    }
   
    public static void updateContacts(int option){
        clearConsole();
        updateContactsPrint();

        String getUserIn = getUserInput();
        //Search and print the user input contact
        printSearchedContact(getUserIn);

        updateContactOptionsPrint();

        //Getting the index of the user serached array
        int index = returnIndex(getUserIn);
        
        updateContactOptionSelect(index);
   
    }

    public static String getUserInput(){
        Scanner input = new Scanner(System.in);            
        System.out.print("Search Contact by Name or Phone Number - ");
        String userInput = input.next();
        return userInput;
    }
    
    //Take the user input
    //Search the name and store the index in a variable
    //If the index is valid print or else take another input by the user
    public static void printSearchedContact(String getUserIn){
        Scanner input = new Scanner(System.in);
            int index = -1;
            for(int i=0; i<name.length; i++){
                if( name[i].equalsIgnoreCase(getUserIn) || tpNumber[i].equals(getUserIn)){
                    index = i;
                }
            }
    
            if(index != -1){
                printUserSearchedContact(index);
            }else{
                System.out.println("\t\tNo contact found for " + getUserIn + " ...");
                System.out.print("Do you want to Search again (Y/N) : ");
                String yn = input.next();
                if(yn.equalsIgnoreCase("Y")){
                    updateContacts(index);
                }else if(yn.equalsIgnoreCase("N")){
                    homePage();
                }
            }         
     }

    public static void updateContactOptionsPrint(){
        System.out.println("\tWhat do you want to update...\n");
        System.out.println("\t[01] Name");
        System.out.println("\t[02] Phone Number");
        System.out.println("\t[03] Comapny Name");
        System.out.println("\t[04] Salary");
        System.out.println("\n");
    }

    public static void updateContactOptionSelect(int index){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an option to continue -> ");
        int opS = input.nextInt();

        switch(opS){
            case 1: nameUpdate(index); break;
            case 2: phoneNumberUpdate(index); break;
            case 3: companyNameUpdate(index); break;
            case 4: sarlaryUpdate(index); break;
        }
    }

    //====(04)Update the Salary Method======
    public static void sarlaryUpdate(int index){
        Scanner input = new Scanner(System.in);
        System.out.println("\nUpdate the Salary");
        System.out.println("====================");
        //Input sal, validate and update
        addUpdatedSalary(index);
        System.out.println("\n");
        System.out.println("\tSalary has been updated successfully...");        
        System.out.println("\n");
        System.out.print("Do you want to update another contact (Y/N) -> ");
        String yn = input.next();
        if(yn.equalsIgnoreCase("Y")){
            clearConsole();
            updateContacts(index);
        }else if((yn.equalsIgnoreCase("N"))){
            clearConsole();
            homePage();
        }
    }

    public static void addUpdatedSalary(int index){
        L2:do{
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the updated salary\t: ");
            double sal = input.nextDouble();
            boolean SALval = isSalValid(sal);

            if(isSalValid(sal)){
                salary[index]=sal;
                break;
            }else{
                System.out.println("\t\tInvalid input...");
                System.out.print("Do you want to update the salary again (Y/N) : ");
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
    
    //====(03)Update the Compnay Name Method======
    public static void companyNameUpdate(int index){
        Scanner input = new Scanner(System.in);
        System.out.println("\nUpdate the Compnay Name");
        System.out.println("==========================");
        System.out.print("Input new compnay name - ");
        String getUserInput = input.next();
        company[index] = getUserInput;
        System.out.println("\n");
        System.out.println("\tComany name has been updated successfully...");
        System.out.println("\n");
        System.out.print("Do you want to update another contact (Y/N) -> ");
        String yn = input.next();
        if(yn.equalsIgnoreCase("Y")){
            clearConsole();
            updateContacts(index);
        }else if((yn.equalsIgnoreCase("N"))){
            clearConsole();
            homePage();
        }
    }

    //====(02)Update Phone Number Method======
    public static void phoneNumberUpdate(int index){
        Scanner input = new Scanner(System.in);
        System.out.println("\nUpdate Phone Number");
        System.out.println("=======================");
        //Add new tp number and validate
        addUpdatedPhoneNumber(index);
        System.out.println("\n");
        System.out.println("\tPhone number has been updated successfully...");        
        System.out.println("\n");
        System.out.print("Do you want to update another contact (Y/N) -> ");
        String yn = input.next();
        if(yn.equalsIgnoreCase("Y")){
            clearConsole();
            updateContacts(index);
        }else if((yn.equalsIgnoreCase("N"))){
            clearConsole();
            homePage();
        }
    }
    

    public static void addUpdatedPhoneNumber(int index){
        Scanner input = new Scanner(System.in);
        L1:do{
            System.out.print("Enter new Phone Number\t: ");
            String phoneNumber = input.next();
            boolean PNvalid = isValidPhoneNumber(phoneNumber);
    
            if(isValidPhoneNumber(phoneNumber)){
                tpNumber[index]=phoneNumber;
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
        
        
        
    //====(01)Update Name Method======
    public static void nameUpdate(int index){
        Scanner input = new Scanner(System.in);
        System.out.println("\nUpdate Name");
        System.out.println("===============");
        System.out.print("Input new name - ");
        String getUserInput = input.next();
        name[index] = getUserInput;
        System.out.println("\n");
        System.out.println("\tName has been updated successfully...");
        //updatedNamePrint(ind);
        System.out.println("\n");
        System.out.print("Do you want to update another contact (Y/N) -> ");
        String yn = input.next();
        if(yn.equalsIgnoreCase("Y")){
            clearConsole();
            updateContacts(index);
        }else if((yn.equalsIgnoreCase("N"))){
            clearConsole();
            homePage();
        }
        
    }

    public static int returnIndex(String userInput){
        for(int i=0; i<name.length; i++){
            if( name[i].equalsIgnoreCase(userInput) || tpNumber[i].equals(userInput)){
                return i;
            }
        }
        return -1;
    }
    
    public static void printUserSearchedContact(int index){
            System.out.println("\n");
            System.out.println("\tContact ID\t\t: " + contactID[index]);
            System.out.println("\tName\t\t\t: " + name[index]);
            System.out.println("\tPhone Number\t\t: " + tpNumber[index]);
            System.out.println("\tCompany Name\t\t: " + company[index]);
            System.out.println("\tSalary\t\t\t: " + salary[index]);
            System.out.println("\tB'Day(YYYY-MM-DD)\t: " + birthday[index]);
            System.out.println("\n");
    }
   

    public static boolean isValidSearch(int index){
        if(index != -1){
            return true;
        }
        return false;
    }
    
    
    //=====================[01]Methods related to ADD CONTACTS option=======================
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

        //String[] sProviderCode={"70","71","72","74","75","76","77","78","11","36","31","33","38","34","81","54","51","52","66","91","41","47","21","23","24","63","65","67","26","25","27","32","37","55","57","45","35"};
        //for(int i=0; i<sProviderCode.length; i++){
        //   if(phoneNumber.substring(1, 3) != sProviderCode[i]){
        //   }
        //    return false;
        //}

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

    public static void printCompanyName(){
        Scanner input = new Scanner(System.in);
        System.out.print("Compnay\t\t\t: ");
        String comp = input.next();
        addCompany(comp);  
    }

    //Extend the salary array
    public static void extendSalaryArray(){
        int lengthSal = salary.length;
        double[] tempSal = new double[lengthSal+1];
        for(int i=0; i<lengthSal; i++){
            tempSal[i]=salary[i];
        }
        salary=tempSal;
    }

    //Add the sarlary to the array
    public static void addSalary(double sal){
        extendSalaryArray();
        salary[salary.length-1]=sal;
    }

    //Input the salary and print it after validating
    public static void printSalary(){
        L2:do{
            Scanner input = new Scanner(System.in);
            System.out.print("Salary\t\t\t: ");
            double sal = input.nextDouble();
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
    public static boolean isSalValid(double sal){
        if(sal<0){
            return false;
        }
        return true;
    }

    //Extend birthday array
    public static void extendBirthDayArray(){
        int lengthBday = birthday.length;
        String[] tempBday = new String[lengthBday+1];
        for(int i=0; i<lengthBday; i++){
            tempBday[i]=birthday[i];
        }
        birthday=tempBday;
    }

    //Add the birthday to the array
    public static void addBirthday(String bday){
        extendBirthDayArray();
        birthday[birthday.length-1] = bday;
    }
 
    //Input the birthday and store it after validating
    public static void printBirthday(){
        Scanner input = new Scanner(System.in);
        L2:do{
            System.out.print("B'Day(YYYY-MM-DD)\t: ");
            String bday = input.next();
            boolean BDval = isBdayValid(bday);
            if(isBdayValid(bday)){
                addBirthday(bday);
                System.out.println("\tContact has been added successfully..");
                System.out.print("Do you want to add another Contact (Y/N) : ");
                String yn = input.next();
                if(yn.equalsIgnoreCase("Y")){
                    clearConsole();
                    addContacts(0);
                    break;
                }else if(yn.equalsIgnoreCase("N")){
                    clearConsole();
                    homePage();
                    break;
                }
            }else{
                System.out.println("\t\tInvalid birthday...");
                System.out.print("Do you want to add birthday again (Y/N) : ");
                String yn = input.next();
                if(yn.equalsIgnoreCase("Y")){
                    System.out.print("\033[3A");
                    System.out.print("\033[0J");
                    continue L2;
                }else if((yn.equalsIgnoreCase("N"))){
                    clearConsole();
                    homePage();
                    break;
                }
            }
        }while(true);

    }
    
    // Validating the birthday
    public static boolean isBdayValid(String bday) {
        // Isolating the string related to year, month, and day (from the user input)
        String y = bday.substring(0, 4);
        String m = bday.substring(5, 7);
        String d = bday.substring(8, 10);

        // Converting the string to integers
        int yy = Integer.parseInt(y);
        int mm = Integer.parseInt(m);
        int dd = Integer.parseInt(d);

        // Taking the current year, month, and the day
        LocalDate currentDate = LocalDate.now();

        int year = currentDate.getYear();
        int month = currentDate.getMonthValue();
        int day = currentDate.getDayOfMonth();

        if(bday.length() != 10 || bday.charAt(4) != '-' || bday.charAt(7) != '-') {
            return false;
        }else if (yy < 1800 || yy > year) {
            return false;
        }else if (mm > month || mm > 12 || mm < 1) {
            return false;
        }else if (dd > day || dd > 31 || dd < 1) {
            return false;
        }else if (mm == 2 && dd == 29 && !isLeapYear(yy)) { // Check for February 29th and non-leap year
            return false;
        }else if (mm == 4 || mm == 6 || mm == 9 || mm == 11) { // Check for months with 30 days
            return dd <= 30;
        }

        return true;
    }

    // Check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return year % 4 == 0;
    }


    //[01]Add Contacts Option
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
        printBirthday();  
    }


}



