
public class test {

	public static void main(String[] args) {
	      
		String input[] ={"ab","cd","f","ab","ef","fdfabc"};
		
		int ctr=0;
		
		for(int i=0;i<=input.length-1;i++){
			if(input[i].matches("(.*)ab(.*)")){
				ctr++;
			}
		}
		
		System.out.println(ctr);
	}
}
