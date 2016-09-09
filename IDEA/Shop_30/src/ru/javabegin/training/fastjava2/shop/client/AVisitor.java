package ru.javabegin.training.fastjava2.shop.client;

import ru.javabegin.training.fastjava2.shop.goods.Televisor;
import ru.javabegin.training.fastjava2.shop.interfaces.IGoods;
import ru.javabegin.training.fastjava2.shop.interfaces.IVisitor;

/**
 * Created by vladimir on 25.08.16.
 */
public abstract class AVisitor implements IVisitor{


    private String name;

    @Override
    public void buy(IGoods goods) {
        System.out.println(goods.getName());

        //if (goods instanceof Televisor){ проверка, если не телевизор, то невыдает
        //((Televisor)goods).selectChannel();
        }
    }

    @Override
    public void returnGoods(IGoods goods) {

    }

    @Override
    public String getName() {
        return name;
    }

}
