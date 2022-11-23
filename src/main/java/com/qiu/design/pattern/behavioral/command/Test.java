package com.qiu.design.pattern.behavioral.command;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/23
 */
public class Test {
    public static void main(String[] args) {
        CourseVideo courseVideo = new CourseVideo("Java基础");
        OpenCourseVideoCommand openCourseVideoCommand = new OpenCourseVideoCommand(courseVideo);
        CloseCourseVideoCommand closeCourseVideoCommand = new CloseCourseVideoCommand(courseVideo);
        Staff staff = new Staff();
        staff.addCommand(openCourseVideoCommand);
        staff.addCommand(closeCourseVideoCommand);
        staff.executeCommands();
    }
}
