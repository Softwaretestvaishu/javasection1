package Variables;

public class Example1_Local_Variable {

	public void M1()
	{
		int a=50;
		System.out.println(a);
	}

	public static void M2()
	{
		int b=20;
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		
		int d=25;
		System.out.println(d);
		Example1_Local_Variable a1=new Example1_Local_Variable();
		a1.M1();
		
		
		M2();
	}

}

