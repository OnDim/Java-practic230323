package lesson1.homework;
//  Задать одномерный массив и найти в нем минимальный и максимальный элементы.
public class HWEx1 {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 1, 2, 9, 6, 8};
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            else if (arr[i] < min) min = arr[i];
        }

        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
    }
}
