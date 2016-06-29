package example.eight;

public class Application {

	public static void main(String[] args){
		String value = "abc"; // Learn how to Wrap or autobox
		changeValue(value);
		System.out.println(value);
		}
		public static void changeValue(String a){
		a = "xyz";
		// return a;
		}
		}

/*
 * 
public class Testnine{               
       String value;
       Testnine()			// Using Constructor to store input inside value attribute.
       {
              this.value="abc";
       }
       public static void changeValue(Testnine a){                                    //abc
              a.value = "xyz";
              }
       
       
public static void main(String[] args){

Testnine b=new Testnine();  [Here, b is an instance of CLASS TEST. Thus b.value (of type string) becomes "abc"]
System.out.println(b.value);
Testnine.changeValue(b);
System.out.println(b.value);
}                                                                                                             // we didnt pass the reference(object) only pass the value...so it didnt change
}
*/
