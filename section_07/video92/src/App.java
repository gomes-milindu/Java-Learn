public class App extends Object{
    public static void main(String[] args){
        Student max = new Student("Max", 21);
        System.out.println(max);
    }


}

class Student{

    private String name;
    private int age;
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    
}
