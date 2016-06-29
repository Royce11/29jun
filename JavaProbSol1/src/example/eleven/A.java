package example.eleven;

public class A {

	// here C is the object return type for method getOBJ
	public C getOBJ(){
		System.out.println("class A - return C");
		return new C();
	}
}