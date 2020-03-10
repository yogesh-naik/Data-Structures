
public class data<T> implements Comparable {
	
	T a;
	
	data (T a ){
		this.a = a;
	}
	
	public T getData(){
		return a;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
