package ch14_abstraction.notification;
/*

 */
public abstract class EmailNotification extends NotificationSystem{
    public EmailNotification(String sender, String recipient, String message, int priority) {
        super(sender, recipient, message, priority);
    }
    NotificationSystem notificationSystem1 =new NotificationSystem("admin@test.com","admin@test.com", "가입을 축하합니다!",2) {
        @Override
        public void send() {
            System.out.println("이메일 전송중 ...");
            System.out.println(notificationSystem1.getMessage());
            System.out.println("이메일전송 완료!");
        }

        @Override
        public void validateRecipient() {           //수신자 검증 @ 있는지를 확인
            // recipient 데이터에 @가 있는지 확인하기위한  조건문
            if (!getRecipient().contains("@")){     // String
                System.out.println("잘못된 이메일 주소 형식입니다.");
            } else {
                System.out.println("이메일 주소 형식이 유효합니다.");
            }
        }

        @Override
        public void formatMessage() {
            String formatted = "<p>" + getMessage() + "</p>";
            updateMessage(formatted);
            System.out.println("메세지가 HTML 형식으로 포맷되었습니다.");
        }
    };


}
