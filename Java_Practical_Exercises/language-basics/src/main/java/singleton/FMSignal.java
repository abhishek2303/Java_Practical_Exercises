package singleton;

//singleton
public class FMSignal {
	private static FMSignal signal;
	
	private FMSignal() {
		
	}
	
	public synchronized static FMSignal getFMSignal() {
		if(signal == null) {
			signal = new FMSignal();
			System.out.println("Lazy Initialization: Signal created");
		}
		return signal;
	}
	
}
