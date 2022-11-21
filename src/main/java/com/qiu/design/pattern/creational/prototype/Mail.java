package com.qiu.design.pattern.creational.prototype;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/16
 */
public class Mail implements Cloneable{
    private String name;
    private String address;
    private String Content;

    public Mail() {
        System.out.println("construct");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("clone");
        return super.clone();
        /*String没有clone方法，不能这么写，这里只是做个写法的例子
        Mail clone = (Mail) super.clone();
        clone.name=(String)clone.name.clone();*/
    }
}
