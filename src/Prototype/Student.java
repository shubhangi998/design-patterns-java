package Prototype;

public class Student implements Prototype <Student>{
    int id;
    String name;
    int age;

    String batch;
    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public Student(){

    }
    public Student(Student student){
        this.batch = student.batch;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
