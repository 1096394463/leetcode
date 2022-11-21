package com.qiu.design.pattern.creational.prototype;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/16
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模版");
        for (int i = 0; i < 10; i++) {
            Mail clone = (Mail) mail.clone();
            clone.setName("姓名"+i);
            clone.setAddress(i+"@abc.com");
            clone.setContent("恭喜恭喜");
            MailUtil.sendMail(clone);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
