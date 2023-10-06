package sep8;

public class Demo {

	public static void main(String[] args) {
		try {
		//divide any thing with zero
		int a=3456,b=0,c;
		c=a/b;
		System.out.println(c);
		}catch(Throwable t)
		{
			System.out.println(t.getMessage());
			t.printStackTrace();
		}
		int x=8765,y=87,z;
		z=x/y;
		System.out.println(z);

	}

}
