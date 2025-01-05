package designpattern;

public class BasicCar implements Car {

	public BasicCar() {
	}

	@Override
	public void assemble() {
		System.out.println("Adding Basic Car Feature");
	}

}
