package codding.samples;

public class GenericStaticInitializer {
	
	public static String[] strings;
	public static int index = 100;
	
	static {
		strings = new String[index];
		
		for (int x = 0; x < index - 1; x++) {
			strings[x] = null;
		}
			 
		
	}
	
	

}
