package Caeser;

public class Caeser {
	public static final int ALPHASIZE = 26;
	protected char[] encrypt = new char[ALPHASIZE];
	protected char[] decrypt = new char[ALPHASIZE];
	
	//Build constructor
	public Caeser() {
		for(int i = 0; i<ALPHASIZE; i++)
			encrypt[i] = (char) ((3 + i)%ALPHASIZE + 'A');
		for(int i = 0; i<ALPHASIZE; i++)
			decrypt[encrypt[i]-'A'] = (char) ('A' + i);
	}
	
	//Encryption method
	public String encrypt(String secret) {
		char[] mess = secret.toCharArray();
		for (int i = 0; i<mess.length; i++) {
			if(Character.isUpperCase(mess[i]))
				mess[i] = encrypt[mess[i]-'A'];
		}
		return new String(mess);
	}
	
	//Decryption method
	public String decrypt(String secret) {
	char[] mess = secret.toCharArray();
	for (int i = 0; i<mess.length; i++) {
			if(Character.isUpperCase(mess[i]))
				mess[i] = decrypt[mess[i]-'A'];
		}
		return new String(mess);
	}
	
	//Main method
	public static void main(String args[]) {
		Caeser c = new Caeser();
		String secret = "THE EAGLE IS IN PLAY; MEET AT JOE'S.";
		//String secret = "ABCDEF";
		System.out.println(secret);
		secret = c.encrypt(secret);
		System.out.println("After encrypt:");
		System.out.println(secret);
		secret = c.decrypt(secret);
		System.out.println("After decrypt:");
		System.out.println(secret);
	}
}
