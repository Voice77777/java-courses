package ru.javabegin.training.fastjava2.shop.interfaces;

/**
 * Created by vladimir on 28.08.16.
 */
public interface IGoods {


    double getPrice();

    boolean hasGarantee();

    String getName();

    IDepartment getDept();

    String getCompany();
}
