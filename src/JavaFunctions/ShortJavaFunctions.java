package JavaFunctions;
import java.util.Random;
public class ShortJavaFunctions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Test isMltiple function
		long m = 4;
		long n = 1200;
		if(isMultiple( m, n ))
			System.out.println(n + " is a multiple of " + m);
		else
			System.out.println(n + " is not a multiple of " + m);
		
		//Test isOdd function
		int i = -1;
		if(isOdd(i))
			System.out.println(i + " is an odd" );
		else
			System.out.println(i + " is not an odd" );
		
		//Test smallerSum function
		int[] numbers = { -100, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int n1 = 10;
		int sum = smallerSum(numbers, n1);
		System.out.println("Sum is " + sum);
		
		//Test isPariOdd function
		int[] array1 = { -100, 2, 4, 6, 7, 8, 10 };
		if(isPairOdd(array1))
			System.out.println("Array has an pair odd." );
		else
			System.out.println("No an pair odd in Array." );
		
		//Test isDistinct function
		int[] array2 = { -100, 2, 4, 6, 8, 8, 10 };
		if(isDistinct(array2))
			System.out.println("Array is distinct." );
		else
			System.out.println("Has duplicate numbers." );
		
		//Test sortArray and genArray functions
		int[] array3 = new int[3];
		int count = 0;
		genArray(array3);
		System.out.print("Here is the original array: ");
		printArray(array3);
		int length = array3.length;
			for (int l = 0; l<length; l++) {
				for(int j = 1; j<length; j++) {
					sortArray(array3, 1);
					//System.out.print("J="+j+" L="+l);
					System.out.print(" Here is the sorted array"+(++count)+": ");
					printArray(array3);
				}
				sortArray(array3, 0);
			}
	}

	public static boolean isMultiple(long m, long n ) {
		return (n % m == 0) ? true : false;
	}
	
	/*
	public static boolean isOdd(int i) {
		boolean odd = false;
		if (i < 0)
			i = -i+2;
		while (true) {
			i -= 2;
			if (i == 1) {
				odd = true;
				break;
			} else if (i == 0) {
				break;
			}
		}
		return odd;
	}
	*/
	
	public static boolean isOdd(int i) {
		return ((i & 1) == 1) ? true : false;
	}
	
	public static int smallerSum(int[] numbers, int n) {
		int sum = 0;
		for(int i = 0; i<numbers.length; i++) {
			int e = numbers[i];
			if (n > e && isOdd(e))
				sum += numbers[i];
		}
		return sum;
	}
	
	public static boolean isPairOdd(int[] array) {
		for (int i = 0; i<array.length; i++) {
			if(isOdd(array[i])) {
				for(int j = i + 1; j<array.length; j++) {
					if(isOdd(array[j])) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public static boolean isDistinct(int[] array) {
		for (int i = 0; i<array.length; i++) {
			for(int j = i + 1; j<array.length; j++) {
				if(array[i] == array[j]) {
						return false;
				}
			}
		}
		return true;
	}
	
	public static void genArray(int[] array) {
		//Generate one range
		Random rn = new Random();
		int min = 1;
		int max = 54;
		int range = max - min + 1;
		//Generate one set of numbers
		for(int i = 0; i<array.length; i++) {
			array[i] = rn.nextInt(range) + min;
		}
	}
	
	public static void sortArray(int[] array, int start) {
		int a = array[start];
		for(int i = start; i<array.length; i++) {
			if (i == array.length - 1)
				array[i] = a;
			else
				array[i] = array[i+1];
		}
	}
	
	public static void printArray(int[] array) {
		for(int i = 0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println(" ");
	}
}
