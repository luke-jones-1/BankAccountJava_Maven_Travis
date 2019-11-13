public class BankAccount {
    public int balance = 0;

    public String deposit(int i){
        balance += i;
        return "Successfully Deposited";
    }

    public String withdraw(int i){
        balance -= i;
        return "Successfully Withdrawn";
    }
}
