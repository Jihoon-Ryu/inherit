package inherit;

public class VIPCustomer extends Customer {
	    //紗失		
		private int agentID;
		private double saleRatio;

		//持失切
		public VIPCustomer(int customerID, String customerName) {
			this.customerID = customerID;
			this.customerName = customerName;
			customerGrade = "VIP";
			bonusRatio = 0.01;
			saleRatio = 0.1;
		}
}
		
		