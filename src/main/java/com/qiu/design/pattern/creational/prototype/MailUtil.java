package com.qiu.design.pattern.creational.prototype;

import java.text.MessageFormat;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/16
 */
public class MailUtil {
    public static void sendMail(Mail mail){
        String outputContent="向{0}发送邮件，邮件地址{1}，邮件内容{2}";
        System.out.println(MessageFormat.format(outputContent,mail.getName(),mail.getAddress(),mail.getContent()));
    }
    public static void  saveOriginMailRecord(Mail mail){
        System.out.println("存储原始记录:"+mail.getContent());
    }
}
