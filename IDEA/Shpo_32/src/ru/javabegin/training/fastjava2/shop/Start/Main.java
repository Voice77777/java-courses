package ru.javabegin.training.fastjava2.shop.Start;

import ru.javabegin.training.fastjava2.shop.bank.Sberbank;
import ru.javabegin.training.fastjava2.shop.bank.VTB;
import ru.javabegin.training.fastjava2.shop.client.CommonVisitor;
import ru.javabegin.training.fastjava2.shop.goods.Computer;
import ru.javabegin.training.fastjava2.shop.goods.Subwoofer;
import ru.javabegin.training.fastjava2.shop.goods.Televisor;
import ru.javabegin.training.fastjava2.shop.interfaces.IGoods;

/**
 * Created by vladimir on 01.09.16.
 */
public class Main {
    public static void main(String[] args) {

        /*IGoods goods = new Televisor("Sumsung");
        Televisor t = (Televisor)goods;

        ((Televisor)goods).selectChannel();

        //goods = new Subwoofer("Sony");
        Subwoofer subwoofer = new Subwoofer("Microlab");
        Computer computer = new Computer("MacBook");
        Computer computer2 = new Computer("Asus");

        CommonVisitor commonVisitor = new CommonVisitor();

        commonVisitor.buy(goods);
        commonVisitor.buy(computer);
        commonVisitor.buy(computer2);
        commonVisitor.buy(subwoofer);*/
        Sberbank sberbank = new Sberbank("Sberbank", "test desc");
        sberbank.checkInfo(true);
        sberbank.checkInfo();
        sberbank.checkInfo();

        VTB vtb = new VTB("VTB", "test desc");
        vtb.checkInfo();
        vtb.checkInfo();

        Televisor televisor = new Televisor("Sony");

        televisor.selectChannel();
        televisor.selectNumber();


        System.out.println("Sberbank.requestCount = " + Sberbank.requestCount);





    }
}
