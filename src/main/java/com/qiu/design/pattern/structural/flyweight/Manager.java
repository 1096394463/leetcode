package com.qiu.design.pattern.structural.flyweight;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/21
 */
public class Manager implements Employee{
    private String department;
    private String reportContent;

    public Manager(String department) {
        this.department = department;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    @Override
    public void report() {
        System.out.println(reportContent);
    }
}
