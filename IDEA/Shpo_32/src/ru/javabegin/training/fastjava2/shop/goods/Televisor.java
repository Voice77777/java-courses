package ru.javabegin.training.fastjava2.shop.goods;

/**
 * Created by vladimir on 25.08.16.
 */
public class Televisor extends ElectronicDevice {


    public Televisor(String name) {
        super(name);
    }

    /*public void selectChannel(){
        System.out.println("select number channel");
    }*/

    public void selectChannel() {
        System.out.println("name channel " + "Discovery");
    }

    public void selectNumber() {
        System.out.println("number channel " + 8);
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
