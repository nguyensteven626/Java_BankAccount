import java.util.ArrayList;

public class BankAccount {
    //member variables - attributes - field 
    public String name; 
    public double checking;
    public double saving;
    // public ArrayList<Account> accounts = new ArrayList<>();
    public static int numbersOfAccounts =0;
    public static double total = 0;
    
    //constructor 
    public BankAccount(String name) {
        this.name = name;
        checking = 5;
        saving = 5;
        numbersOfAccounts++;
    }
    
    public double getChecking(){
        return checking;
    }

    public double getSaving(){
        return saving;
    }

    public void depositChecking(double amount) {
        checking += amount;
        
    }  
    
    public void depositSaving(double amount) {
        saving += amount;
    }

    public void withdrawChecking(double amount){
        if(getChecking() > amount){
            checking -= amount;
        }else {
            System.out.println("insufficient funds");
        }

    }

    public void withdrawSaving(double amount){
        if(getSaving() > amount){
            saving -= amount;
        }else {
            System.out.println("insufficient funds");
        }
        

    }

    public double getTotal() {
        double total = getChecking() + getSaving();
        return total;
    }  
}