package com.mobai.designpattern.工厂方法;

public class ProductFactory {
    public static IProduct createProduct(String type) {
        if (type.equals("A")) {
            return new ProductA();
        }
        if (type.equals("B")) {
            return new ProductB();
        }
        return null;
    }
}
