package com.seongjun.section03.wrapper;

public class Application3 {

    public static void main(String[] args){

        /* 목표. 기본자료형 값을 문자열로 변경할 수 있다. */

        /*  valueOf() : 기본자료형 값을 Wrapper 클래스 타입으로 변환시키는 메소드
         *  toString() : 필드값을 문자열로 반환하는 메소드
         * */

        String b = Byte.valueOf((byte)1).toString();
        String s = Short.valueOf((short)2).toString();
        String i = Integer.valueOf((int)4).toString();
        String l = Long.valueOf(8L).toString();
        String f = Float.valueOf(4.0f).toString();
        String d = Double.valueOf(8.0).toString();
        String bl = Boolean.valueOf(true).toString();
        String c = Character.valueOf('a').toString();

        /* String클래스의 valueOf를 사용할 수도 있다. */
        String str = String.valueOf(10);

        /* 문자열 합치기를 이용해 String으로 변환할 수도 있다. */
        String str2 = 123 +"";

        System.out.println(str2);

        if (str instanceof String) {
            System.out.println("문자열입니다.");
        } else {
            System.out.println("문자열이 아닙니다.");
        }
    }
}
