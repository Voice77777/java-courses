package ru.javabegin.training.fastjava2.shop.bank;

import ru.javabegin.training.fastjava2.shop.interfaces.IBank;

/**
 * Created by vladimir on 25.08.16.
 */
public class BaseBank implements IBank{

    private String name;

    private String creditDescription;

    @Override
    public void checkInfo() {

    }

    @Override
    public void giveCredit() {

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCreditDescription() {
        return creditDescription;
    }
}
