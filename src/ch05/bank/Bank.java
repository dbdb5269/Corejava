package ch05.bank;

public class Bank{
	private Customer[] customers;
	private int custNum;
	public Bank(){
		customers = new Customer[10];
		custNum = 0;
	}
	public void addCustomer(Customer customer){
		customers[custNum]=customer;
		custNum++;

	}
	public Customer getCustomer(int index){
		return customers[index];
	}
	public int getCustomerNum(){
		return custNum;
	}
}