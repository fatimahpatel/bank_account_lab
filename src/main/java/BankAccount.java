public class BankAccount {
    String firstName;
    String lastName;
    private String dateOfBirth;
    private int accountNumber;
    int balance;
    public BankAccount(String firstName, String lastName,String dateOfBirth, int accountNumber, int balance){ //constructor
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    int deposit(){
        return this.balance;

    }
}
