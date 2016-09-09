package ru.javabegin.training.fastjava2.shop;

import ru.javabegin.training.fastjava2.shop.interfaces.IDepartment;
import ru.javabegin.training.fastjava2.shop.interfaces.IVisitor;
import ru.javabegin.training.fastjava2.shop.service.Administrator;

import java.util.ArrayList;


public class SalesRoom {


    private ArrayList<IDepartment> deptList;//в какждом отделе есть свои сотрудники

    private String name;

    private ArrayList<IVisitor> visitorList;

    private Administrator administrator;
    

}
