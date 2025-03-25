package ch12_arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //배열 선언 및 초기화
//        int[] arr1 = { 1, 2, 3, 4, 5};
//
//        System.out.println(arr1);
//
//        //배열의 element 출력 방법
//        int[] arr2 = {9,8,7,6,5};
//        System.out.println(arr2[0]);
//        System.out.println(arr2[1]);
//        System.out.println(arr2[2]);
//        System.out.println(arr2[3]);
//        System.out.println(arr2[4]);
//        System.out.println();
        //어 근데 위에있는거 보니까 반복되네 반복문 쓸 수 있겠네

//
//        for (int i = 0 ; i < 5 ; i++) {
//            System.out.println(arr2[i]);
//        }


//        for (int i = 0 ; i < 5 ; i++) {
//            System.out.print(arr2[i] + " ");
//        }
//        System.out.println();

        // 예를 들어 ages 라는 배열을 선언했다고 가정했을 때, 다음 해가 되면 +1씩 시켜줘야되는데.
        // 원래는 하나하나 재대입 해가지고 집어넣어야 되겠지만
        // 배열에 저장해뒀다면 element들만 반복문으로 뽑아낸 뒤에 더해질 수 있습니다.

       // arr2 = {9, 8, 7, 6, 5}
       // arr2 = {18, 16, 14, 12, 10}

//        for (int i = 0 ; i < 5 ; i++) {
//            arr2[i] = arr2[i] * 2;
//            arr2[i] *= 2;
//            System.out.print(arr2[i] + " ");
//        }

        // 배열의 방의 개수를 정확하게 모를때 쓸 수 있는 방법
//        for (int i = 0 ; i < arr2.length ; i++) {
//            arr2[i] *= 2;
//            System.out.print(arr2[i] + " ");
//        }

        //String 배열 선언 및 초기화
//        String[] strArr1 = {"안","녕","하","세","요"};
//        System.out.print(strArr1[0]);
//        System.out.print(strArr1[1]);
//        System.out.print(strArr1[2]);
//        System.out.print(strArr1[3]);
//        System.out.print(strArr1[4]);
//        System.out.println();
//
//        for (int i = 0 ; i < strArr1.length ; i++) {
//            System.out.print(strArr1[i]);
//        }
//
//        System.out.println();
//
//        for (int i = 0 ; i < strArr1.length ; i++) {
//           System.out.print(strArr1[i] + "/");
//        }


        int [] arr3 = new int[10];
        arr3[0] = 0;
        arr3[1] = 0;
        arr3[2] = 0;
        arr3[3] = 0;
        arr3[4] = 0;

        System.out.println(arr3[0]);
        System.out.println(arr3[1]);
        System.out.println(arr3[2]);
        System.out.println(arr3[3]);




    }
}
