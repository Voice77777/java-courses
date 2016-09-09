package ru.javabegin.training.fastjava2.shop.service;

import ru.javabegin.training.fastjava2.shop.department.BaseDept;
import ru.javabegin.training.fastjava2.shop.interfaces.IDepartment;
import ru.javabegin.training.fastjava2.shop.interfaces.IEmployee;

/**
 * Created by vladimir on 25.08.16.
 */
public class BaseEmployee implements IEmployee {

    private String name;
    private IDepartment dept;
    private boolean free;

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

    public void setDept(IDepartment dept) {
        this.dept = dept;
    }

    @Override
    public boolean isFree() {
        return isFree();
    }

    public void setFree(boolean free) {
        this.free = free;
    }
}
