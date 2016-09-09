package ru.javabegin.training.fastjava2;

import ru.javabegin.training.fastjava2.objects.Phone;

public class Main {

    public static void main(String[] args) {
        Phone phone = new Phone(1024, "Sumsung", "GSM");

        System.out.println("phone.getType() = " + phone.getType());
        System.out.println("phone.getRam()  = " + phone.getRam());


    }
}
