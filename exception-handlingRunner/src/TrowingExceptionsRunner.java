class Money {
	private int amount;
	private String currency;

	public Money(int amount, String currency) {
		super();
		this.amount = amount;
		this.currency = currency;
	}

	public void sumMoney(Money that) throws CurrenciesMatchExceptions {
		if (!this.currency.equals(that)) {
			// throw new RuntimeException("currencies don't match");
			throw new CurrenciesMatchExceptions("currencies don't match");
		} else
			this.amount = this.amount + that.amount;
	}

	@Override
	public String toString() {
		return currency + " " + amount;
	}

}

class CurrenciesMatchExceptions extends Exception {
	public CurrenciesMatchExceptions(String msg) {
		super(msg);
	}
}

public class TrowingExceptionsRunner {
	public static void main(String[] args) throws CurrenciesMatchExceptions {

		Money money1 = new Money(10, "USD");
		Money money2 = new Money(20, "EUR");
		money1.sumMoney(money2);
		System.out.println(money1);

	}
}
