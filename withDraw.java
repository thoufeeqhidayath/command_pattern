
public class withDraw implements operation{
	
	Double amounts;
	
	withDraw(Double amount)
	{
		this.amounts=amount;
	}

	
	
	
	@Override
	public void undo(Double amount) {
		
		account account=new account();
		account.Deposit(amounts);
		
	}
	
	
	

}
