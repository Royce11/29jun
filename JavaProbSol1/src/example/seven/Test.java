package example.seven;

public class Test {

	public static void main(String[] args){
		byte b = 6;
		b+=7;  // Unary operator internally converts everything into byte format
		System.out.println(b);
		b = (byte) (b+7); // type casting RHS is int and is forced to byte
		System.out.println(b);
		}

	
}
