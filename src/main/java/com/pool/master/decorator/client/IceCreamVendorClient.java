package com.pool.master.decorator.client;

import com.learn.master.decorator.model.BasicIceCream;
import com.learn.master.decorator.model.MintIceCream;
import com.learn.master.decorator.model.VanilaIceCream;
import com.learn.master.decorator.service.IceCream;

public class IceCreamVendorClient {
    public static void main(String[] args) {
        IceCream baseIceCream = new BasicIceCream();
        System.out.println(baseIceCream.cast());

        IceCream vCream = new VanilaIceCream(baseIceCream);
        System.out.println(vCream.cast());

        IceCream iceCream = new MintIceCream(baseIceCream);
        System.out.println(iceCream.cast());
    }
}
