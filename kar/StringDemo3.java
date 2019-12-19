class StringDemo3
{
  public static void main(String[] args)
    {
      String s1 = "Ali-Al-Ali";
      String s2 = "Ahmed-Al-Ahmed";
      s1=s1.substring(0,7)+s2.substring(9,14);
      System.out.println(s1);
      
      String s3 = "Ali-Al-Ali";
      s2 = s2.substring(0,9)+s3.substring(7,10);
      System.out.println(s2);
      }
      }
      
 /*     //question4
      System.out.println("Enter String");
      String str = sc.next();
      
      //str= str.replaceAll("M"," ");
      //str= str.replaceAll("m"," ");
      System.out.println(str);
   */   

 
 
 //question5
 class Split{
      public static void main(String[] args){
     String str2 = "Java, 102, Programming Course";
      String[] str2arr=str2.split(",");
     
    System.out.println("Course name : " +str2arr[0]);
		System.out.println("Course Number : " +str2arr[1]);
		System.out.println("Course Description : " +str2arr[2]);
     
    }
}