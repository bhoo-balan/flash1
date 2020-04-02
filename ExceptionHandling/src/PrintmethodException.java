
public class PrintmethodException {
	public static void main(String[] args) {
		
		try {
			
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			
			//e.printStackTrace();//complete Info name, desc,stack
			//System.out.println(e);//only name and desc
			System.out.println(e.getMessage()); //only desc
		}
	}
}
