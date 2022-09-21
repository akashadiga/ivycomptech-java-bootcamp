package Day5;

public class Student {
    private int id;
    private int age;
    private String name;
    private String course;

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        if(age<18 || age>21)
            throw new IllegalArgumentException("age should be in between 18 and 21");
        this.age = age;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
