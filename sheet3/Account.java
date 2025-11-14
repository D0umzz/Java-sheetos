package sheet3;

import java.time.LocalDate;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private LocalDate dateCreated;
    public Account(){
        dateCreated= LocalDate.now();
    }
    public Account(int id,double balance,double annualInterestRate){
        this();
        this.id=id;
        this.balance=balance;
        this.annualInterestRate=annualInterestRate;
    }

    public void setDateCreated(int day,int month,int year) {
        dateCreated= LocalDate.of(year,month,day);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }
    public double getMonthlyInterestRate() {
        return annualInterestRate/12;
    }

    public void withdraw(double withdrawAmount) {
        balance-=withdrawAmount;
    }
    public void deposit(double depositAmount) {
        balance+=depositAmount;
    }
}
