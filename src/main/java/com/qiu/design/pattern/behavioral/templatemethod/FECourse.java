package com.qiu.design.pattern.behavioral.templatemethod;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/22
 */
public class FECourse extends ACourse{
    private boolean needWriteArticle=false;

    public FECourse(boolean needWriteArticle) {
        this.needWriteArticle = needWriteArticle;
    }

    @Override
    void packageCourse() {
        System.out.println("提供课程的前端代码");
        System.out.println("提供静态资源");
    }

    @Override
    protected boolean needWriteArticle() {
        return needWriteArticle;
    }
}
