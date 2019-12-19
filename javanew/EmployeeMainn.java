import java.util.Scanner;
import java.util.Arrays;
class Employee implements Comparable{
    int employeeId;
    String employeeName;

Employee(int employeeId,String employeeName){
    this.employeeId=employeeId;
    this.employeeName=employeeName;
     }
    
    public String toString(){
    return employeeId+" "+employeeName;
    }
    
    /*public int compareTo(Object obj){
      int id1=employeeId;
    
    Employee e2=(Employee)obj;
    int id2=e2.employeeId;
    
    if(id1>id2) return 1;
    else if(id1<id2) return -1;
    else return 0;
    */
    public int compareTo(Object obj){
    String name1=employeeName;
   
    Employee e2=(Employee)obj;
    String name2=e2.employeeName;
   
    int r =name1.compareTo(name2);
    return r;
    }
 }
    
class EmployeeMainn{
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
    Employee[] arr={
              new Employee(102,"TEACHER"),
              new Employee(105,"EMPLOYEE"),
              new Employee(103,"STUDENT"),
              new Employee(101,"EMPLOYER"),
              new Employee(104,"ABC")};
   
   /* Employee[] arr=new Employee[5];
    
    for(int i=0;i<arr.length;i++){
    System.out.println("\nenter employeeId and employeeName");
    
    int id=sc.nextInt();
    String name=sc.next();
    
    Employee employeeobj=new Employee(id,name);
    arr[i]=employeeobj;
    }*/
    
    System.out.println("\n==========before sorting==============");
     for(int i=0;i<arr.length;i++)
    {
    System.out.println(arr[i]);
    }
    System.out.println("\n===========after sorting==============");
    
    Arrays.sort(arr); 
    for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
    }
  }
}
