import java.util.HashSet;
import java.util.Hashtable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class scratchpad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer("Yogesh");
		sb = sb.insert(2,"yes yes ");
		
		String S = "yogesh";
		S.concat(sb.toString());
		
		char s [] = S.toCharArray();
		String p = String.valueOf(s);	
		
//		for(int i =0;i<=s.length-1;i++){
//			p = p+s[i];
//		}
		
		//Hashtable<Character, Integer>HT = new Hashtable<Character, Integer>();
		HashSet<Character>hs = new HashSet<Character>();
		for(int i =0;i<=s.length-1;i++){
			if(!hs.contains(s[i])){
				hs.add(s[i]);				
			}if(!hs.contains(s[i]) && i==s.length-1){
				System.out.println("String is unique");
			}
			else{
				System.out.println("String is not unique");
				break;
			}
		}
		//System.out.println(p);

		String str = "ABCh hi";
		
		int count =0;
		  for(int i = 0;i<=str.length()-2;i++){
		       if(str.substring(i,i+2).equals("hi")){
		            count++;
		  }
	  }
		  System.out.println(" Counter "+count);
		  
		  String [] input = {"ab","cd","f","ab","ef","abc"};
		  String REGEX = "ab(.*)";
		  Pattern p1 = Pattern.compile(REGEX);
		  
		  		  
		  count=0;
		  for(int i=0;i<input.length-1;i++){
			 // if(Pattern.matches("ab(.*)",input[i])){
			  if(input[i].contains("ab")){
				  count++;
			  }
		  }
		  System.out.println("no. of times ab occured "+count);
		  
		  String Str = "Welcome to Tutorialspoint.com";
		  
		  String pt = Str.replaceAll("(.*)Tutorials(.*)","AMROOD" );
		  System.out.println(pt);
		  System.out.println(Str.matches("(.*)Tutorials(.*)"));
		  
		  System.out.println("//////////////////////////////////////////////////");
		  
			String s1 = "Mr Yogesh Naik     ";
			sb = new StringBuffer();
			
			for(int i=0;i<=13;i++){
				if(s1.charAt(i) ==' '){
					sb.append("%20");
				}else{
					sb.append(s1.charAt(i));
				}				
			}
			
			System.out.println(sb.toString());
			
			int a [] = new int [5];
			int j=0;
			for(int i=100;i<=104;i++){
				a[j] = i;
				j++;
			}
			
			int b[] = new int[a.length*2];
			for(int i=0;i<=4;i++)
				b[i] = a[i];
			
			a = new int[b.length-1];
			a = b;
			
			for(int i=0;i<=a.length-1;i++)
			System.out.println(a[i]);
			
	}
}
