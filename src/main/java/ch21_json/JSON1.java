package ch21_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class JSON1 {
    public static void main(String[] args) {
        JsonObject jsonObject = new JsonObject();
        // 속성(키-값 쌍)을 추가하는 메서드 -> addProperty() 메서드 사용
        jsonObject.addProperty("username",1);
        jsonObject.addProperty("password",1234);
        jsonObject.addProperty("email","c@test.com");
        jsonObject.addProperty("name","김일");

        System.out.println(jsonObject);

        /*
        Map과의 차이점을 확인하면
        1. Map에서는 key부분에 ""가 없었고, JSON에서는 모든 key가 String 자료형처럼 보이도록 ""가 있습니다.

        2. Map에서는 key1 = value1 의 형태로 작성되어 있었지만 JSON에서는 "key1:value1"의 형태로 작성되어있습니다,
         */

        jsonObject.addProperty("job","코리아 아이티아카데미");
        System.out.println(jsonObject);

        // 출력된 형태를 보니 한줄로 죽 늘어져있습니다
        // 그래서 가독성이 떨어지는 경우가 많으므로 추가적인 class를 import해서
        // 가독성을 개선한 방법으로 출력하는것을 pretty print라고 하는데,이를 지원하는 기능이 있습니다

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        // jsonObject를 prettyPrinting이 적용된 JSON 문자열 형태로 변환
        String json = gson.toJson(jsonObject);
        System.out.println(json);


    }
}
