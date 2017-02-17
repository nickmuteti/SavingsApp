/**
 * Created by trye on 17/02/2017.
 */
public class SpecialSavings extends SavingsAccount{
    //constructor
     SpecialSavings(double balance, int interestRate) {
        super(balance, interestRate);
        checkInterestRate();

    }
    private void checkInterestRate(){
        if (getAccountBalance()>10000){
            //Create a special interest rate of 10%
            modifyInterestRate(10);
        }
        else
        {
            //Take it back to 4%
            modifyInterestRate(10);
        }
    }
    public void deposit (Double amount){
        setAccountBalance(getAccountBalance()+amount);
        checkInterestRate();
        System.out.println("Deposit: " + amount);
        System.out.println("New Balance: " + getAccountBalance());
    }

    public void withdraw (double amount){
        // Balance is insufficient:
        if (getAccountBalance()<amount){
            System.out.println("You have insufficient Balance");
        }
        else {
            setAccountBalance(getAccountBalance() - amount);
            checkInterestRate();
            System.out.println("Withdrawal: " + amount);
            System.out.println("New balance: " + getAccountBalance());
        }
    }
}
