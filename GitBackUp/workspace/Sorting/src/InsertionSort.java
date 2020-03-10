
public class InsertionSort {

	public static void main(String[] args) {
		int [] p = {32,0,-2,1,100,2,03};
		insertionSort(p);
		for(int i =0;i<p.length;i++){
			System.out.println(p[i]);
		}
	}
	
	public static int[] insertionSort(int[]arr){
		
		for(int i =0;i<arr.length;i++){
			for(int j=i-1;j>=0;j--){
				if(arr[j]>arr[i]){
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		return arr;
		
	}
}
