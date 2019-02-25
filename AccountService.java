import java.util.Stack;

public class AccountService {
	
	
	Stack<operation> lastop=new Stack<operation>();
	private operation operation;
	
	account account=new account();
	
	
	
	public void withdraw(Double amount)
	{
		account.WithDraw(amount);
		operation=new withDraw(amount);
		lastop.push(operation);
		
	}
	
	
	public void Deposit(Double amount)
	{
	  account.Deposit(amount);
	  operation=new Deposit(amount);
	  lastop.push(operation);	
	}
	
	
	public void Undo()
	{
		operation=lastop.pop();
		operation.undo(operation.amounts);
		account.undo();
		
	}

}
