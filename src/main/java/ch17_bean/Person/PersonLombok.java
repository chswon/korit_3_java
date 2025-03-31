package ch17_bean.Person;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@NonNull
@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class PersonLombok {
    private final String name;
    private int age;

    //이상의 경우 동일하게 privare final String name을 했을 때
    // 오류가 발생했지만, alt + ins 가 아니라 Lombok을 통해서 해결

    // RequiredArgsConstructor는 필드의 final을 감지해서
    // 걔가 포함되어 있는 매개변수 생성자를 자동으로 만들어줍니다.

    //그리고 @Data 로 수정


    @Override
    public String toString() {
        return "이름 : " + name + "\n나이 : " + age;
    }
}
