package trywithoutCatch_08;

public class TryWithoutFinally_Q08 {
	
	public static void main(String[] args) {
		int i = 6;
		int k =0 ;
	try {
		int j = i/k;
	    System.out.println("Donnot have the catch block");
	    
	} finally {
	    System.out.println("Executin finally without catch block");
	}
	}


}
