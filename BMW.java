package week3.day1;

public class BMW extends Car{
	
    @Override
    public void driveVehicle() {
    	System.out.println("child can drve a vehicle");
    }
	
	@Override
	public void accelerate() {
		System.out.println("child can handle the accelerate");
	}

}
