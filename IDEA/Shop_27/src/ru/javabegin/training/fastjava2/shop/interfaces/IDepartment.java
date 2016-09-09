package ru.javabegin.training.fastjava2.shop.interfaces;


import java.util.ArrayList;

/**
 * Created by vladimir on 28.08.16.
 */
public interface IDepartment {


    String getName();


    ArrayList<IEmployee> getEmployeeList();


    ArrayList<IGoods> getGoodsList();

}
