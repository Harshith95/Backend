package designpattern;

public class Client {
	public static void main(String[] args) {
		Car c = new SuperCar(new BasicCar());
		c.assemble();
	}
}
