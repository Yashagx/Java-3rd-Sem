public class Animal {
    private int     age;
    private String  name;
    
    public Animal(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }

    public Animal(int age) {
        super();

        this.age = age;
        this.name = null;
    }

    public void setAge(int age) {
        if (age > 0) 
            this.age = age;
    }
    
    public int getAge() {
        return age;
    }
}
