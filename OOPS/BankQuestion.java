package OOPS;
class Bank{
    private int accNo;
    private String name;
    private int balance;
    private String password;

    Bank(int accNo,String name,int balance,String password){
        this.accNo=accNo;
        this.name=name;
        this.balance=balance;
        this.password=password;
    }
    private void deposit(int amount){
        balance=balance+amount;
        System.out.println("Amount Deposited Successfully "+balance);
    }
    private void withdraw(int amount){
       balance=balance-amount;
       System.out.println("Amount Withdrawn Successfully ");
    }

    public int getAccNo() {
        return accNo;
    }
    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;

}
public class BankQuestion {
    public static void main(String[] args) {
        Bank b=new Bank(123,"Dheeraj",10000,"dheeraj123");
        System.out.println(b.getAccNo());
        b.deposit(10000);
        b.withdraw(5000);
    }
    
}}
