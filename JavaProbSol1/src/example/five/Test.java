package example.five;

public class Test {

	public static void main(String argv[]){
		A a = new B();
		a.printValue();  // polymorphism calls subclass method.
		System.out.println(a.i);
		}
	
}
