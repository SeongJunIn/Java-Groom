package com.seongjun.section01.polymerphism;

public class Rabbit extends Animal {

    @Override
    public void eat(){
        System.out.println("토끼가 풀을 뜯어 먹고 있습니다.");
    }

    @Override
    public void run(){
        System.out.println("토기가 달려갑니다. 깡총~ 깡총");
    }

    @Override
    public void cry(){
        System.out.println("토끼가 울음을 소리를 냅니다. 끼익~ 끼익~");
    }

    public void jump(){
        System.out.println("토끼가 점프합니다. 점프!!!");
    }
}
