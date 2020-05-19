package ex05;

import java.util.Scanner;

public class Ex05_Test03_1 {

    public static void main(String[] args) {

        int LArray[] = new int[4]; // 배열 선언과 생성
        int sum = 0; // 합계를 저장할 변수
        Scanner sc = new Scanner(System.in);
 
        System.out.println(LArray.length + " 개의 정수를 입력하시오 >> ");
 
        for (int i = 0; i < LArray.length; i++) {
            LArray[i] = sc.nextInt(); // 입력받은 값을 배열에 순서대로 저장
            sum += LArray[i]; // 배열에 저장된 값을 sum 변수에 저장
        }
        System.out.println("합계는 = " + sum);
    }
}


