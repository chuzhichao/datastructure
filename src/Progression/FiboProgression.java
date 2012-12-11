package Progression;

public class FiboProgression extends Progression {
	
	protected long prev;
	
	//Constructor
	public FiboProgression() {
		this(0, 1);
	}
	public FiboProgression(long value1, long value2) {
		first = value1;
		prev = value2;
	}
	
	public long nextValue() {
		long temp = prev;
		if(cur == 0) {
			cur = prev;
			prev = first;
		} else {
			prev = cur;
			cur = temp + prev;
		}
		return cur;
	}

}
