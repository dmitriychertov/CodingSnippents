package foo;

import java.util.Random;

public class RandomString {
	
	String corellationID;

	public static void main(String[] args) {
		RandomString rs = new RandomString();
		
		String str = rs.createRandomString();
		System.out.println(str);
	}

	private String createRandomString() {
		Random random = new Random(System.currentTimeMillis());
		long randomLong = random.nextLong();
		return Long.toHexString(randomLong);
	}

}
