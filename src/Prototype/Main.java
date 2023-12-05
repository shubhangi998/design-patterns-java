package Prototype;

public class Main {

    public static void fillRegistry(StudentRegistry studentRegistry){
        Student april23Batch = new Student();
        april23Batch.setBatch("April 23");
        studentRegistry.register("april23Batch",april23Batch);
    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);
        Student student = studentRegistry.get("april23Batch").clone();
        System.out.println(student.getBatch());
    }
}
