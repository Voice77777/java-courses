package ru.javabegin.training.fastjava2.shop.goods;

import ru.javabegin.training.fastjava2.shop.department.ADept;
import ru.javabegin.training.fastjava2.shop.interfaces.IGoods;

/**
 * Created by vladimir on 25.08.16.
 */
public abstract class AGoods implements IGoods {

    public AGoods() {
    }

    public AGoods(String name){
        this.name = name;
    }

    //свойства которые будут иметь все товары
    private double price;

    private boolean hasGarantee;

    private String name;

    private ADept dept;

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
    public ADept getDept() {
        return dept;
    }

    public void setDept(ADept dept) {
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
