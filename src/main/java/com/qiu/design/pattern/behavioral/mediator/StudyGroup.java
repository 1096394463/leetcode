package com.qiu.design.pattern.behavioral.mediator;

import java.util.Date;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/23
 */
public class StudyGroup {
    public static void showMessage(User user,String message){
        System.out.println(new Date().toString()+"["+user.getName()+"]:"+message);
    }
}
