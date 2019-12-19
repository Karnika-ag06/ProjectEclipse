import java.util.*;
class TreeSetDemo
{
  public static void main(String[] args)
    {
     TreeSet<String> k= new TreeSet<>();
     k.add("karnika");
     k.add("dhairya");
     k.add("radhika");
     k.add("nansi");
     k.add("ashmita");
     
     System.out.println(k);
     
     Iterator<String> itr=k.iterator();
     while(itr.hasNext())
     {
     String str=itr.next();
     System.out.println(str);
     }
    
     Iterator<String> itr1=k.descendingIterator();
     System.out.println("\nvalues using desc iterator");
     while(itr1.hasNext()){
     System.out.println(itr1.next());
     }
     System.out.println("contains : "+k.contains("karnika"));
     
}
  } 