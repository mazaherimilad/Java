
public class CustomerRunner {
	public static void main(String[] args) {
		Address homeAddress = new Address("via MOnte cengio", "Padova", "35129");
		Customer customer = new Customer("Milad", homeAddress);
		System.out.println(customer);

		Address workAddress = new Address("infocamere", "Padova", "35189");
		customer.setWorkAddress(workAddress);
		System.out.println(customer);
	}
}
