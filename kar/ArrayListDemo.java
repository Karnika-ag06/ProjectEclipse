import java.util.*;
class Employee
{
  int id;
  String name;
  String address;
  int sal;
      
      Employee(int id,String name,String address,int sal)
      {
      this.id=id;
      this.name=name;
      this.address=address;
      this.sal=sal;
      }
 public String toString()
 {
 return id+" "+name+" "+address+" "+sal;
 
 
 }
}
class ArrayListDemo
  {
  public static void main(String[] args)
  {
  ArrayList<Employee> e= new ArrayList<>();
  Scanner sc=new Scanner(System.in);
  
  for(int i=0;i<2;i++){
  System.out.println("enter ur id ,ur name,ur address and ur salary");
 
  int id1=sc.nextInt();
  String str=sc.next();
  String add=sc.next();
  int salary=sc.nextInt();
  
  e.add(new Employee(id1,str,add,salary));
  }
       Iterator<Employee> itr=e.iterator();
        System.out.println("=======list of person=====\n");
        
        while(itr.hasNext())
        {
        Employee e1=itr.next();
        System.out.println(e1);
        }
      
  System.out.println("\nenter the id and name u want to search\n");
        int idno=sc.nextInt();
        String name1=sc.next();
        Iterator<Employee> itr1=e.iterator();
        
        while(itr1.hasNext())
        {
        Employee emp=itr1.next();
      if((idno==emp.id) && (name1.equals(emp.name))){
      System.out.println("found");}
      else {
      System.out.println("not found");
                  }
         }
     }
}

      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      