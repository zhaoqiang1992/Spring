package com.example.demo1;

public class Client {
    public static void main(String[] args) {
/*        Host host = new Host();
        host.rent();*/

        Host host = new Host();
        new Proxy(host).rent();
    }
}
