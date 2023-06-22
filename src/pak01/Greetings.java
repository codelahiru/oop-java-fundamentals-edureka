package pak01;

public class Greetings {
	
	public void nonStaticTest() {
		System.out.println("Non static method");
	}
	
	public void staticTest() {
		System.out.println("Static method");
	}


	public static void main(String[] args) {
		
		Greetings greetingsObject = new Greetings();
		//System.out.println("Hello world!!!");
		greetingsObject.nonStaticTest();
		greetingsObject.staticTest();

	}

}
