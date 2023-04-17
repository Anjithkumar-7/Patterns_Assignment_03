package finalVsfinallyVsFinalize;

public class fianlVsfinallyVsFinalize_Q12 {
	
	public static final int MAX_VALUE = 100;
	
	public static void main(String [] args) {
		try {
	        // ...
	    } catch (Exception e) {
	        // ...
	    } finally {
	        // code that always executes
	    }
	}
	
}

 class MyObject {
    @Override
    protected void finalize() throws Throwable {
        // code to clean up resources
        super.finalize();
    }
}
