package ru.javabegin.training.fastjava2.shop.department;

import ru.javabegin.training.fastjava2.shop.goods.BaseGoods;
import ru.javabegin.training.fastjava2.shop.interfaces.IDepartment;
import ru.javabegin.training.fastjava2.shop.interfaces.IEmployee;
import ru.javabegin.training.fastjava2.shop.interfaces.IGoods;
import ru.javabegin.training.fastjava2.shop.service.BaseEmployee;

import java.util.ArrayList;

/**
 * Created by vladimir on 25.08.16.
 */
public abstract class BaseDept implements IDepartment{

    private String name;
    private ArrayList<IEmployee> employeeList;
    private ArrayList<IGoods> goodsList;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public ArrayList<IEmployee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<IEmployee> employeeList) {
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
