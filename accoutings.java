import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class accoutings {
	
	AccountService AccountService=new AccountService();
	
	public static void main(String[] args) throws NumberFormatException, IOException
	{   
		accoutings accoutings=new accoutings();
		System.out.println("Enter your Option");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Double amount=Double.parseDouble(br.readLine());
		accoutings.Deposit(amount);
		
		
		accoutings.Deposit(amount);
		accoutings.undo();
		accoutings.undo();
		
	}
	
		
	
	public void Deposit(Double amount)
	{
		AccountService.Deposit(amount);
		
	}
    
	public void withdraw(Double amount)
	{
		AccountService.withdraw(amount);
	}
	
	public void undo()
	{
		AccountService.Undo();
		
	}
}
