package sheet3;

public class miniProject {
    public static void main(String[] args) {
        Account account=new Account(1122,20000,0.045);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("your balance: "+account.getBalance());
        System.out.println("the monthly interest: "+account.getMonthlyInterestRate()*100+"%");
        System.out.println("the date of creation: "+account.getDateCreated());


    }
}