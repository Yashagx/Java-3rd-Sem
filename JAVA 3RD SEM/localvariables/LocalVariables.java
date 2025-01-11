public class LocalVariables {

	/*public int notValid() {
		int y = 10;
		int x;
		int reply = x + y;
		return reply;
	}*/

	public int valid() {
		int y = 10;
		int x;
		x = 3;
		int reply = x + y;
		return reply;
	}
	
	public void findAnswer(boolean check) {
		int answer;
		int onlyOneBranch;
		if (check) {
			onlyOneBranch = 1;
		} else {
			answer = 2;
		}
		System.out.println(answer);
		System.out.println(onlyOneBranch);
	}

}
