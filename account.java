
public class account {
	
	static Double amounts=100.0;
	
	public void Deposit(Double amount)
	{
		amounts=amounts+amount;
		System.out.println("after deposit"+amounts);
		
	}
	
	public void WithDraw(Double amount)
	{
		amounts=amounts-amount;
		System.out.println("after withdrawals:"+amounts);
		
	}

	
	public void undo()
	{
		System.out.println("after undo"+amounts);
	}
}
