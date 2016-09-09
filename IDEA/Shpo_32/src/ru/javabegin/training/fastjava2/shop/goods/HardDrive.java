package ru.javabegin.training.fastjava2.shop.goods;

/**
 * Created by vladimir on 25.08.16.
 */
public class HardDrive extends ElectronicDevice {

    private int volume;


    public void format(){

    }

    public void copy(){

    }

    public void delete(){

    }

    @Override
    public void on() {
        super.on();//спецефическое включение
    }

    @Override
    public void off() {
        super.off();//спецефическое выключение
    }
}
