/**
 * Created by Issaco on 17/02/2017.
 */
public class Driver1 {

    public static  void main(String args[]) {
        //Test Saver 1
        testSaver1();
        //Test Saver 2
        testSaver2();
    }
    private static void testSaver1(){
        double n,bal;
        SpecialSavings saver1 = new SpecialSavings(2000,4);
        System.out.println("** SAVER 1**\n");
        // Do several deposits

        System.out.println("Deposits ");
        n=6000;
        saver1.deposit(n);
        n=3000;
        saver1.deposit(n);
        n=4200;
        saver1.deposit(n);
        double interest= saver1.calculateMonthlyInterest();

        System.out.println("Total Interest: " +interest );
        bal=saver1.getAccountBalance()+ saver1.calculateMonthlyInterest();
        System.out.println("Total Balance: " +bal );


        // A number of withdrawals
        System.out.println("\n** Withdrawals:**");
        //Do several withdrawals
        n=5000;
        saver1.withdraw(n);
        n=2000;
        saver1.withdraw(n);
        n=300;
        saver1.withdraw(n);
        System.out.println("Interest Due: " + saver1.calculateMonthlyInterest() );
        bal=saver1.getAccountBalance()+ saver1.calculateMonthlyInterest();
        System.out.println("Total Balance: " +bal );
    }
    private static void testSaver2(){
        double n,bal;
        SpecialSavings saver2 = new SpecialSavings(3000,4);


        System.out.println("** SAVER 2**\n");
        // Do several deposits
        System.out.println("Deposits ");
        n=7000;
        saver2.deposit(n);
        n=10000;
        saver2.deposit(n);
        n=200;
        saver2.deposit(n);

        System.out.println("Total Interest: " + saver2.calculateMonthlyInterest() );
        bal=saver2.getAccountBalance()+ saver2.calculateMonthlyInterest();
        System.out.println("Total Balance: " +bal );


        System.out.println("\n** Withdrawals:**");
        //Do several withdrawals
        n=5000;
        saver2.withdraw(n);
        n=8000;
        saver2.withdraw(n);
        n=506;
        saver2.withdraw(n);

        System.out.println("Interest Due: " + saver2.calculateMonthlyInterest() );
        bal=saver2.getAccountBalance()+ saver2.calculateMonthlyInterest();
        System.out.println("Total Balance: " +bal );
    }
}
