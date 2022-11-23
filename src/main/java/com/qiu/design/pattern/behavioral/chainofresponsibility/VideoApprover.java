package com.qiu.design.pattern.behavioral.chainofresponsibility;

import org.springframework.util.StringUtils;

import java.util.Objects;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/23
 */
public class VideoApprover extends Approver{
    @Override
    public void deploy(Course course) {
        if(!StringUtils.isEmpty(course.getVideo())){
            System.out.println("批准"+course.getName());
            if(Objects.nonNull(approver)){
                approver.deploy(course);
            }
        }else {
            System.out.println("审批失败!");
        }
    }
}
