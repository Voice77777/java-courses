package ru.javabegin.training.fastjava2.shop.client;

import ru.javabegin.training.fastjava2.shop.interfaces.IGoods;
import ru.javabegin.training.fastjava2.shop.interfaces.IVisitor;

/**
 * Created by vladimir on 25.08.16.
 */
public abstract class AVisitor implements IVisitor{


    private String name;

    @Override
    public void buy(IGoods goods) {
        System.out.println(goods.getName());
    }

    @Override
    public void returnGoods(IGoods goods) {

    }

    @Override
    public String getName() {
        return name;
    }

}
