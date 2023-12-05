package Prototype;

public class IntelligentStudent extends Student{
    int iq;
    public IntelligentStudent(){

    }
    public IntelligentStudent(IntelligentStudent intelligentStudent) {
        super(intelligentStudent);
        this.iq = intelligentStudent.iq;
    }

    public Student clone(){
        return new IntelligentStudent(this);
    }
}
