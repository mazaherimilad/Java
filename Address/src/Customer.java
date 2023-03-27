public class Customer {
	// State
	private String name;
	private Address homeAddress;
	private Address workAddress;

	// Create

	public Address getHomeAddress() {
		return homeAddress;
	}

	public Customer(String name, Address homeAddress) {
		super();
		this.name = name;
		this.homeAddress = homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}

	@Override
	public String toString() {
		return String.format("Customer [%s] lives at [%s], works at [%s]", name, homeAddress, workAddress);
	}
}
