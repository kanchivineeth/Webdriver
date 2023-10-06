package sep8;

public class Demo2 {

	public static void main(String[] args) {
		String str1="Selenium";
		String str2="Manual";
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("String are Equal");
		}
		{
			try {
			throw new Error("String are not Equal");
			}catch(Throwable t)
			{
				System.out.println(t.getMessage());
			}
		}
	}
 
}
