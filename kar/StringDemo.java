class StringDemo {
	public static void main(String[] args){

		//System.out.println("Hello World".toUpperCase());

		/*String s1="Java";
		String s2="Java";

		System.out.println(s1==s2);  //true
		System.out.println(s1.equals(s2)); //true

		String s3=new String("Java");
		String s4=new String("Java");

		System.out.println(s3==s4);  //false
		System.out.println(s3.equals(s4));  //true*/

		/*String s1=new String();
		String s2=new String("Hello World");

		char[] ch={'I','r','i','s','S','o','f','t','w','a','r','e'};
		String s3=new String(ch);

		String s4=new String(ch,0,4);

		System.out.println(s1);	
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);*/


		String str="Sachinc";
		String str1="sachin";

		System.out.println("Length = "+str.length());

		//str=str+" Tendulkar";
		//System.out.println("After concat : "+str);

		char ch=str.charAt(2);
		System.out.println("Character at index 2 is "+ch);

		System.out.println("equals : "+str.equals(str1));
		System.out.println("equalsIgnoreCase : "+str.equalsIgnoreCase(str1));

		System.out.println("StartsWith : "+str.startsWith("S"));
		System.out.println("StartsWith : "+str.startsWith("Sac"));
		System.out.println("endsWith : "+str.endsWith("in"));

		int index=str.indexOf("g");
		System.out.println("index Of : "+index);

		int lastIndex=str.lastIndexOf("c");
		System.out.println("last Index Of : "+lastIndex);

		String s1="A";
		String s2="B";
		String s3="C";
		String s4="C";

		System.out.println("Compare to  : "+s1.compareTo(s2)); //-ve
		System.out.println("Compare to  : "+s3.compareTo(s2));	//+ve
		System.out.println("Compare to  : "+s3.compareTo(s4)); 	//0

		String s5="   Hello World ";
		System.out.println("Length Before trim : "+s5.length());
		s5=s5.trim();
		System.out.println("Length After trim : "+s5.length());

		System.out.println("toLowerCase : "+s5.toLowerCase());
		System.out.println("toUpperCase : "+s5.toUpperCase());
		
		String s6="Jack and Jue";
		s6=s6.replace("J","Bl");
		System.out.println("Replace : "+s6);

		String s7="Divya";
		s7=s7.concat(" Garg");
		System.out.println("Concat : "+s7);

		String s8="Smiles";
		//s8=s8.substring(1);
		s8=s8.substring(1,4); //4 is the endIndex which is exclusive
		System.out.println("Substring : "+s8);

		String s9="PLSQL , Core Java , Servlets and Jsp , HTML CSS and Javascript , Spring , Hibernate , JQuery, Angular";
		String[] s9Arr=s9.split(",");	
		for(String looper:s9Arr){
			System.out.println(looper);
		}

		//How to convert character arry into String
		char[] ch10={'H','e','l','l','o'};
		String s10=String.valueOf(ch10);
		System.out.println(s10);

		StringBuffer sb=new StringBuffer("Hello");
		
		//sb.reverse();
		//System.out.println("Reversed Object : "+sb);

		sb.append(" World");
		System.out.println("Append : "+sb);


	}
}






























