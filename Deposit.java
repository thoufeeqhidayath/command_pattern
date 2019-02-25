
public class Deposit implements operation{

	Double amounts;
	
	Deposit(Double amount)
	{
		this.amounts=amount;
		
	}
	
	
	
	
	@Override
	public void undo(Double amount) {
		
		account account=new account();
		account.WithDraw(amounts);
				
	}

}
