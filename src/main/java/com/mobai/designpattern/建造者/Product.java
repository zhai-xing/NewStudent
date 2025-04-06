package com.mobai.designpattern.建造者;

/**
 * 标准实现
 */
public class Product {
    private String name;
    private int age;
    private String sex;
    public Product(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

}

