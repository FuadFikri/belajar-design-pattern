package com.syamsudin.singleton.unsafe_thread_1;

public class SingletonApp {

    public static void main(String[] args) {
        OrderService orderService = new OrderService();

        orderService.save("fried chicken");
    }
}
