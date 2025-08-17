import java.util.*;

class ATM
{
	double balance;
	
	ATM(double balance)
	{
		this.balance=balance;
	}
	public double checkBalance()
	{
		return balance;
	}
	public void deposit(double d)
	{
		balance+=d;
	}
	public void withdraw(double w)
	{
		balance-=w;
		System.out.println("Withdrawn Successfully\n");
	}

}

class atmUser
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		
		ATM a=new ATM(10000);
		int trig = 1;
		
		while(trig==1)
		{
			System.out.println("\n1 : Withdraw");
			System.out.println("2 : Deposit");
			System.out.println("3 : Checkbalance");
			System.out.println("4 : Exit");
			
			int option;

			System.out.print("Enter the option to be performed:");
			option=scan.nextInt();
		
			switch(option)
			{
				case 1:
					{
						double withdrawlAmount;

						System.out.print("Enter the withdrawl amount : ");
						withdrawlAmount = scan.nextDouble();
						
						if(withdrawlAmount>a.balance)
						{
							System.out.println("Insufficient balance\n");
						}
						else
						{
							a.withdraw(withdrawlAmount);
						}
						break;
					}
				case 2:
					{
						double depositAmount;

						System.out.print("Enter the deposit amount : ");
						depositAmount = scan.nextDouble();

						if(depositAmount>100000)
						{
							System.out.println("Deposit amount must not exceed 100000\n");
						}
						else
						{
							a.deposit(depositAmount);
						}
						break;
					}
				case 3:
					{	
						System.out.println("Balance : Rupees "+a.checkBalance());
						break;
					}
				case 4:
					{
						System.out.println("Thank You!");
						trig=0;
						break;
					}
				default:
					{
						System.out.println("Invalid option!\n");
					}
			}
		}
	}
}				









































							


























































					