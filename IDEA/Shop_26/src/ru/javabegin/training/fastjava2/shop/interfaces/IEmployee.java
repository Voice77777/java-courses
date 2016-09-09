package ru.javabegin.training.fastjava2.shop.interfaces;

import ru.javabegin.training.fastjava2.shop.department.BaseDept;

/**
 * Created by vladimir on 28.08.16.
 */
public interface IEmployee {


    String getName();

    IDepartment getDept();

    boolean isFree();
}
