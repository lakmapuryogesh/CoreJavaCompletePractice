package interface1;

public interface testInterface {
    // public,static and final      
	final int a=10;
          
	// public and abstract
	void display();
}

class TestClass implements testInterface{
	
	//Implementing the capabilities of Interface
	public void display() {
		System.out.println("Geek");
		}
}

class Geeks{
	public static void main(String[] args)
	{
		TestClass t=new TestClass();
		t.display();
		System.out.println(testInterface.a);
	}
}