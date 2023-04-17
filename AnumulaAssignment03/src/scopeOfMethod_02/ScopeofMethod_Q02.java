package scopeOfMethod_02;

public class ScopeofMethod_Q02 {

	protected void makeScope() {
        System.out.println("Animal is making a sound.");
    }
}

 class ScopeofMethod_Q03 extends ScopeofMethod_Q02 {
    public void makeScope() {
        System.out.println("updatedScope!");
    }
}

 
 class Test{
	 public static void main(String[] args) {
		 ScopeofMethod_Q03 sQ = new ScopeofMethod_Q03();
		 sQ.makeScope();
	 }
 }