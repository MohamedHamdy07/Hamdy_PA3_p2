import java.text.DecimalFormat;
import java.util.Scanner;

public class savingsAccountTest extends SavingsAccount{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i;
        DecimalFormat form = new DecimalFormat("#.##");


        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();
        modifyInterestRate(4);



        saver1.setSavingsBalance(2000);
        saver2.setSavingsBalance(3000);

        for(i = 1; i<=12; i++)
        {
            saver1.calculateMonthlyInterest();
        }
        for(i = 1; i<=12; i++)
        {
            saver2.calculateMonthlyInterest();
        }

        System.out.println("Saver1's final balance after 1 year with an interest rate of " + annualInterestRate+ " is " +form.format(saver1.getSavingsBalance()));
        System.out.println("Saver2's final balance after 1 year with an interest rate of " + annualInterestRate+ " is " +form.format(saver2.getSavingsBalance()));

        System.out.println("Changing interest rate");

        modifyInterestRate(5);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();




        System.out.println("Saver1's new balance after 1 month with the new interest rate of " + annualInterestRate+ " is " + form.format(saver1.getSavingsBalance()));
        System.out.println("Saver2's new balance after 1 month with the new interest rate of " + annualInterestRate+ " is " + form.format(saver2.getSavingsBalance()));




    }

}

