import java.util.Scanner;
class Account{
    long accountNo;
    String accountHolderName;
    double balance;
Account (long accountNo,String accountHolderName,double balance)
    {
      this.accountNo=accountNo;
      this.accountHolderName=accountHolderName;
      this.balance=balance;
}
void printAccountDetails()
{
   System.out.println("account no is "+accountNo);
   System.out.println("account holder name no is "+accountHolderName);
   System.out.println("balance is "+balance);
}
double getBalance()
{
    return balance;
}
}
class SavingsAccount extends Account{
   double rateOfInterest;
    
    SavingsAccount(long aNo,String Name,double balance,double roi){
    super(aNo,Name,balance);
    rateOfInterest=roi;
}
void printAccountDetails()
{
   super.printAccountDetails();
   System.out.println("rate of interest is "+rateOfInterest+ "%");
}
	double getBalance()
{
        return balance+(rateOfInterest/100);
}
}
class SalaryAccount extends Account{
 
      String companyName;
      double salary;    
SalaryAccount(long aNo,String Name,double balance,String companyName,double Salary)
{

    super(aNo,Name,balance);
    this.companyName=companyName;
    this.salary=salary;
}

void printAccountDetails()
{
   super.printAccountDetails();
   System.out.println("name of the company is "+companyName);
   System.out.println("salary withdrawn "+salary);
}
}
class Bank{
   public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
  
  System.out.println("enter the type of account you have to check details : ");
  String s1=sc.next();

 if(s1.equals("savings"))
{
  SavingsAccount obj1=new SavingsAccount(1239,"karnika",50000,7);
  obj1.printAccountDetails();
  System.out.println("salary after adding interest : "+obj1.getBalance());

}
 else if(s1.equals("salary"))
{
  SalaryAccount obj2=new SalaryAccount(28612,"dhairiya",40000,"iris software",60000);
  obj2.printAccountDetails();
}
else{
  System.out.println("you Are entering wrong data : ");
}
}
}
















