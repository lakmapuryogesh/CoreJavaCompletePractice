package inheritance;

public class Admin extends Developer{
    public void manage() {
    	System.out.println("Manage code");
    	read();
    }
	/*
	 * if we use a method name inside othermethod even there
	 *  is super calss method name it will consider this method 
	 *  only which is peresent inside the same class
	 */
    public void read() {
    	System.out.println("Admin read code");
    }
}
