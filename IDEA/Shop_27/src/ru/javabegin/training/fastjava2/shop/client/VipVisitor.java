package ru.javabegin.training.fastjava2.shop.client;

/**
 * Created by vladimir on 25.08.16.
 */
public class VipVisitor extends BaseVisitor {

    private float discount;

    @Override
    public void buy(){
        if (!checkDiscount()) {
            super.buy();}
        else {
            //купить со скидкой
        }

    }
    private boolean checkDiscount() {
        return discount > 0;
    }
}
