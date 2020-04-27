package com.JavaCode;

public class String_method {

	public static void main(String[] args) 
	{
//       String x="nothing is impossible";
//       int Length=x.length();
//       System.out.println(Length);
        
//       OR
//		String x="tarikul";
//	    System.out.println(x.length());

       String x="Tarikul";
       String y="  Nayeem";
       String z="  Nayeem";
       
       System.out.println(x.length());
       System.out.println(y.length());
       
       System.out.println(x.concat(y));      // ADD string
       System.out.println(x.indexOf("u"));   // word possition
       
       System.out.println(x.toUpperCase());  // all capital letter
       System.out.println(x.toLowerCase());  // all small letter
       
       System.out.println(y);
       System.out.println(y.trim());      // remove space

       System.out.println(x.startsWith("Ta"));  // starting latter
       System.out.println(x.startsWith("Na"));  

       System.out.println(x.endsWith("l"));  // ending latter
       System.out.println(x.endsWith("m"));  

       System.out.println(x.compareTo(y));  // compare string
       System.out.println(y.compareTo(z));  // x=y output: 0 x=!y output: any value
       
       System.out.println(x.equals(y));  // compare string
       System.out.println(y.equals(z)); 
	}

}
