public class Student {
    private String name;
    private int age;

    // setter - set the value
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if(age > 0) this.age = age;
    }

    // getter - get the value
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

}
