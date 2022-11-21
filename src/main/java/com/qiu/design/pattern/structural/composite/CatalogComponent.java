package com.qiu.design.pattern.structural.composite;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/21
 */
public abstract class CatalogComponent {
    public void add(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public void remove(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持删除操作");
    }
    public String getName(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持获取操作");
    }
    public String getPrice(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持获取操作");
    }

    public void print(){
        throw new UnsupportedOperationException("不支持打印操作");
    }
}
