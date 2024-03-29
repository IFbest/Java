package kh1224;

public enum Week {//열거객체로 힙영역에서 생성된다
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}
//열거 타입 : 몇 가지로 제한된 상수 가지는 타입//
//열거 타입 선언 : enum 타입{상수, 상수, ...}형태로 열거 타입 선언.
//열거 상수 : 열거 타입 선언 때 주어진 상수를 말하며 타입,상수 형태로 사용
//배열 생성 : 열거 타입으로 선언된 변수, 열거 타입 변수에 열거 상수 중 하나를 대입.
//메소드 영역, 스택 영역, 힙 영역