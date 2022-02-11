public class BankAccountTest {
    
    public static void main(String[] args) {
        
        BankAccount customer = new BankAccount("Steven");
        customer.depositChecking(150.50);
        customer.depositSaving(75.00);
        customer.withdrawChecking(50.00);
        System.out.println("Checking balance: " + customer.getChecking());
        System.out.println("Saving balance: " + customer.getSaving());
        System.out.println("Total" + customer.getTotal());
        System.out.println(customer.numbersOfAccounts);
        

        
        BankAccount customer2 = new BankAccount("Steve");
        customer2.depositChecking(800.50);
        customer2.depositSaving(100.00);
        customer2.withdrawChecking(2000.20);
        System.out.println("Checking balance: " + customer2.getChecking());
        System.out.println("Saving balance: " + customer2.getSaving());
        System.out.println(customer2.getTotal());
        
    }
}