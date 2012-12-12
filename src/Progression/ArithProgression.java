package Progression;

public class ArithProgression extends Progression {
	
	protected long inc;
	
	public ArithProgression () {
		this(1);
	}
	public ArithProgression (long increment) {
		inc = increment;
	}
	
	public long nextValue() {
		long next = 0;
		if(inc <= Long.MAX_VALUE - cur) {
			cur += inc;
			next = cur;
		} else {
			throw new ArithmeticException("Overflow long!");
		}
		return next;
	}
	
	public void catchError() {
		long next=2;
		long cur=0;
		int i = 0;
		try {
			while(true) {
				cur = next;
				next = 2*next -1;
				i++;
				if (next<0)
					throw new ArithmeticException("Overflow long!"+i);
			}
		}
		catch (ArithmeticException a) {
			System.out.println(a.getMessage());
		}
	}
}
