import java.text.DecimalFormat;

public class SavingsAccount {

    static double annualInterestRate;
    private double savingsBalance;


    public void setSavingsBalance(double x)
    {
        this.savingsBalance = x;
    }
    public double getSavingsBalance()
    {

        return savingsBalance;

    }



    public double calculateMonthlyInterest()
    {
        double monthlyInterest;


        monthlyInterest = (savingsBalance * (annualInterestRate/100)) / 12;
        savingsBalance = savingsBalance + monthlyInterest;


        return savingsBalance;
    }

    public static int modifyInterestRate(int x)
    {
        annualInterestRate = x;
        return x;
    }


}

