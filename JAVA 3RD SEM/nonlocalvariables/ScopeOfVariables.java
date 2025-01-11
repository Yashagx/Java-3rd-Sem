public class ScopeOfVariable {
	public void eatIfHungry(boolean hungry) {
		if (hungry) {
			int bitesOfCheese = 1;
			{
				boolean teenyBit = true;
				System.out.println(bitesOfCheese);
			}
		}
		System.out.println(teenyBit);
	}
}
