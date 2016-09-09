package ru.javabegin.training.fastjava2.shop.goods;

/**
 * Created by vladimir on 25.08.16.
 */
public class Televisor extends ElectronicDevice {


    public Televisor(String name) {
        super(name);
    }

    public void selectChannel(){
        System.out.println("select channel");

    }

    @Override
    public void on() {
        super.on();
    }

    @Override
    public void off() {
        super.off();
    }
}
