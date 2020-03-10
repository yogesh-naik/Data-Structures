package car;

public class car {
	
	double s; 
	
	public void setSpeed(double speed){
		s= speed;
	}
	
	public void showSpeed(){
		System.out.println("The speed is"+s);
	}
	
	public static void changeofcar(car c){
		c.setSpeed(200.0);
	}
	

}
