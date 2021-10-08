
class Singletone{
	private static Singletone _INSTANCE= null;
	private Singletone() {
		System.out.println("Object created...");
	}
	
	public static Singletone getInstance() {
		if(_INSTANCE == null) {
			_INSTANCE = new Singletone();
		}
		return _INSTANCE;
	}
}

public class SingletonClassDemo {

	public static void main(String[] args) {
		System.out.println("This is singleDemo...");
		Singletone objX = Singletone.getInstance();
		Singletone objY = Singletone.getInstance();
		
		System.out.println("objX =>"+ objX);
		System.out.println("objY =>"+ objY);
	}
}
