package pak01;

public class Greetings {
	
	public void test() {
		System.out.println("Non static method");
	}

	public static void main(String[] args) {
		
		Greetings greetingsObject = new Greetings();
		//System.out.println("Hello world!!!");
		greetingsObject.test();

	}

}
