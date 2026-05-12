final class BankAccount {
	private final String accountNumber;
	private final String holderName;
	private final double balance;
	
	static {
		System.out.println("============ SNOW BANK =============");
	}
	
	{
		System.out.println("------------ New user ------------");
	}
	
	BankAccount() {
		this("14369867", "Natasha Ringane", 1145.3);
	}
	
	BankAccount(String an) {
		this(an, "Isabella Sindane", 186.4);
	}
	
	BankAccount(String an, String hn, double b) {
		this.accountNumber = an;
		this.holderName = hn;
		this.balance = b;
		System.out.println("Holder Name: " + hn + " |" +" Account Number: " + an + " |" + " Balance: R" + b);
		System.out.println(" ");
	}
}