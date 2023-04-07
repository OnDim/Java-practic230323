package lesson3.homework;

import java.util.*;

//Доделать начатое на семинаре. Пройтись по списку из задания 2 и удалить повторяющиеся элементы.
public class HW3Ex3 {

    public static void main(String[] args) {
    //Создаем список планет Солнечной системы в произвольном порядке с повторениями
        List<String> planetsNames = List.of("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptun", "Pluto");
        Random random = new Random();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            list.add(planetsNames.get(random.nextInt(9)));
        }

        System.out.println("Список планет с повторениями: " + list);
    // Сортируем созданный список
        list.sort(Comparator.naturalOrder());
        System.out.println("Список планет отсортирован по названию: " + list);

    // Выводим название каждой планеты + количество повторений
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i).equals(list.get(i+1))) {
                count++;
            }else{
                sb.append(list.get(i))
                        .append("=")
                        .append(count)
                        .append("; ");
                count = 1;
            }
        }
        sb.append(list.get(list.size() - 1)).append("=").append(count).append(".");

        System.out.println("Количество повторений в списке: " + sb);

        // Убираем дубликаты
        List<String> listWithDuplicates = list;
        Set<String> set = new LinkedHashSet<>(listWithDuplicates);
        List<String> listWithoutDuplicates = new ArrayList<>(set);

        System.out.println("Дубликаты из списка удалены: " + listWithoutDuplicates);
    }
}

