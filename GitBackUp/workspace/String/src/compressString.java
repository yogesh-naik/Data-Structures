import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
 * Cracking coding interview - 1.4
 */

public class compressString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "aabbbcdddd";
		
		HashMap<Character,Integer> hm = new HashMap<Character, Integer>();
		for(int i=0;i<=s.length()-1;i++){
			if((hm.containsKey(s.charAt(i)))){
				hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
			}
		else{
			hm.put(s.charAt(i),1);
		}
		}	
			//StringBuffer sb = new StringBuffer();
			Set<Character> HP = hm.keySet();
			s = new String();
			for(Character p : HP){
				s=s+p;
				Integer st = hm.get(p);
				char cp = (char) (st+'0');
				s=s+cp;
				//sb.append(p);
			    //sb.append(hm.get(p));
				//System.out.println(hm.get(p));			
			}
			
			//s = sb.toString();
			System.out.println(s);
			
			String sp ="bbbbaaaaaaaaaaaaaaaaacddddeeeeee";
			
			int ctr =1;
			int l = 0;
			int temp=0;
			for(int i=0;i<=sp.length()-2;i++){
				if(sp.charAt(i) ==sp.charAt(i+1)){
					ctr++;
				}
				if(sp.charAt(i)!=sp.charAt(i+1) && ctr >l){
					l=ctr;
					ctr=0;
				}
			}
				System.out.println(l);
	}

}
