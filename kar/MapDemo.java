import java.util.*;

class Identifier{
  int id;
      Identifier(int id){
        this.id=id;
        }
  public String toString()
    {
     return id+" ";
     }
 }
   
 class Person
 {
   String name;
   int age;
   Person(String name,int age){
   this.name=name;
   this.age=age;
   }
  
   public String toString()
    {
     return name+" "+age;
     }

 public boolean equals(Object obj)
 {
 String name1=name;
 int age1=age;
  
  Person p1=(Person)obj;
  String name2=name;
  int age2=age;   
 
    if((age1==age2) && (name1.equals(name2))){
          return true;
          }
          else
          {
          return false;
          }
     }
}
  
class IdComparator implements Comparator<Identifier>
{
      public int compare(Identifier I1,Identifier I2)
      {
       int id2=I1.id;
       int id3=I2.id;
       return id2-id3;
       }
 }  
    

class MapDemo
{
    public static void main(String[] args)
      {
    
      TreeMap<Identifier,Person> tm = new TreeMap<>(new IdComparator());
      Scanner sc=new Scanner(System.in);
   
      
      for(int i=0;i<2;i++){
      System.out.println("\nenter ur id : , ur name : , and ur age");
      int id1=sc.nextInt();
      String str=sc.next();
      int age1=sc.nextInt();
       tm.put(new Identifier(id1),new Person(str,age1));
        }
        
      System.out.println(tm);
      System.out.println("SIZE :"+tm.size());
      System.out.println("isempty :"+tm.isEmpty());
     // System.out.println("containskey : "+tm.containsKey(2));
      // System.out.println("containsvalue : "+tm.containsValue("karnika"));
     String val=tm.get(1);
      System.out.println("get :"+val);
      
      System.out.println("\n========keySet========");
      set<Identifier>allKeys=tm.keySet();
      for(Identifier i=allKeys){
      System.out.println(i+ ",");
      }
      
      System.out.println("\n========values========");
      Collection<Person>allKeys=tm.value();
      for(Person i=allKeys){
      System.out.println(i+ ",");
      }
      System.out.println("\n========key-value pair========");
      set<Map.Entry>allKeysValues=tm.EntrySet();
      for(Integer i=allKeys){
      System.out.println(i+ ",");
      }
      
     
     
     
     
     
     }
}
   
            
 