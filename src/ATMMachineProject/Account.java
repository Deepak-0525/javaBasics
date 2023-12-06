package ATMMachineProject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

    private int accountNo = 0;
    private int pinNo =0;
    private double checkingBalance;
    private double savingBalance;


    Scanner inp = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    //set the account no
    public int setAccountNo(int accountNo){
        this.accountNo = accountNo;
        return accountNo;
    }
    public int getAccountNo(){
        return accountNo;
    }
    public int setPinNo(int pinNO){
        this.pinNo = pinNO;
        return pinNO;
    }
    public int getPinNo(){
        return pinNo;
    }

    public double getCheckingBalance(){
        return checkingBalance;
    }
    public double getSavingBalance(){
        return savingBalance;
    }

    public double calcCheckingWithdraw(double amount){
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }
    public double calcSavingWithdraw(double amount){
        savingBalance = (savingBalance - amount);
        return savingBalance;
    }
    public double calcCheckingDeposit(double amount){
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;
    }
    public double calcSavingDeposit(double amount){
        savingBalance = (savingBalance + amount);
        return savingBalance;
    }

    public void getCheckWithdrawInput(){
        System.out.println("Checking Account Balance : "+moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to withdraw from checking Account:");
        double amount = inp.nextDouble();
        if ((checkingBalance - amount)>=0){
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Account balance: "+moneyFormat.format(checkingBalance));
        }else{
            System.out.println("Balance cannot be Negative."+"\n");
        }
    }
    public void getSavingWithdrawInput(){
        System.out.println("Saving Account Balance : "+moneyFormat.format(savingBalance));
        System.out.println("Amount you want to withdraw from saving Account:");
        double amount = inp.nextDouble();
        if ((savingBalance - amount)>=0){
            calcSavingWithdraw(amount);
            System.out.println("New Saving Account balance: "+ savingBalance +"\n");
        }else{
            System.out.println("Balance cannot be Negative."+"\n");
        }
    }
    public void getCheckingDepositInput(){
        System.out.println("Checking Account Balance : "+moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to deposit from checking Account:");
        double amount = inp.nextDouble();
        if ((checkingBalance + amount)>=0){
            calcCheckingDeposit(amount);
            System.out.println("New Checking Account balance: "+moneyFormat.format(checkingBalance));
        }else{
            System.out.println("Balance cannot be Negative."+"\n");
        }
    }
    public void getSavingDepositInput(){
        System.out.println("Saving Account Balance : "+moneyFormat.format(savingBalance));
        System.out.println("Amount you want to deposit from saving Account:");
        double amount = inp.nextDouble();
        if ((savingBalance - amount)>=0){
            calcSavingWithdraw(amount);
            System.out.println("New Saving Account balance: "+moneyFormat.format(savingBalance) );
        }else{
            System.out.println("Balance cannot be Negative."+"\n");
        }
    }




}






















