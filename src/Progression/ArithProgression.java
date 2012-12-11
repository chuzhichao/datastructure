package Progression;

public class ArithProgression extends Progression {
	
	protected int inc;
	
	public ArithProgression () {
		this(1);
	}
	public ArithProgression (int increment) {
		inc = increment;
	}
	
	public long nextValue() {
		return cur += inc;
	}
}
