package com.qiu.design.pattern.creational.buider.v2;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/15
 */
public class Course {
    private String name;
    private String type;
    private String video;
    private String article;
    private String qa;

    public Course(CourseBuilder courseBuilder) {
        this.name = courseBuilder.name;
        this.type = courseBuilder.type;
        this.video = courseBuilder.video;
        this.article = courseBuilder.article;
        this.qa = courseBuilder.qa;
    }

    public static class CourseBuilder {
        private String name;
        private String type;
        private String video;
        private String article;
        private String qa;

        public CourseBuilder buildName(String name) {
         this.name=name;
         return this;
        }
        public CourseBuilder buildType(String type) {
            this.type=type;
            return this;
        }
        public CourseBuilder buildVideo(String video) {
            this.video=video;
            return this;
        }
        public CourseBuilder buildArticle(String article) {
            this.article=article;
            return this;
        }
        public CourseBuilder buildQa(String qa) {
            this.qa=qa;
            return this;
        }
        public Course build(){
            return new Course(this);
        }
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", video='" + video + '\'' +
                ", article='" + article + '\'' +
                ", qa='" + qa + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getQa() {
        return qa;
    }

    public void setQa(String qa) {
        this.qa = qa;
    }


}
