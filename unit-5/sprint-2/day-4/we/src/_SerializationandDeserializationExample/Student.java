package _SerializationandDeserializationExample;

import java.io.Serializable;

public class Student implements Serializable {
    int id;
    String name;
    int Marks;
    int age;

    public Student() {
    }

    public Student(int id, String name, int marks, int age) {
        this.id = id;
        this.name = name;
        Marks = marks;
        this.age = age;
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

    public int getMarks() {
        return Marks;
    }

    public void setMarks(int marks) {
        Marks = marks;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Marks=" + Marks +
                ", age=" + age +
                '}';
    }
}
