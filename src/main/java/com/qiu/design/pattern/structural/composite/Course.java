package com.qiu.design.pattern.structural.composite;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/21
 */
public class Course extends CatalogComponent{
    private String name;
    private String price;

    public Course(String name, String price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public String getPrice(CatalogComponent catalogComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("CourseName:"+this.name+",价格"+this.price);
    }
}
