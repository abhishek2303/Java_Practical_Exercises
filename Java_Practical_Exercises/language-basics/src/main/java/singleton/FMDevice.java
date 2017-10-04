package singleton;


public class FMDevice {
	private FMSignal fmSignal;
	
	public FMDevice() {
		this.fmSignal = FMSignal.getFMSignal();
	}
	
	public int signalHashCode() {
		return this.fmSignal.hashCode();
	}
}
