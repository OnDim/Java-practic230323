package lesson4.homework4;

import java.util.LinkedList;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
public class HW4Ex2 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            ll.add(getRandomNumber());
        }
        System.out.println(ll);

        for (int i = 0; i < 5; i++) {
            System.out.print(ll.getLast() + ", ");
            ll.removeLast();

        }
    }

    public static int getRandomNumber() { // генерирует случайное число
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }

}
