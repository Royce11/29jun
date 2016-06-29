package examplefourteen;

public class D {

	int i;
	int j;
	public D(int i,int j){
	this.i=i;
	this.j=j;
	}
	
	/*
	 * If parameterised Constructor is used then 
	 * Zero/Default Constructor is a must have. Good Coding Practice.
	 */
		public D() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void printName() {
	System.out.println("Name-D");
	}

}
