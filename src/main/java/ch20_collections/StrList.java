package ch20_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StrList {
    public static void main(String[] args) {


    List<String> strList = new ArrayList<>();
    int[] intArray = new int[3];        //인덱스넘버를 고정시켜야 함.

    //배역에 값을 넣는 방법
    intArray[0] = 1;

    // List에 값을 넣는 방법   -> 특정한 메서드를 통해서 값을 집언허음
        strList.add("Java");
        strList.add("python");
        strList.add("C#");
        strList.add("C#");
        strList.add("JavaScript");
        strList.add("Kotlin");

    //출력
        System.out.println(intArray);       // 이러면 주소값만 나온다
        System.out.println(Arrays.toString(intArray));
        System.out.println(strList);        //얘는 toString()이 정의돼있음.

        //특전 element(리스트 내의) 검색 -> contains() 메서드 사용
        String searchElem1 = "python";
        boolean contains1 = strList.contains(searchElem1);
        System.out.println(searchElem1 + " 포함 여부 : " + contains1);
        // String에서의 .contains() 메서드의 경우 "내부스트링데이터"에서 한 문자씩 다
        // 걸러서 확인이 가능하지만 List의 경우는 element의 full word를 기준으로 검색합니다.

        // 특정 element의 삭제 -> remove()
        String removeElem = "kotlin";
        boolean removed = strList.remove(removeElem);   // remove() retirn타입 : boolean
        // .pop();
        System.out.println(removeElem + "삭제 여부 : " + removed);
        System.out.println(strList);

        //마찬가지로 .remove() 역시 element 전체가 일치하는지 확인하고 나서 삭제하기 때문에
        // element의 일부 데이터만 가지고 전체 요소 삭제를 할 수 없습니다.

        String removeElem2 = "py";
        boolean removed2 = strList.remove(removeElem2);
        System.out.println(removed2 + " 삭제 여부 : " + removed2);
        System.out.println(strList);

        // List의 정렬 -> Collections.sort(strList)
        Collections.sort(strList);  // 배열과 동일하게 원본을 그대로 정렬합니다.
        System.out.println("정렬된 List " + strList); //정렬된 List

        //List 역순 정렬 -> Collections.reverseOrder()
        Collections.sort(strList, Collections.reverseOrder());
        System.out.println("역순 정렬 List " + strList);

        // list 의 특정 element 출력
        System.out.println(strList.get(0) + " 언어");

        for (int i = 0 ; i < strList.size() ; i++){
            System.out.println(strList.get(i));
        }


























}
    }