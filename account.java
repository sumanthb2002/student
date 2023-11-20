package pro;
class acc{
	int acno;
	String name;
	float amount;
	void insert(int a,String n,float amt){
		acno=a;
		name=n;
		amount=amt;
	}
	void deposit(float amt){
		amount=amount+amt;
		System.out.println(amt+" is deposited");
	}
	void withdraw(float amt)
	{
		amount=amount-amt;
		System.out.println(amt+" is withdraw");
	}
	void checkbal()
	{
		System.out.println("the balance in your account is "+amount);
	}
	void info(){
	System.out.print(acno+" "+name+" "+amount);
    }
}
public class account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		acc a1=new acc();
		a1.insert(5420,"prabhu",25000);
		a1.deposit(5000);
		a1.withdraw(1000);
		a1.checkbal();
		a1.info();
		
		

	}

}
