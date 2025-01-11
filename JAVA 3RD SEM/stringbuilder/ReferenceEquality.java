public class ReferenceEquality {
    public static void main(String[] args){
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = one.append("a");
        System.out.println(one == two);
        System.out.println(one == three);
    }
}
