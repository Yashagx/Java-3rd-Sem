public class OrderOfInitializationII {
	
	{ System.out.println(name); }

	private String name = "Fluffy";

	public OrderOfInitializationII() {
		name = "Tiny";
		System.out.println("setting constructor");
	}

	public static void main(String[] args){
		OrderOfInitializationII o = new OrderOfInitializationII();
		System.out.println(o.name);
	}


}
