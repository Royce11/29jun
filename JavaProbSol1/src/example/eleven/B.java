package example.eleven;

public class B extends A {

	public D getOBJ(){
		System.out.println("class B - return D");
		return new D();
		}


}

/* Compatible Return type here refers dat 
 * actually Class B's return argument is passed a of A
 * and this is happening becoz A's return type is compatible with
 * B  
 */
 