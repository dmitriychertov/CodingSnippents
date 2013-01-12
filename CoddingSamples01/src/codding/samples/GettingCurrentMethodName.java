package codding.samples;

public class GettingCurrentMethodName {
	
	public static void main(String[] args) {
		String name = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(name);
	}
	

}
