package ru.javabegin.training.fastjava2.shop.client;

import ru.javabegin.training.fastjava2.shop.interfaces.IVisitor;

/**
 * Created by vladimir on 25.08.16.
 */
public abstract class BaseVisitor implements IVisitor{


    private String name;

    public void buy(){

    }
    public void returnGoods(){

    }

    @Override
    public String getName() {
        return name;
    }
}
