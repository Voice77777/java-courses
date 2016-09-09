package ru.javabegin.training.fastjava2.shop.bank;

import ru.javabegin.training.fastjava2.shop.interfaces.IBank;

/**
 * Created by vladimir on 25.08.16.
 */
public abstract class ABank implements IBank{

    //количество заявок по всем банкам(можно также реализовывать через колекцию)
    public static int requestCount;
    private String name;
    private String creditDescription;

    public ABank(String name, String creditDescription) {
        this.name = name;
        this.creditDescription = creditDescription;
    }

    @Override
    public void checkInfo() {
        requestCount++;
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
