package Day3Task;

public class BankAccount {
	
	    private String accountHolder;
	    private double balance;

	  	    public BankAccount(String accountHolder, double initialBalance) {
	        this.accountHolder = accountHolder;
	        if (initialBalance >= 0) {
	            this.balance = initialBalance;
	        } else {
	            System.out.println("Initial balance can't be negative. Setting to 0.");
	            this.balance = 0;
	        }
	    }
	  	    
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited $" + amount);
	        } else {
	            System.out.println("Deposit amount must be positive.");
	        }
	    }
	  
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrew $" + amount);
	        } else if (amount > balance) {
	            System.out.println("Insufficient funds.");
	        } else {
	            System.out.println("Withdrawal amount must be positive.");
	        }
	    }

	    public void displayAccountInfo() {
	        System.out.println("Account Holder: " + accountHolder);
	        System.out.println("Current Balance: $" + balance);
	    }

	    public static void main(String[] args) {
	        BankAccount account = new BankAccount("John Doe", 500);

	        account.displayAccountInfo();
	        account.deposit(200);
	        account.withdraw(100);
	        account.withdraw(700); 
	        account.displayAccountInfo();
	    }
	}

