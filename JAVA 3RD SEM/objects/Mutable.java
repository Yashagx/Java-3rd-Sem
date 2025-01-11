public class Mutable {
    private String s;
    public void setS(String newS){ s = newS; }
    public String getS() { return s; }
    
    public static void main(String[] args){
        Mutable m = new Mutable();
        m.setS("Blabla");
        System.out.println(m.getS());
    }
}

