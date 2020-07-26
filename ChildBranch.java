package Assignment2;

public class ChildBranch extends Bank implements BankFunction{
	
	public ChildBranch(double amt) {
		super(amt);
		// TODO Auto-generated constructor stub
	}
	public void Increment(double amt) {
		totalAmount+=amt;
		System.out.println("Increased Balance :"+totalAmount);
	}
	public void Decrement(double amt) {
		// TODO Auto-generated method stub
		totalAmount-=amt;
		System.out.println("Decreased Balance :"+totalAmount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildBranch b=new ChildBranch(5000.00);
		
		b.Increment(5000.00);
		b.Decrement(3000.00);
		
	}

}
