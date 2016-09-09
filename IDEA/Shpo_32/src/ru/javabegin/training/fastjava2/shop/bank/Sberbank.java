package ru.javabegin.training.fastjava2.shop.bank;

/**
 * Created by vladimir on 25.08.16.
 */
public class Sberbank extends ABank {


    public Sberbank(String name, String creditDescription) {
        super(name, creditDescription);
    }

    @Override
    public void checkInfo() {
        super.checkInfo();
    }
    //доработанная реализация

    @Override
    public void giveCredit() {
        super.giveCredit();
    }

    //сбербанк тоже умеет рассматривать срочные заявки с помощью перегруженого метода
    public void checkInfo(boolean critical){
        System.out.println("sberbank");
    }

    /*public String checkInfo(){    // демо ошибки
        return "kdkdkdl";
    }*/
}
