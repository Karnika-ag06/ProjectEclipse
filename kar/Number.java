import java.util.Random;
  class Number{
    int num=10;
    long fact=1;
    
  public void GenerateNum(){
        Random r=new Random();
            for(int i=0;i<num;i++){
            int n=r.nextInt(10);
        }
         System.out.println("generated num : "+num);
     }
  public void CalculateFactorial{
        for(int i=1;i<=num;i++){
        fact=fact*num;  
        }
          System.out.println("factorial is : "+fact);
     }