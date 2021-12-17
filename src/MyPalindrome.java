
public class MyPalindrome {
	
	
	public static boolean Checkisalmostpalindrome(String str) {
		 int n = str.length();  
		 int count = 0;
		 
		 for (int i = 0; i < n/2; ++i)
		     
		        if (str.charAt(i) != str.charAt(n - i - 1))
		            ++count;
		     
		    // If count of changes is less than
		    // or equal to 1
		    return (count <= 1);
		    }
	
	public static void main(String[] args) {
	     
	    String str = "abcdcbg";
	    String strB = "abccia";
	    String strC = "abcdaaa";
	    String strD = "1234312";
	    
	         
	    if (Checkisalmostpalindrome(str))
	     
	        System.out.println("Yes");
	    else
	        System.out.println("No");
	    
	    
	    System.out.println(str.replace('g', 'b'));
	    
	    
	    
	    
	    if (Checkisalmostpalindrome(strB))
		     
	        System.out.println("Yes");
	    else
	        System.out.println("No");
	    System.out.println(strB.replace('i', 'b'));
	    
	    
	    if (Checkisalmostpalindrome(strC))
		     
	        System.out.println("Yes");
	    else
	        System.out.println("No");
	    
	    

		if (Checkisalmostpalindrome(strD))
		     
	        System.out.println("Yes");
	    else
	        System.out.println("No");
	    
	        
	    }
	    
	        
	    }
	
	


