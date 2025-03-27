package ch14_abstraction.notification;
/*

 */
public class NotificationMain {
    public static void main(String[] args) {
        EmailNotification emailNotification = new EmailNotification("admin@test.com", "admin@test.com", "가입 대기", 1) {

            @Override
            public void send() {

            }

            @Override
            public void validateRecipient() {

            }

            @Override
            public void formatMessage() {

            }



//            emailNotification.setPriority(8);               //불가능
//        System.out.println(emailNotification.getPriority()); //여전히 1임을 확인가능
//        emailNotification.pirntNotificationInfo();
//        emailNotification.validateRecipient();          //얘는 만들때 똑바로 만들어놨기 때문에
//            // 실패 사례를확인하고 싶다면 추가적인 객체를 생성하거나 혹은 setter를통해
//            // recipient 필드를 수정하는 방법도 고려할수 있겠습니다. -> setter를 만든다면
//            //NotificationSystem에 setRecipient를 추가해야겠죠.
//        emailNotification.send();

        };
    }
}
