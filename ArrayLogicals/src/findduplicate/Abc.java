package findduplicate;

public class Abc {
	private static Abc obj;
	
	private Abc() {
		// TODO Auto-generated constructor stub
	}
	
	public static Abc getInstance() {
//		return obj;
		if(obj==null) {
			obj= new Abc();
			return obj;
		}
		else {
			return obj;
		}
	}


}
