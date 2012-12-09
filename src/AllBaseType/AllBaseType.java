package AllBaseType;
import java.io.*;
import java.util.Scanner;
public class AllBaseType {

	public enum Types {BYTE, SHORT, INT, LONG, FLOAT, DOUBLE};
	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		inputBaseType(Types.BYTE);
		inputBaseType(Types.SHORT);
		inputBaseType(Types.INT);
		inputBaseType(Types.LONG);
		inputBaseType(Types.FLOAT);
		inputBaseType(Types.DOUBLE);
	}
	
	public static void inputBaseType(Types t) {
		Scanner s = new Scanner(System.in);
		switch (t) {
			case BYTE:
				System.out.print("Please input a bype:");
				byte b = s.nextByte();
				System.out.println("Your input value is " + b);
				break;
			case SHORT:
				System.out.print("Please input a short:");
				short st = s.nextShort();
				System.out.println("Your input value is " + st);
				break;
			case LONG:
				System.out.print("Please input a long:");
				long l = s.nextLong();
				System.out.println("Your input value is " + l);
				break;
			case INT:
				System.out.print("Please input a int:");
				int i = s.nextInt();
				System.out.println("Your input value is " + i);
				break;
			case FLOAT:
				System.out.print("Please input a float:");
				float f = s.nextFloat();
				System.out.println("Your input value is " + f);
				break;
			case DOUBLE:
				System.out.print("Please input a double:");
				double d = s.nextDouble();
				System.out.println("Your input value is " + d);
				break;
		}
		
	}

}
