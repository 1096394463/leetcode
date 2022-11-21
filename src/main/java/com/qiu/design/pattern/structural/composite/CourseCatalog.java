package com.qiu.design.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/21
 */
public class CourseCatalog extends  CatalogComponent{
    private List<CatalogComponent> items=new ArrayList<>();
    private String name;

    private Integer lv;

    public CourseCatalog(String name, Integer lv) {
        this.name = name;
        this.lv = lv;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (CatalogComponent item : items) {
            if(Objects.nonNull(this.lv)){
                for (Integer i = 0; i < this.lv; i++) {
                    System.out.print("--");
                }
            }
            item.print();
        }
    }
}
