package example.six;

public class A {

	//{ System.out.println("block");}
	
	
	public A(){
	System.out.println("A"); // then 3rdly constructor
	}
	
	{ System.out.println("block");}  // Statement Always 2nd
	
	static{System.out.println("static");}  // Always 1st.
	public static void main(String[] args){
		A a = new A();
		}

	
}
