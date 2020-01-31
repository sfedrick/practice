package lab5.stack_queue;
import java.util.*;
public class Main {
	public static void main(String[] args) {

		      String s = "+-3hiwh+at34";

		      // create a new scanner with the specified String Object
		      Scanner scanner = new Scanner(s);

		      // find a string "World"
		     
		      
		      System.out.println("" + scanner.findInLine("\\d+|[-/\\*]"));
		      // print the rest of the string
		      System.out.println("" + scanner.nextLine());

		      // close the scanner
		      scanner.close();
		      
		      DoubleStack<String> test= new DoubleStack<>(24);
		      int n=0;
		      while(n<25) {
		    	  n=n+1;
		    	 
		    	  
		    	  test.push(1,"top"+n);
		    	  test.push(2,"bot"+n);
		    	  
		    	 
		    	  
		      }
		      System.out.println(test.toString(1));
		      System.out.println(test.toString(2));
		      
		      System.out.println("this is top:"+test.top());
		      System.out.println("this is bot:"+test.bot());
		      n=0;
		      
		      while(n<24) {
		    	  n=n+1;
		    	  System.out.println("this is the size:"+test.size(1));
		    	  System.out.println("this is the size:"+test.size(2));
		    	  System.out.println(test.pop());
		    	  System.out.println(test.scoop());
		    	  
		      }
		      System.out.println(test.size());
		      System.out.println(test.isEmpty());
		     
		      
		   }
		
}