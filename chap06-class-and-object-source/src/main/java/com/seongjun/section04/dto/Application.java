package com.seongjun.section04.dto;

public class Application {

    public static void main(String[] args){

        /* 목표. 생성자를 이용한 초기화와 설정자를 이용한 초기화의 장단점을 이해할 수 있다. */
        /* 생성자를 이용한 초기화와 설정자를 이용한 초기화는 각각의 장단점이 존재한다. */
        /* 1. 생성자를 이용한 초기화
         * 장점 : setter 메소드를 여러 번 호출해서 사용하지 않고 단 한번의 호출로 인스턴스를 생성 및 초기화 할 수 있다.
         * 단점 : 필드를 초기화할 매개변수의 갯수를 경우의 수 별로 모두 만들어둬야 한다.
         *       호출 시 인자가 많아지는 경우 어떠한 값이 어떤 필드를 의미하는지 한 눈으러 보기 힘들다.
         *       예) 아이디, 비밀번호, 이름이 모두 ohgiraffers인 경우
         *       new User("ohgiraffers", "ohgiraffers", "ohgiraffers"); 몇 번째 인자가 아이디인지 이름인지 알 수 없다.
         * 2. 설정자를 이용한 초기화
         * 장점 : 필드를 초기화하는 각각의 값들이 어떤 필드를 초기화하는지 명확하게 볼 수 있다.
         *          예) 아이디, 비밀번호, 이름이 모두 ohgiraffers인 경우
         *            User user = new User();
         *            user.setId("ohgiraffers");
         *            user.setPwd("ohgiraffers");
         *            user.setName("ohgiraffers");
         *          호출하는 코드만 봐도 어떤 값이 어떤 필드를 초기화하는 내용인지 쉽게 알 수 있다.
         * 단점 : 하나의 인스턴스를 생성할 때 한 번의 호출로 끝나지 않는다.
         */

        /* 1. 생성자를 이용한 초기화 */
//        UserDTO user1 = new UserDTO()

    }
}
