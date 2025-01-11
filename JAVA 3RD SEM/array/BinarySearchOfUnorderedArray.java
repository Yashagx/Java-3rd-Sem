import java.util.Arrays;

public class BinarySearchOfUnorderedArray {
    public static void main(String[] args){
        int[] numbers = new int[] { 3, 2, 1};
        System.out.println(Arrays.binarySearch(numbers, 2));
        System.out.println(Arrays.binarySearch(numbers, 3));
    }
}
