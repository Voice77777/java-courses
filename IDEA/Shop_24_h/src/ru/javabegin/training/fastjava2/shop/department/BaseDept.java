package ru.javabegin.training.fastjava2.shop.department;

import ru.javabegin.training.fastjava2.shop.goods.BaseGoods;
import ru.javabegin.training.fastjava2.shop.service.BaseEmployee;

import java.util.ArrayList;

/**
 * Created by vladimir on 25.08.16.
 */
public class BaseDept {

    private String name;
    private ArrayList<BaseEmployee> employeeList;
    private ArrayList<BaseGoods> goodsList;
}
