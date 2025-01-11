public class Varargs {
    public static void main(String[] args){
        walk(1);
        walk(1, 2);
        walk(1, 2, 3, 4);
        walk(1, new int[]{2, 3, 4});
        walk(1, null);
    }
    
    static void walk(int index, int...nums){
        System.out.println("Varargs length :" + nums.length);
        for( int v : nums){
            System.out.println(v + " ");
        }
    }
}
