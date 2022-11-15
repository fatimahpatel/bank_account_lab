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


    void deposit(int balance){
        System.out.println("You have this much money in your account: " + balance);

    }
}
