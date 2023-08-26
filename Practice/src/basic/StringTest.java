package basic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringTest {
public static void main(String[] args) {
	
	// String in reverse order
	
	String ss = new String("pavani");
	StringBuilder sb = new StringBuilder();
	for(int i=ss.length()-1; i>=0; i--) {
		
		char c = ss.charAt(i);
		sb.append(c);
	}
	System.out.println(sb);
	
	// String Immutable
	
	String s = "abc";
	
	System.out.println(s.equals("ABC"));
	   s=   s.concat("def");
	   System.out.println(s);

	   
	  // remove duplicate charecters in string 
	   
	   String s1 = "pavani";
	   Set<Character> set = new HashSet<Character>();
	   for(int i=0; i<=s1.length()-1; i++) {
			
			char c = s1.charAt(i);
			   set.add(c);
			   
		}
	   System.out.println(set);
	  
	   System.out.println("-----------------");
	   
	   String str1 = "pav";
	   String str2 = "pav";
	   String str3 = new String("pav"); // stored in heap not in SCP
	   System.out.println(str1==str2); // stored in SCP refer the same value
	 //  System.out.println(str1==str3); // no chache so that false
	 //  System.out.println(str1.equals(str3)); // value is same
	 //  System.out.println(str2.equals(str3));
	   
	   System.out.println(1+2+"pav");
	   System.out.println("pav"+1+2);
	   System.out.println(1+2+"pav"+4+5);
	   
	   Integer i1= 128;
	   Integer i2= 128;
	   System.out.println(i1==i2);
	   
	   
}
}
