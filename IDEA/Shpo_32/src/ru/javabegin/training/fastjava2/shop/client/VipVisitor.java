package ru.javabegin.training.fastjava2.shop.client;

import ru.javabegin.training.fastjava2.shop.interfaces.IGoods;

/**
 * Created by vladimir on 25.08.16.
 */
public class VipVisitor extends AVisitor {

    private float discount;

    @Override
    public void buy(IGoods goods){
        if (!checkDiscount()) {
            super.buy(goods);
        }
        else {
            //купить со скидкой
        }

    }


    private boolean checkDiscount() {
        return discount > 0;
    }

}
