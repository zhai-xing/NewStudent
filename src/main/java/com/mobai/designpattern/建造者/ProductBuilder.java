package com.mobai.designpattern.建造者;

public interface ProductBuilder {
    void buildName(String name);

    void buildAge(int age);

    void buildSex(String sex);

    Product build();

}
