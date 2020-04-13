package iba_lesson.lesson2.task;

import java.util.Arrays;

public class ArraySortApp_v1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 200) - 100;
        }
        arraySort(array);
    }

    private static void arraySort(int[] array) {
//        {2,-5,3,-7,5,-4,-8,6}  {2,6},{3,5},{-5,-7},{-4,-8}
        int count_po = 0;
        int count_pe = 0;
        int count_no = 0;
        int count_ne = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                if (array[i] % 2 == 0) count_pe++;
                else count_po++;
            } else {
                if (array[i] % 2 == 0) count_ne++;
                else count_no++;
            }
        }
        int[] PO = new int[count_po];
        int[] NO = new int[count_no];
        int[] PE = new int[count_pe];
        int[] NE = new int[count_ne];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                if (array[i] % 2 == 0) PE[PE.length-count_pe--] = array[i];
                else PO[PO.length-count_po--] = array[i];
            } else {
                if (array[i] % 2 == 0) NE[NE.length-count_ne--] = array[i];
                else NO[NO.length-count_no--] = array[i];
            }
        }

        System.out.printf("array %s,\npo %s,\npe %s,\nno %s,\nne %s",
                Arrays.toString(array),
                Arrays.toString(PO),
                Arrays.toString(PE),
                Arrays.toString(NO),
                Arrays.toString(NE));

    }
}
