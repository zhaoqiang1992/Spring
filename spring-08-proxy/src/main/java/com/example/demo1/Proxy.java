package com.example.demo1;

// 代理
public class Proxy implements Rent{
    private Host host;
    Proxy() {}
    public Proxy(Host host) {
        seeHouse();
        this.host = host;
        hetong();
        fare();
    }

    @Override
    public void rent() {
        host.rent();
    }
    // 看房
    public void seeHouse() {
        System.out.println("中介带你看房");
    }

    // 签合同
    public void hetong() {
        System.out.println("签合同");
    }

    // 收取中介费
    public void fare() {
        System.out.println("中介收取中介费");
    }
}
