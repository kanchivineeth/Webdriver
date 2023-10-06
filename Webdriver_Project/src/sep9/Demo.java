package sep9;

public class Demo {
	//non static global variables
	int x,y,z;
	double a,b,c;
	public void add() {
		x=789;
		y=78;
		z=x+y;
		System.out.println(z);
	}
	public void division() {
		a=76654;
		b=96;
		c=a/b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		// creating reference object to call non static methods
		Demo obj= new Demo();
		obj.add();
		obj.division();

	}

}
