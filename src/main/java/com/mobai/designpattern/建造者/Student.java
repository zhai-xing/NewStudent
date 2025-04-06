package com.mobai.designpattern.建造者;


/**
 * 简化实现
 */
public class Student {
    private String name;
    private int age;
    private String sex;

    public Student() {
    }

    public static  Student builder(){
        return new Student();
    }

    public Student name(String name) {
        this.name = name;
        return this;
    }
    public Student age(int age) {
        this.age = age;
        return this;
    }
    public Student sex(String sex) {
        this.sex = sex;
        return this;
    }

    public Student build(){
        validate(this);
        return this;
    }

    private void validate(Student student){

        //校验规则
        if (student.name == null){
            throw new RuntimeException("name is null");
        }
    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

}
