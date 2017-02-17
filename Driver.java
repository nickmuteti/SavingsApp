/**
 * Created by Issaco on 17/02/2017.
 */
public class Driver {

    public static  void main(String args[]){
        SavingsAccount saver1 = new SavingsAccount(2000,4);
        SavingsAccount saver2 = new SavingsAccount(3000,4);

        System.out.println(" The interest for Saver 1 is: $" + saver1.calculateMonthlyInterest());
        System.out.println(" The interest for Saver 2 is: $"+ saver2.calculateMonthlyInterest());
        System.out.println(" Account Balance for Saver 1 is: $"+saver1.getAccountBalance());
        System.out.println("Account Balance for Saver 2 is: $"+ saver2.getAccountBalance());

        //Change interest Rate
        saver1.modifyInterestRate(5);

        saver2.modifyInterestRate(5);

        System.out.println();
        System.out.println();
        //PRINT VALUES AFTER UPDATE
        System.out.println("New Interest for Saver 1: $" + saver1.calculateMonthlyInterest());
        System.out.println("New Interest for Saver 2: $"+ saver2.calculateMonthlyInterest());

        System.out.println();
        System.out.println("New Account Balance for Saver 1: $"+saver1.getAccountBalance());
        System.out.println("New Account Balance for Saver 2: $"+ saver2.getAccountBalance());
    }
}
