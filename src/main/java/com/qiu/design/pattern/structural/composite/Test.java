package com.qiu.design.pattern.structural.composite;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/21
 */
public class Test {
    public static void main(String[] args) {
        Course linuxCourse = new Course("Linux课程", "110");
        Course windowsCourse = new Course("Windows课程", "120");
        Course java1Course = new Course("java电商", "10");
        Course java2Course = new Course("设计模式", "210");
        CourseCatalog java = new CourseCatalog("Java目录",2);
        CourseCatalog all = new CourseCatalog("总目录",1);
        all.add(linuxCourse);
        all.add(windowsCourse);
        java.add(java1Course);
        java.add(java2Course);
        all.add(java);
        all.print();
    }
}
