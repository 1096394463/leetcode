package com.qiu.design.pattern.behavioral.memento;

import java.util.Stack;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/23
 */
public class ArticleMementoManager {
    private final Stack<ArticleMemento> ARTICLE_MEMENTO_STACK = new Stack<>();

    public ArticleMemento getMemento() {
        ArticleMemento pop = ARTICLE_MEMENTO_STACK.pop();
        return pop;
    }

    public void addMemento(ArticleMemento articleMemento) {
        ARTICLE_MEMENTO_STACK.push(articleMemento);
    }
}
