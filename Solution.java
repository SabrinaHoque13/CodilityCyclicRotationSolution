package Documents.java.practiseWork;

public class Solution {
    public static int[] solution() {
        int[] Arr = {3, 8, 9, 7, 6};
        int k = 3;
        int[] MovedArray = new int[Arr.length];
        try {
            int position = -1;
            if (Arr.length == 1) {
                return Arr;
            }
            if (k > Arr.length) {
                k = k % Arr.length;
            }
            for (int i = 0; i < Arr.length; i++) {
                if ((i + k) > Arr.length - 1) {
                    position = Math.abs(Arr.length - i - k);
                } else {
                    position = i + k;
                }
                MovedArray[position] = Arr[i];
            }
            return MovedArray;
        } catch (Exception e) {
            return MovedArray;
        }
    }
}
//        int l = Arr.length;
//        int[] MovedArray;
//        for (int i = 0; i < k; i++) {
//            MovedArray = new int[l];
//            for (int j = 0; j < 1; j++) {
//                if (j == 0) {
//                    MovedArray[0] = Arr[l - 1];
//                } else {
//                    MovedArray[j] = Arr[j - 1];
//                }
//            }
//            Arr=MovedArray;
//        }
//        return Arr;
//    }
