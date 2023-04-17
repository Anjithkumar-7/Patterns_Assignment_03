package covariant_03;

public class CovariantType_03 {

	 public CovariantType_03 giveType() {
         System.out.println("Return Super class object");
	        return new CovariantType_03();
	    }
}

class CovariantType_04 extends CovariantType_03{
	
	// Overridden method Returns the subclass object
	
	@Override
	 public CovariantType_04 giveType() {
         System.out.println("Return sub class object");
	        return new CovariantType_04();
	    }
}



