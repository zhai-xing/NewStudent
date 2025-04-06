package com.mobai.designpattern.建造者;

public class ConcreteBuilder  implements ProductBuilder{

    private String name;
    private int age;
    private String sex;


    @Override
    public void buildName(String name) {
        this.name=name;

    }

    @Override
    public void buildAge(int age) {
        this.age=age;
    }

    @Override
    public void buildSex(String sex) {
        this.sex=sex;
    }

    @Override
    public Product build() {
        return new Product(name,age,sex);
    }
}
