package groom.mission.java_basic2;

import java.util.Scanner;

public class Mission1 {

    public static void main(String[] args) {

        /* 목표. 홀수/짝수 판별 프로그램 작성하기 */
        System.out.println("정수를 입력해 주세요");

        Scanner sc = new Scanner(System.in);
        int num = new Scanner(System.in).nextInt();

        if (num%2==0) {

            System.out.println("입력하신 정수 " + num + "는 짝수입니다.");

        } else {

            System.out.println("입력하신 정수 " + num + "는 홀수입니다.");


        }

    }
}
