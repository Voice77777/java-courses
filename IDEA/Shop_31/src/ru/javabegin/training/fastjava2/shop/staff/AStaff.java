package ru.javabegin.training.fastjava2.shop.staff;

import ru.javabegin.training.fastjava2.shop.interfaces.IDepartment;
import ru.javabegin.training.fastjava2.shop.interfaces.IStaff;

/**
 * Created by vladimir on 25.08.16.
 */
public abstract class AStaff implements IStaff {

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
