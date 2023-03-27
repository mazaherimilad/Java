
public class Address {
	private String line1;
	private String city;
	private String CAP;

	public Address(String line1, String city, String CAP) {
		super();
		this.line1 = line1;
		this.city = city;
		this.CAP = CAP;
	}

	@Override
	public String toString() {
		return String.format("%s, %s %s", line1, city, CAP);
	}

}