public class OddIndices {

    public int[] oddIndices(int[] arrays) {
        if (arrays.length > 0) {
            int[] arr = new int[arrays.length / 2];
            for (int i = 0, j = 1; i < arr.length; i++, j+=2) {
                arr[i] = arrays[j];
            }
            return arr;
//        } else if (arrays.length > 0 && arrays.length % 2 != 0) {
//            int[] arr = new int[arrays.length / 2];
//            for (int i = 0, j = 1; i < arr.length; i++, j++) {
//                arr[i] = arrays[j];
//            }
//            return arr;
//        }
        } else {
            return new int[0];
        }

    }
}
