import java.util.*;

class Person implements Comparable<Person>{
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
 public int compareTo(Person p2)
     {
   /*  int age1=age;
     int age2=p2.age;
     
    if(age1>age2) return 1;
    else if(age1<age2)      return -1;
    else return 0;
    }*/
    String name1=name;
    String name2=p2.name;
    return name1.equals(name2);
    }
          
public boolean equals(Object obj){
 String name1=name;
 int age1=age;
  
  Person p1=(Person)obj;
  String name2=name;
  int age2=age;   
 
    if((age1==age2) && (name1==name2)){
          return true;
          }
          else
          {
          return false;
          }
        }
 }    
 
    class CollectionDemo{
        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         List<Person> a1=new LinkedList<>();
     
        for(int i=0;i<5;i++){
        System.out.println("enter your name and age : ");
        String str=sc.next();
        int inp=sc.nextInt();
        a1.add(new Person(str,inp));
        
        }
        Iterator<Person> itr=a1.iterator();
        System.out.println("=======list of person=====/n");
        
        while(itr.hasNext()){
        Person p=itr.next();
        System.out.println(p);
        }
        
       System.out.println("\nsize :"+a1.size());
       System.out.println("isEmpty :"+a1.isEmpty());
       a1.add(new Person("sam",123));
      
       System.out.println("contains :"+a1.contains(new Person("kar",21)));
      
       System.out.println("before sort :"+a1 );
       Collections.sort(a1);
       System.out.println("after sort :"+a1 );
      }
 }