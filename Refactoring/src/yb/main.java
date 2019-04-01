package yb;

public class main {
	public static void main(String args[]) {
		Customer customer1 = new Customer("YB");
		customer1.addRental(new Rental(new Movie("titanic",Movie.NEW_RELEASE),5));
		customer1.addRental(new Rental(new Movie("Bang",Movie.REGULAR),3));
		
		System.out.println(customer1.statement());
		
	}
}
