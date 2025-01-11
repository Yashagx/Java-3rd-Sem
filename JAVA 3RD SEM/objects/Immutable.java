final class Immutable {
    private String s = "name";

    public Immutable() {
        s = "Default constructor";
    }
 
    public Immutable(String p) {
        s = p;
    }
    public String getS() { return s; }
    
    public static void main(String[] args){
        final Immutable i = new Immutable("immutable");
        System.out.println(i.getS());
    }
}
