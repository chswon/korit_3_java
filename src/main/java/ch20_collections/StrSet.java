package ch20_collections;

import java.util.*;

/*
    List는 순서가 있고, 중복을 혀용하는 반면,
    Set의 경우 순서는 없고 중복은 허용하지 않기 때문에
    List -> ser / 혹은 Set -> List 로의 형변환이 중요합니다.
    List를 통해 전체 설문을 받고, Set을 통해 중복을 제거하여
    후보군을 남기는 등의 형태로 많이 사용됩니다.
    또한 Set으로 중복을 제거한 후 .get(인덱스넘버)로 조회로 가능
 */
public class StrSet {
    public static void main(String[] args) {


        // Set 객체 생성
        Set<String> strset = new HashSet<>();
        List<String> strList = new ArrayList<>();

        // Set ekementy삽ㅇ립 -> add;
        strset.add("1");
        strset.add("1");
        strset.add("2");
        strset.add("2");
        strset.add("3");
        strset.add("3");
        strset.add("3");

        //Set의 출력
        System.out.println(strset); //순서를 보장x

        //특정 element의 추출 0> List로의 형변화ㅓㄴ
        strList.addAll(strset);


        //List로 바껐으니까 요소 추출 가능

        for (int i = 0 ; i < strList.size() ; i++){
            System.out.println(strList.get(i));
        }

        Collections.sort(strList);

        for (String elem : strset){
            System.out.println(elem);
        }

        //그렇다면 다시 strSet으로 옮기려면
        strset.addAll(strList);

        System.out.println(strset);

        //리스트 정렬한 버전을 set에 저장하기 위해 추가적으로 하나 더 선언






    }
}
