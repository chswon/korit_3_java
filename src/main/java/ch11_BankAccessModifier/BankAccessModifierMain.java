package ch11_BankAccessModifier;

import java.util.Scanner;

public class BankAccessModifierMain {
    public static void main(String[] args) {
        BankAccessModifier bankAccessModifier1 = new BankAccessModifier(123456789,"홍길동",100000);
        BankAccessModifier bankAccessModifier2 = new BankAccessModifier(987654321,"신사임당",500000);



        System.out.println("계좌 번호 : " + bankAccessModifier1.accountNum);
        System.out.println("계좌 소유자 : " + bankAccessModifier1.accountHolder);
        System.out.println("현재 잔액 : " + bankAccessModifier1.balance);
        System.out.println();
        System.out.println("계좌 번호 : " + bankAccessModifier2.accountNum);
        System.out.println("계좌 소유자 : " + bankAccessModifier2.accountHolder);
        System.out.println("현재 잔액 : " + bankAccessModifier2.balance);
        System.out.println();

        bankAccessModifier1.deposit(50000,1234);
        bankAccessModifier1.withraw(200000,1234);
        bankAccessModifier1.withraw(100000,1234);
        System.out.println();

        bankAccessModifier2.withraw(100000,1234);
        bankAccessModifier2.deposit(200000,1234);
        System.out.println();


        System.out.println("최종 계좌 정보");
        System.out.println("계좌 번호 : " + bankAccessModifier1.accountNum);
        System.out.println("계좌 소유자 : " + bankAccessModifier1.accountHolder);
        System.out.println("현재 잔액 : " + bankAccessModifier1.balance);
        System.out.println();
        System.out.println("계좌 번호 : " + bankAccessModifier2.accountNum);
        System.out.println("계좌 소유자 : " + bankAccessModifier2.accountHolder);
        System.out.println("현재 잔액 : " + bankAccessModifier2.balance);




    }

}
