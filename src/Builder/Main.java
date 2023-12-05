package Builder;

public class Main {
    public static void main(String[] args) {
        Student student = Student.getBuilder()
                .setAge(10)
                .setId(1)
                .setName("John")
                .build();
        System.out.println(student.age);
    }
}
