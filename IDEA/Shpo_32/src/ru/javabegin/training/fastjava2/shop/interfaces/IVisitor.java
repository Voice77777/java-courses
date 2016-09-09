package ru.javabegin.training.fastjava2.shop.interfaces;

/**
 * Created by vladimir on 28.08.16.
 */
public interface IVisitor {


    void buy(IGoods goods);

    void returnGoods(IGoods goods);

    String getName();

}
