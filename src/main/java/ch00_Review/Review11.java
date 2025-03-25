package ch00_Review;
/*
    User 클래스를 수정하여 password 필드를 외부에서 볼수 없도록 구성하고,
    대신 안전하게 값을 얻을 수 있는
    메서드를 User 클래스에 구현하시오.

    user1에 이름은 "user1"
    password는 qwer1234로 만들 수 있도록 메서드를 구현하시오.

    이후 Review11 클래스에서 password를 콘솔에 출력할 수 있도록 코드를 작성하시오.
 */
class User {
    public String name;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

public class Review11 {
    public static void main(String[] args) {
        User user1 = new User();
        user1.name = "user1";
        user1.setPassword("qwer1234");
        System.out.println(user1.getPassword());

    }
}
