package Builder;

public class Student {
    int id;
    int age;
    String name;

    private Student(Builder builder) {
        this.age = builder.age;
        this.id = builder.id;
        this.name = builder.name;
    }

    static class Builder{
        int id;
        int age;
        String name;

        public int getId() {
            return id;
        }

        public Builder setId(int id) {
            this.id = id;
            return  this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Student build(){
            if(age > 25){
                throw new IllegalArgumentException();
            }
            return new Student(this);
        }
    }
    public static Builder getBuilder(){
        return new Builder();
    }
}
