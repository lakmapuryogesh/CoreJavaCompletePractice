package interface1;

public class Lenovo implements Laptop{

	@Override
	public void copy() {
		System.out.println("Lenovo copy code");
		
	}

	@Override
	public void paste() {
		System.out.println("Lenovo paste code");
		
	}

	@Override
	public void cut() {
		System.out.println("Lenovo cut code");
		
	}

	@Override
	public void keyboard() {
		System.out.println("Lenovo keyword code");
		
	}
  
	public void camera() {
		System.out.println("Lenovo camera code");
	}
	
}
