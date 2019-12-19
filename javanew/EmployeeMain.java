class Employee
{
int employeeId;
String employeeName;
String designation;
int basicSalary;
Employee(int employeeId,String emplyeeName,String designation,int basicSalary)
   {
      this.employeeId=employeeId;
      this.employeeName=employeeName;
      this.designation=designation;
      this.basicSalary=basicSalary;
    }
void printEmployeeDetails()
   {
      System.out.println("\n======employee details=====");
      System.out.println("employee department   : "+employeeId);
      System.out.println("employee name         : "+employeeName);
      System.out.println("employee designation  : "+designation);
      System.out.println("employee basic salary : "+basicSalary);
    }}
class Manager extends Employee
{
      Manager(int id,String name,String dsgn,int sal){
        super(id,name,dsgn,sal);
      }
       int calculateSalary(){
       return 10*basicSalary;
}
}

class Clerk extends Employee{
       Clerk(int dep,String name,String dsgn,int sal){
        super(dep,name,dsgn,sal);
        }
       int calculateSalary(){
       return 3*basicSalary;    
       }
       }
class EmployeeMain{
public static void main(String[] args){
     String s1=args[0];
     String s2=args[1];
     String s3=args[2];
     String s4=args[3];
  
     int id=Integer.parseInt(s1);
     int sal=Integer.parseInt(s4);
      
     if(s3.equals("Manager"))
     {
      Manager m=new Manager(id,s2,s3,sal);
      m.printEmployeeDetails();
      System.out.println("Salary is : "+m.calculateSalary());    
     }
     else if(s3.equals("Clerk"))
     {
      Clerk c=new Clerk(id,s2,s3,sal);
      c.printEmployeeDetails();
      System.out.println("Salary is : "+c.calculateSalary());    
     }
else
      System.out.println("you have entered wrong data");
}
}















