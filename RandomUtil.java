package <package>;

import java.util.Random;

public class RandomUtil {

	public static final String ALPHANUMERIC_CASE = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	public static final String ALPHANUMERIC_NO_CASE = "abcdefghijklmnopqrstuvwxyz0123456789";
	public static final String ALPHANUMERIC = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final String ALPHABET_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final String ALPHABET_NO_CASE = "abcdefghijklmnopqrstuvwxyz";
	public static final String NUMERIC = "0123456789";
	
	private static Random r = new Random();
	
	/**@param chars chars used in the String. This class provides you many premade regex such as <i>ALPHANUMERIC</i>, <i>NUMERIC</i>, <i>ALPHABET</i>, <i>ALPHABET_NO_CASE</i>, etc.
	 * @param length length of the String. It is the amount of the char in the String.
	 * @return random String of a certain length using a regex (choose chars used in that random String). If the length equals 0, it will return value: "". */
	public static String randomString(final String chars, int length) {
		String str = "";
		for(int i = 0; i < length; i++) {
			int at = r.nextInt(chars.length());
			str+= chars.charAt(at);
		}
		return str;
	}
	
	/**@param length length of the String. It is the amount of the char in the String.
	 * @return random String of a certain length using the regex <i>ALPHABET</i>. If the length equals 0, it will return value: "". */
	public static String randomString(int length) {
		return randomString(ALPHABET, length);
	}
}
