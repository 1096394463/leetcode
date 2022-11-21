package com.qiu.design.pattern.structural.flyweight;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/21
 */
public class Test {
    public static final String departments[]={"RD","QA","PM"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String department = departments[(int) (Math.random() * departments.length)];
            Employee manager = EmployeeFactory.getManager(department);
            manager.report();
        }
    }
}
