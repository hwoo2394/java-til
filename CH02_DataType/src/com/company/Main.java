package com.company;

/**
 * 자료형 (data type)
 * primitivie type 기본형
 * reference type 참조형
 * 기본형 자료형 - 정수형 실수형 논리형, 문자형
 */
public class Main {

    public static void main(String[] args) {
        // 기본적으로 정수형: byte, short, int, long
        //메모리 효울성 때문에 필요해따라서 변수타입이용.
        //127를 넘는순간 안된다.
        //byte byteValue =128;
        System.out.println("Byte");
        System.out.println(Byte.BYTES);
        byte byteValue = 42;
        System.out.println(byteValue);
        System.out.println(Byte.MAX_VALUE); // 2^7 -1
        System.out.println(Byte.MIN_VALUE); // -2^7
        System.out.println("");


        System.out.println("Short");
        System.out.println(Short.BYTES);
        System.out.println(Short.MAX_VALUE);// 2 ^ 15 -1
        System.out.println(Short.MIN_VALUE); //-2 ^ 15
        System.out.println("");

        System.out.println("Int");
        System.out.println(Integer.BYTES);
        System.out.println(Integer.MAX_VALUE);// 2 ^ 31 -1
        System.out.println(Integer.MIN_VALUE); //-2 ^ 31
        System.out.println("");

        System.out.println("Long");
        System.out.println(Long.BYTES);
        System.out.println(Long.MAX_VALUE);// 2 ^ 63 -1
        System.out.println(Long.MIN_VALUE); //-2 ^ 63
        System.out.println("");

        //Overflow 값이 넘치면 생기는 이유
        //32767 = 2^15-1 --> 011111111111111
        //64000 =-> 100111110000010000111
        // 앞에 1이면 음수 1 이아니면 양수
        short shortValue = (short)64000;
        System.out.println(shortValue);

        //정수형은 기본적으로 int
        //byte byteValue3 = 144;
        //shortA 와 shortB 더하면 integer가된다.
        short shortA = 10;
        short shortB = 20;
        short shortC = (short) (shortA + shortB);

        int bigInt = Integer.MAX_VALUE;
        int biggerInt = bigInt+1; //Overflow주의를 해줘야한다 경고를 안준다.
        System.out.println(biggerInt);

        long veryBigInt = 10000000000000000L;//Large L 로 써주면된다.
        System.out.println(veryBigInt);

        //진수법 2진수 8진수 10진수 16진수까지....
        //2진수 Binary, 8진수 Octal, 10진수 Decimal, 16진수 Hexadecimal

        System.out.println(0b1101); //앞에 0b를 넣고 숫자를 입력한다. 13
        System.out.println(071); //앞에 0만있으면 8진수
        System.out.println(1424); //10진수
        System.out.println(0xff);//16진수 0~9,10~15: a,b,c,d,e,f

        byte flagByte = 0b00101100;

    }
}
