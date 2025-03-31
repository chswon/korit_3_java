package ch17_bean;

public class UserEntityMain {
    public static void main(String[] args) {
        UserEntity user1 = new UserEntity(1,9876,"a@test.com","채수원");

        System.out.println(user1);

        UserEntityLombok user2 = new UserEntityLombok();
        user2.setUsername(2);
        user2.setPassword(1357);
        user2.setEmail("b@test.com");
        user2.setName("김이");

        System.out.println("username : " + user2.getUsername());
        System.out.println("password: " + user2.getPassword());
        System.out.println("email : " + user2.getEmail());
        System.out.println("이름 : " + user2.getName());




    }
}
