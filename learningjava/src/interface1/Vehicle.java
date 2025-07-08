package interface1;

public interface Vehicle {
 void changeGear(int a);
 void speedUp(int a);
 void applyBrakes(int a); 
}

class Bicycle implements Vehicle{
	int speed;
	int gear;
	@Override
	public void changeGear(int newGear) {
		gear=newGear;
	}
	@Override
	public void speedUp(int increment) {
		// TODO Auto-generated method stub
		speed=speed+increment;
	}
	@Override
	public void applyBrakes(int a) {
		// TODO Auto-generated method stub
		speed=speed-a;	
	}
	
    public void printStates() {
    	System.out.println("speed: "+speed+"gear:"+gear);
    }
}

class Bike implements Vehicle{
	int speed;
	int gear;
	@Override
	public void changeGear(int newGear) {
		gear=newGear;
	}
	@Override
	public void speedUp(int increment) {
		// TODO Auto-generated method stub
		speed=speed+increment;
	}
	@Override
	public void applyBrakes(int a) {
		// TODO Auto-generated method stub
		speed=speed-a;	
	}
	
    public void printStates() {
    	System.out.println("speed: "+speed+"gear:"+gear);
    }
}
class Main{
    public static void main(String[] args) {
    	 // Instance of Bicycle(Object)
        Bicycle bicycle = new Bicycle();
        
      	bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);
        
        System.out.print("Bicycle present state : ");
        bicycle.printStates();
        
        // Instance of Bike (Object)
        Bike bike = new Bike();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrakes(3);
        
        System.out.print("Bike present state : ");
        bike.printStates();
    }
}