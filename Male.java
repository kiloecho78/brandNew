public class Male extends Human{
	public Male(String n, String l, double d, double i){
		super(n, l, d);
		dSize(i);
	}

	public void setDSize(String i){
		dSize = i;
	}

	public double get dSize(){
		return dSize;
	}

	private double dSize;
}