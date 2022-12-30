package Variables;

public class Example3_Different_Class_For_Local_Global_Variable {
	
	public static void main(String[] args) {
		
		Example2_Global_Variables a2=new Example2_Global_Variables();
		a2.M1();
		System.out.println(a2.a);
		
		//Static Keyword
		
		System.out.println("*************");
		
		Example2_Global_Variables.M2();
		System.out.println(Example2_Global_Variables.b);
	}

}
