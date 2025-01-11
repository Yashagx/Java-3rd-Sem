class Camel {
    private String getNumbersOfHumps() {
        return "Undefined";
    }    
}

class BactrianCamel extends Camel {
    private int getNumbersOfHumps() {
        return 2;
    }
}

public class PrivateMethodRedeclaration {

    public static void main(String[] args) {
        BactrianCamel b = new BactrianCamel();
    }
}
