public class BankAccount {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int accountNumber;
    private int balance;
    public BankAccount(String firstName, String lastName,String dateOfBirth, int accountNumber, int balance){ //constructor
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //Getters and Setters

    //getter and setter for firstName
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    //getter and setter for lastName
    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    //getter and setter for dateOfBirth
    public String getDateOfBirth(){
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    //getter and setter for AccountNumber
    public int getAccountNumber(){
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    //getter and setter for balance
    public int getBalance(){
        return this.balance;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    //end of getters and setters

    //method for deposit
    public int deposit(int balance){
        int this.balance = (int balance + 5);

    }

}

