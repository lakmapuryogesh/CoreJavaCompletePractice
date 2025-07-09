package oops;

public class ObjectClass {
       private int a;
       private int b;
       
       public void setA(int a) {
    	   this.a=a;
       }
       public void setB(int b) {
    	   this.b=b;
       }
       
       public void sum() {
    	   System.out.println(a+b);
       }
       public void sub() {
    	   System.out.println(a-b);
       }
	public static void main(String[] args) {
		ObjectClass obj=new ObjectClass();
		obj.setA(1);
		obj.setB(2);
		obj.sum();
		obj.sub();
		

	}

}
