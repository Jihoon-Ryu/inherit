package inherit;

public class VIPCustomer extends Customer {
	    //�Ӽ�		
		private int agentID;
		private double saleRatio;

		//������
		public VIPCustomer(int customerID, String customerName) {
			this.customerID = customerID;
			this.customerName = customerName;
			customerGrade = "VIP";
			bonusRatio = 0.01;
			saleRatio = 0.1;
		}
}
		
		