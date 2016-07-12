package chapter2_Exercise;

public class StudentListing {

	String name;
	int ID;
	double GPA;
	
	StudentListing(){}
	
	StudentListing(String name,int ID,double GPA){
		this.name = name;
		this.ID = ID;
		this.GPA = GPA;
	}
	
	public String toString(){
		return ("Name is "+name+
				"\n ID is "+ID+
				 "\n GPA is "+GPA);
	}
	
	public int compareTo(String targetKey){
		return(name.compareTo(targetKey));
	}
	
	public StudentListing deepCopy(){
		StudentListing temp = new StudentListing(name, ID,GPA);
		return temp;
	}
	
	public static void main(String[] args){
		StudentListing student1 = new StudentListing("Raj",1,3.9);
		StudentListing student2 = new StudentListing("chopra",2,3.56);
		StudentListing student3 = student2.deepCopy();
		
		System.out.println("------toString and deepCopy-----");
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());
		
		System.out.println("-----O/p of compareTo-------");
		System.out.println(student1.compareTo("Raj"));
		System.out.println(student2.compareTo("chopra"));
		
		System.out.println("-----ended-------");
	}
}
