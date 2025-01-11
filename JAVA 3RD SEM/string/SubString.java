public class SubString {
    public static void main(String[] args) {
        String string = "animals";
        System.out.println(string.substring(3));
        System.out.println(string.substring(string.indexOf('m')));
        System.out.println(string.substring(3, 4));
        System.out.println(string.substring(3, 7));
    }
}
