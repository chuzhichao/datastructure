package Progression;

public class Progression {

	protected long first;
	protected long cur;
	
	//Constructor
	public Progression() {
		first = cur = 0;
	}
	
	//Set first value
	public long firstValue() {
		return first;
	}
	//Set next value
	public long nextValue() {
		return ++cur;
	}
	
	//print the progression
	public void printProgression(int n) {
		System.out.print(firstValue());
		for(int i = 2; i<=n; i++) {
			System.out.print(" " +nextValue());
		}
		System.out.println("");
	}
	
}