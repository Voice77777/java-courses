package ru.javabegin.training.fastjava2.shop.goods;

import ru.javabegin.training.fastjava2.shop.department.BaseDept;
import ru.javabegin.training.fastjava2.shop.interfaces.IDepartment;
import ru.javabegin.training.fastjava2.shop.interfaces.IGoods;

/**
 * Created by vladimir on 25.08.16.
 */
public class BaseGoods implements IGoods {

    //свойства которые будут иметь все товары
    private double price;

    private boolean hasGarantee;

    private String name;

    private BaseDept dept;

    private String company;


    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean hasGarantee() {
        return hasGarantee;
    }

    public void setHasGarantee(boolean hasGarantee) {
        this.hasGarantee = hasGarantee;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public IDepartment getDept() {
        return dept;
    }

    public void setDept(BaseDept dept) {
        this.dept = dept;
    }

    @Override
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
