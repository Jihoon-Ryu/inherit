package inherit;

public class CustomerAction {
  public static void main(String[] args) {
	  
	  Customer customerLee = new Customer(10110, "�̾���");
	  
	  VIPCustomer VIPJH = new VIPCustomer(77777, "JH");
  
      System.out.println(customerLee.showCustomerInfo());
      System.out.println(VIPJH.showCustomerInfo());
  }
}
