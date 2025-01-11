/*
 *  Local variables—in scope from declaration to end of block
 *  Instance variables—in scope from declaration until object garbage collected
 *  Class variables—in scope from declaration until program ends
 */
public class Mouse {
	static int MAX_LENGTH = 5;
	int length;
	
	public void grow(int inches) {	
		if (length < MAX_LENGTH) {
			int newSize = length + inches;
			length = newSize;
		}
	}
}
