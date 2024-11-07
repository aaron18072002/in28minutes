package exception_handling;

class Amount {
	private String currency;
	private int amount;	
	
	public Amount(String currency, int amount) {
		this.currency = currency.toUpperCase();
		this.amount = amount;
	}
	
	public void add(Amount amount) throws Exception {
		if(!amount.currency.equals(this.currency)) {
			throw new Exception
				("Currencies arent match " + this.currency + " and " + amount.currency);
		}
		this.amount += amount.amount;
	}
	
	@Override
	public String toString() {
		return String.format("%d %s", this.amount, this.currency);
	}
}

public class AmountRunner {
	public static void main(String[] args) throws Exception {
		Amount usdAmount = new Amount("USD",50);
		Amount euroAmount = new Amount("EUR",30);
		usdAmount.add(euroAmount);
	}
}
