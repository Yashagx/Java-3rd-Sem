public class InitializerBlock {
	
	static int count = 0;
	public static void main(String[] args){
		System.out.println("Feathers");
		System.out.println(InitializerBlock.count);
	}

	{
		count = 1;
		System.out.println("Snowy");
	}
}
