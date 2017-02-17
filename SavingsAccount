
public class SavingsAccount {
    //properties:

    private static double annualInterestRate ;
    private double accountBalance;

    //constructor
    public SavingsAccount(double balance,int interestRate){
                this.accountBalance = balance;
                annualInterestRate = interestRate;
            }

    public double calculateMonthlyInterest(){
                double monthlyInterest;
                monthlyInterest=   accountBalance * (annualInterestRate / 100) / 12;

                return monthlyInterest;
              }

    public static void modifyInterestRate(double newRate)   //set annual interest rate
            {
                annualInterestRate = newRate;
            }


    public double getAccountBalance()
    {
       return this.accountBalance ;

    }

    public void setAccountBalance(double balance)
    {
        accountBalance =balance;
    }

}
