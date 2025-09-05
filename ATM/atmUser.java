//Program to create ATM system using java program
import java.util.*;
class atmUser
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		ATM a=new ATM(0);
		int trig = 1;
		while(trig==1)
		{
			System.out.println("\n\nMain Menu -\n1 : Withdraw");
			System.out.println("2 : Deposit");
			System.out.println("3 : Checkbalance");
			System.out.print("4 : Exit\nEnter your choice : ");
			int option;
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
							System.out.println("Insufficient balance, Unable to withdraw\n");
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
							System.out.println("Unable to deposit, Deposit amount must not exceed 100000\n");
						}
						else if(depositAmount<0)
						System.out.println("Invalid amount entered");
						else
						{
							a.deposit(depositAmount);
						}
						break;
					}
				case 3:
					{	
						System.out.println("Balance : "+a.checkBalance()+" Rs");
						break;
					}
				case 4:
					{
						System.out.println("Thank You For Visiting!");
						trig=0;
						break;
					}
				default:
					{
						System.out.println("Invalid option, Try again!");
					}
			}
		}
	}
}				
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
		System.out.println("Deposited Succesfuly");
	}
	public void withdraw(double w)
	{
		balance-=w;
		System.out.println("Withdrawn Successfully");
	}
}
//Completed 
