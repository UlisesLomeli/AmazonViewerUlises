
public class Car {
	int id;
	String license;
	Account driver;
	int passenger;
	
	public Car(String license, Account driver) {
		this.license= license;
		this.driver=driver; 
	}
	
	void printDataCar() {
		System.out.println("License: "+license+" Driver: "+driver.name);
	}
	
	
}
