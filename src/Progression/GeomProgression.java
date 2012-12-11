package Progression;

public class GeomProgression extends Progression {
	protected long base;
	
	//Constructor
	public GeomProgression() {
		this(1);
	}
	public GeomProgression(long b) {
		base = b;
		first = cur = 1;
	}
	public long nextValue() {
		return cur *= base;
	}
}
