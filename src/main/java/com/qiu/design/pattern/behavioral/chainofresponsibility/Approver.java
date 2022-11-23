package com.qiu.design.pattern.behavioral.chainofresponsibility;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/23
 */
public abstract class Approver {
    protected Approver approver;
    public void setNextApprover(Approver approver){
        this.approver=approver;
    }
    public abstract void deploy(Course course);
}
