public class Human {

	public Human(){
		name = "John";
		lname = "Doe";
		dob = 100478;
	}

	public Human(String n, String l, double d){
		setName(n);
		setLName(l);
		setDOB(d);
	}

	public void setName(String n){
		name = n;
	}

	public void setLName(String l){
		lname = l;
	}

	public void setDOB(double d){
		dob = d;
	}

	public String getName(){
		return name;
	}

	public String getLName(){
		return lname;
	}

	public double getDOB(){
		return dob;
	}

	private String name;
	private String lname;
	private double dob;
	
}