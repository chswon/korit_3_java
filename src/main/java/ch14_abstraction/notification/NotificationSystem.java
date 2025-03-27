package ch14_abstraction.notification;

public abstract class NotificationSystem {
    private String sender;
    private String recipient;
    private String message;
    private int priority;

    public NotificationSystem(String sender, String recipient, String message, int priority) {
        this.sender = sender;
        this.recipient = recipient;
        this.message = message;
        this.priority = priority;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRecipient() {
        return recipient;
    }

    void pirntNotificationInfo(){
        System.out.println("[ 알림 정보 ]");
        System.out.println("From : " + sender);
        System.out.println("To : " + recipient);
        System.out.println("Message : " + message);
        System.out.println("Priority : " + priority);

    }

    void updateMessage(String newMessage){
        System.out.println("'" + this.message + "'가" + newMessage + "(으)로 변경되었습니다!");
        this.message = newMessage;

    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
       if(priority < 1 || priority > 5) {
           System.out.println("지정 불가능한 우선순위입니다.");
            return;
       }
        this.priority = priority;
    }

    public abstract void send();
    public abstract void validateRecipient();
    public abstract void formatMessage();

}
