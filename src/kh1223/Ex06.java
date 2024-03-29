package kh1223;

interface MyFunction2 {
    void print();
}

public class Ex06 {
    public static void main(String[] args) {
        //이번에는 매개변수 없는 메소드를 구할 때 예제
        //인터페이스 객체명을 f로 선언하고 매개변수 괄호에 아무 것도 없이 화살표로
        //동작을 구현하면 된다
        MyFunction2 f = () -> {
            System.out.println("Hello");
        };
        f.print();;
        //한 번 구현된 메소드를 재구현할 수도 있다
        f = () -> {
            System.out.println("안녕");
        };
        f.print();
    }
}
