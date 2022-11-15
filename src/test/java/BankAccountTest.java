import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    @Test //this is where my issue is!!
    public void testDeposit(){
        BankAccount bankAcc = new BankAccount()
        //int actual = bankAccount.deposit(bankAccount.getBalance());
        //int expected = bankAccount.getBalance() + depositNum;
        assertThat()
    }
}



