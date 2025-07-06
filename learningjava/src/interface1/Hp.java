package interface1;

public class Hp implements Laptop{
	@Override
	public void copy() {
		System.out.println("HP copy code");
		
	}

	@Override
	public void paste() {
		System.out.println("HP paste code");
		
	}

	@Override
	public void cut() {
		System.out.println("HP cut code");
		
	}

	@Override
	public void keyboard() {
		System.out.println("HP keyword code");
		
	}
	
	public void printing() {
		System.out.println("HP priniting");
	}

}
