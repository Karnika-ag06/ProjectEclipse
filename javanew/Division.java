package pack1;
import myexcep.InvalidDivisor;

  public class Division
   {
      public int x;
      public int y;
  
          public Division(int x,int y)
           {
            this.x=x;
            this.y=y;
           }
           
           
           public int divide() throws InvalidDivisor
           {
            if(y==0){
           throw new InvalidDivisor("the division operator cannot be done as the divisor is zero");
           }
           else
          {
           return x/y;
          }
        }
 } 
