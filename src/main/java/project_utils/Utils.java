package project_utils;

public class Utils {
//    public int[] getArrayPosi
//    int numberEven = getNumberOfEvenNumbersInTheArray(arrayRandomOfPositiveInt);
//    int[] arrEvenNumber = new int[numberEven];
//    int[] arrOddNumber = new int[arrayRandomOfPositiveInt.length - numberEven];
//    int num = 0;
//        for(
//    int i = 0;
//    i<arrayRandomOfPositiveInt.length;i++)
//
//    {
//        if (arrayRandomOfPositiveInt[i] % 2 == 0) {
//            arrEvenNumber[num] = arrayRandomOfPositiveInt[i];
//            num++;
//        }
//    }

    public int getNumberOfEvenNumbersInTheArray(int[] array) {
        int count = 0;
        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    count++;
                } else {
                    continue;
                }
            }
            return count;
        }
        return 0;
    }

//    public int getNumberOfEvenNumbersInTheArray(int[] array) {
//        int count = 0;
//        if (array.length > 0) {
//            for (int i = 0; i < array.length; i++) {
//                if (array[i] % 2 == 0) {
//                    count++;
//                } else {
//                    continue;
//                }
//            }
//            return count;
//        }
//        return 0;
//    }

}
