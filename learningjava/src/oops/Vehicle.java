package oops;
//Abstract class representing a Vehicle (hiding implementation details)
abstract class Vehicle {
abstract void accelerate();
abstract void brake();

void startEngine() {
	System.out.println("Enginee started!");
}
}

//concrete implementation
class Car extends Vehicle{

	@Override
	void accelerate() {
		System.out.println("Car:pressing gas pedal");
		//hidding
	}

	@Override
	void brake() {
		// TODO Auto-generated method stub
		System.out.println("Car: Applying brakes....");
		//hidding
	}
	
}
 class Main{
	public static void main(String []args) {
		Vehicle myCar=new Car();
		myCar.startEngine();
		myCar.accelerate();
		myCar.brake();
	}
}
