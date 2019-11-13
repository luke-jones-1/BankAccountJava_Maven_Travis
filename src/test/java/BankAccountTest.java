import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTest {
    @Test
    public void defaultBalance(){
        BankAccount account1 = new BankAccount();
        int balance = account1.balance;
        assertEquals(0, balance);
    }

    @Test
    public void deposit(){
        BankAccount account1 = new BankAccount();
        assertEquals("Successfully Deposited", account1.deposit(10));
        assertEquals(10, account1.balance);
    }

    @Test
    public void withdraw(){
        BankAccount account1 = new BankAccount();
        assertEquals("Successfully Withdrawn", account1.withdraw(10));
        assertEquals(-10, account1.balance);
    }
}