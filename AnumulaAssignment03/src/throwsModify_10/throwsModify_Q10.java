package throwsModify_10;

import java.io.IOException;

public class throwsModify_Q10 {
	
	public void makeModify() throws Exception {
        // Some code that may throw an exception
    }
}


 class throwsModify_Q11 extends throwsModify_Q10 {
	
	 @Override
    public void makeModify() throws IOException {
        // This will cause a compilation error
    }
}
