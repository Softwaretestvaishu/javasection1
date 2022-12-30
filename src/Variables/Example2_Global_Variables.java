package Variables;

public class Example2_Global_Variables {
	
	int a=10;
	
	static int b=20;
	
	public void M1()
	{
		System.out.println(a);
		
		System.out.println(b);
	}
	
	public static void M2()
	{
		Example2_Global_Variables a1=new Example2_Global_Variables();
		
		System.out.println(a1.a);
		
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		
		Example2_Global_Variables a2=new Example2_Global_Variables();
		a2.M1();
		System.out.println(a2.a);
		M2();
		System.out.println(b+" "+"static_Variable");
	}

}
