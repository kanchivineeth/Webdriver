package sep9;

public class vineeth {
	public static void add(int x,int y) {
		int z=x+y;
		System.out.println(z);
	}
	public static String verify_String(String str1,String str2)
	{
		String res="";
		if (str1.equalsIgnoreCase(str2)) {
			res="Strings are Equal";
		}
		else
		{
			res="Strings are not equal";
		}
		return res;
	}
	public static boolean compare_values(int a,int b) {
		if (a==b) {
			return true;
		}
		else;
		{
			return false;
		}
	}
	public static void main(String[] args) {
		vineeth.add(1000, 2344);
		String res=vineeth.verify_String("hello", "hello");
		System.out.println(res);
		boolean obj =vineeth.compare_values(100,200);
		System.out.println(obj);

	}

}
