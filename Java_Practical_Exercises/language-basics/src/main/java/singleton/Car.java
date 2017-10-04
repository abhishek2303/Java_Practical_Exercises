package singleton;


public class Car {
	public static void main(String[] args) {
		FMDevice radio = new FMDevice();
		FMDevice radio1 = new FMDevice();
		
		System.out.println(radio.signalHashCode());
		System.out.println(radio1.signalHashCode());
	}
}
