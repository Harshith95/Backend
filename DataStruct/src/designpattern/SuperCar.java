package designpattern;

public class SuperCar extends CarDecorator {

	public SuperCar(Car c) {
		super(c);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adding Super Car Feature");
	}

}
