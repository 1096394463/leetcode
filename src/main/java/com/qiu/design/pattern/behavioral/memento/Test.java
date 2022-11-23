package com.qiu.design.pattern.behavioral.memento;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/23
 */
public class Test {
    public static void main(String[] args) {
        ArticleMementoManager articleMementoManager = new ArticleMementoManager();
        Article article = new Article("Java基础a", "xxxa", "imga");
        ArticleMemento articleMemento = article.saveToMemento();
        articleMementoManager.addMemento(articleMemento);
        System.out.println("标题:"+article.getTitle());
        System.out.println("手记"+article);

        article.setTitle("Java基础b");
        article.setImgs("imgb");
        article.setContent("xxxb");
        System.out.println("修改手记信息");
        System.out.println("手记："+article);

        System.out.println("开始回退");
        ArticleMemento memento = articleMementoManager.getMemento();
        article.undoFromMemento(memento);
        System.out.println("回退完成");
        System.out.println("手记："+article);

    }
}
