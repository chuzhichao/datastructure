package Prime;
import java.math.*;

public class PrimeNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int PRIME_RANGE = 100;
		boolean[] prime = new boolean[PRIME_RANGE];
		findPrime(prime);
		for(int i=0; i<prime.length; i++) {
			if(prime[i])
				System.out.println(i+1);
		}
	}
	
	public static boolean[] findPrime(boolean[] flag) {
		int n = flag.length;
		flag[0]=false;
		for(int i = 1; i<n; i++)
			flag[i]=true;
		
		for(int i = 2; i<n; i++) {
			if (!flag[i])
				continue;
			int curNum = i+1;
			int sqr = (int)Math.round(Math.sqrt(n));

			for(int j = 2; j<sqr; j++) {
				if(curNum%j==0&&curNum!=j) {
					flag[i] = false;
					for(int k =2; curNum*k<=n; k++) {
						flag[curNum*k-1]=false;
					}
				}
			}
		}
		return flag;
	}

}
