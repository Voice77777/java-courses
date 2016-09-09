package ru.javabegin.training.fastjava2.shop.department;

import ru.javabegin.training.fastjava2.shop.interfaces.IDepartment;
import ru.javabegin.training.fastjava2.shop.interfaces.IStaff;
import ru.javabegin.training.fastjava2.shop.interfaces.IGoods;

import java.util.ArrayList;

/**
 * Created by vladimir on 25.08.16.
 */
public abstract class ADept implements IDepartment{

    private String name;
    private ArrayList<IStaff> employeeList;
    private ArrayList<IGoods> goodsList;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public ArrayList<IStaff> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<IStaff> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public ArrayList<IGoods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(ArrayList<IGoods> goodsList) {
        this.goodsList = goodsList;
    }
}
