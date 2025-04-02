package ch21_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Data
class User{
    private String username;
    private String password;
    private String email;
    private String name;
    private String age;
}


public class JSON {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();

        //사용할 변수 선언
        String userJson = null;
        String student = null;
        String productJson = null;

        //Java 오브젝트에서 JSON으로의 변환 사례
        User user1 = new User("kim1", "9876", "a@test.com","김일","20");


        System.out.println(gson.toJson(user1));

        System.out.println(gsonBuilder.toJson(user1));

        userJson = gsonBuilder.toJson(user1);

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("studentCode","2025001");
        jsonObject.addProperty("studentName","김이");
        jsonObject.addProperty("studentYear","2");
        jsonObject.addProperty("score","96.7");
        student = gsonBuilder.toJson(jsonObject);
        System.out.println(student);

        //Map에서 JSON에서의 횔용사례


        Map<String, String> map = new HashMap<>();
        map.put("productCode", "NT960XHA-KD726");
        map.put("productName", "삼성 갤럭시북 프로5");

        productJson = gsonBuilder.toJson(map);

        System.out.println(productJson);

        //그럼 json에서 객체/map으로 바꾸려면 어떻게할까
        // user / jsonobject
        // 형식 :
        // gson.fromJson(제이슨데이터, 바꾸고자하는 클래스);

        // json -> map
        Map<String, String > map2 = gson.fromJson(productJson, Map.class);
        System.out.println(map2);

        // json -> user
        // 그러면 userJson을 User 클래스의 user2에 대입하려면?
        User user2 = gson.fromJson(userJson, User.class);
        System.out.println(user2);

        // json -> jsonObject
        // 그러면 studentJson을 jsonObject2로 대입
        JsonObject jsonObject2 = gson.fromJson(student, JsonObject.class);
        System.out.println(jsonObject2);























    }
}
