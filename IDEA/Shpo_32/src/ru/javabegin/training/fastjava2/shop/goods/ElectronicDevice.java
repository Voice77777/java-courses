package ru.javabegin.training.fastjava2.shop.goods;

import ru.javabegin.training.fastjava2.shop.interfaces.IElectronicDevice;

/**
 * Created by vladimir on 25.08.16.
 */
public class ElectronicDevice extends AGoods implements IElectronicDevice{


    public ElectronicDevice (){

    }

    public ElectronicDevice (String name){
        super(name);

    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }
}
