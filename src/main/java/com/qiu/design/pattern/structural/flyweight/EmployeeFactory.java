package com.qiu.design.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/21
 */
public class EmployeeFactory {
    private static final Map<String, Employee> EMPLOYEE_MAP = new HashMap<>();

    public static Employee getManager(String department) {
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);
        if (Objects.isNull(manager)) {
            manager = new Manager(department);
            System.out.println("创建部门经理");
            manager.setReportContent("部门:" + department + "内容。。。。。");
            EMPLOYEE_MAP.put(department, manager);
            System.out.println("创建报告");
        }
        return manager;
    }
}
