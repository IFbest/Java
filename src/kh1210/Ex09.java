package kh1210;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력하시오: ");
        int score = scanner.nextInt();
        if (score >= 80) {
            System.out.println("축하합니다 합격입니다,");
        }else{
            System.out.println("다음기회에 불합격입니다");
        }
        scanner.close();
    }
}