package sep9;

public class Sample {
	//static global variables
	static int x,y,z;
	static double a,b,c;
	public static void add() {
		x=789;
		y=78;
		System.out.println(z);
	}
	public static void division() {
		x=76654;
		y=98;
		c=a/b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		//calling static methods with class name
				Sample.division();
				Sample.add();
	}

}
