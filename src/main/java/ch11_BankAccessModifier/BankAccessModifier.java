package ch11_BankAccessModifier;

public class BankAccessModifier {

        int accountNum;     //계좌번호
        String accountHolder;       // 이름
        int balance;   //잔액
        int pinNumber = 1234;      // 비밀번호 4자리
        int amount;
        int intputPin;

        public BankAccessModifier() {
        }

        public BankAccessModifier(int accountNum) {
            this.accountNum = accountNum;
        }

        public BankAccessModifier(int accountNum, String accountHolder) {
            this.accountNum = accountNum;
            this.accountHolder = accountHolder;
        }

        public BankAccessModifier(int accountNum, String accountHolder, int balance) {
            this.accountNum = accountNum;
            this.accountHolder = accountHolder;
            this.balance = balance;
        }

        public BankAccessModifier(int accountNum, String accountHolder, int balance, int pinNumber) {
            this.accountNum = accountNum;
            this.accountHolder = accountHolder;
            this.balance = balance;
            this.pinNumber = pinNumber;
        }

        /// ///////////////////

        public int getPinNumber() {
            return pinNumber;
        }

        public void setPinNumber(int pinNumber) {
            this.pinNumber = pinNumber;
        }

        public int getBalance() {
            return balance;
        }

        public void setBalance(int balance) {
            if (balance > 0) {
                this.balance = balance;
            }
        }

        /// ///////////////////

        public void deposit(int amount, int inputpin) {
            if (inputpin == pinNumber) {
                if (amount > 0) {
                    balance += amount;
                    System.out.println("입금 성공! 현재 잔액 : " + balance);
                } else {
                    System.out.println("불가능한 입금 금앱입니다.");
                    return;
                }

            } else {
                System.out.println("비밀번호가 틀렸습니다.");
            }
        }


        public void withraw (int amount, int inputpin) {
            if (inputpin == pinNumber){
               if (amount > 0){
                   if (balance - amount > 0){
                       balance -= amount;
                       System.out.println("출금 성공! 현재 잔액 : " + balance);
                   } else {
                       System.out.println("잔액이 부족합니다.");
                       return;
                   }
               } else {
                   System.out.println("불가능한 출금 금액입니다.");
                   return;
               }
            } else {
                System.out.println("비밀번호가 틀렸습니다.");
                return;
            }
        }

       public void showAccountInfo(){
            System.out.println("채수원 님의 계좌 번호는 " + accountNum + "이며, 현재 잔액은 " + balance + "입니다.");
        }
    }


