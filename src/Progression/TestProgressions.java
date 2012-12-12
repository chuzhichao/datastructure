package Progression;

public class TestProgressions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Print default Progression values:");
		Progression n = new Progression();
		n.printProgression(5);
		
		System.out.println("Print Arithetic Progression values with default:");
		ArithProgression a = new ArithProgression();
		a.printProgression(5);
		System.out.println("Print Arithetic Progression values with increment 128:");
		ArithProgression a1 = new ArithProgression(128);
		a1.printProgression(5);
		ArithProgression a2 = new ArithProgression(128);
		a2.catchError();
		
		System.out.println("Print Geometric Progression values with default:");
		GeomProgression g = new GeomProgression();
		g.printProgression(5);
		System.out.println("Print Geometric Progression values with increment 3:");
		GeomProgression g1 = new GeomProgression(3);
		g1.printProgression(5);
		
		System.out.println("Print Fibonacci Progression values with default:");
		FiboProgression f = new FiboProgression();
		f.printProgression(5);
		System.out.println("Print Fibonacci Progression values with start values (4, 6):");
		FiboProgression f1 = new FiboProgression(4,6);
		f1.printProgression(5);
		
		Progression p = new GeomProgression();
		System.out.println(p.firstValue());
		
		p = (Progression) p;
		System.out.println(p.firstValue());
	}

}
