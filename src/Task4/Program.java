package Task4;

/*
ДОМАШНЕЕ ЗАДАНИЕ
Создайте класс Телевизор. Он должен хранить информацию о названии модели, год выпуска, цена, диагональ, производитель. Нужно создать набор телевизоров
и выполнить следующие задачи:
■ Показать все телевизоры;
■ Показать телевизоры с заданной диагональю;
■ Показать все телевизоры одного производителя;
■ Показать все телевизоры текущего года;
■ Показать все телевизоры дороже заданной цены;
■ Показать все телевизоры, отсортированные по цене
по возрастанию;
■ Показать все телевизоры, отсортированные по цене
по убыванию.
Практические задания
2
■ Показать все телевизоры, отсортированные по диагонали по возрастанию;
■ Показать все телевизоры, отсортированные по диагонали по убыванию.
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        List <TV> tvs = new ArrayList<>(List.of(
                new TV("The One 58", 2020, 63000, 146, "Philips"),
                new TV("The Two 62", 2021, 71000, 157, "Philips"),
                new TV("32 RMT101", 2019, 54000, 98, "Realme"),
                new TV("32A4BG", 2019, 55000, 146, "Hisense"),
                new TV("TlV-120vd-p", 2013, 20000, 50, "Asus"),
                new TV("T54-sm", 2022, 112000, 254, "Samsung"),
                new TV("T58-sm+", 2023, 132000, 274, "Samsung")
        ));

        System.out.println("Все телевизоры");
        tvs.forEach(System.out::println);

        System.out.print("\nВведите требуемую диагональ: ");
        int diagonal = scanner.nextInt();
        System.out.printf("Телевизоры с диагональю %d:\n", diagonal);
        tvs.stream()
                .filter(tv -> tv.getDiagonal() == diagonal)
                .forEach(System.out::println);

        System.out.print("\nВведите необходимого производителя: ");
        String manufacturer = scanner2.nextLine();
        System.out.printf("Телевизоры от %s:\n", manufacturer);
        tvs.stream()
                .filter(tv -> tv.getManufacturer().equals(manufacturer))
                .forEach(System.out::println);

        System.out.print("\nВведите необходимый год выпуска: ");
        int year = scanner.nextInt();
        System.out.printf("Телевизоры %d года выпуска:\n", year);
        tvs.stream()
                .filter(tv -> tv.getYear() == year)
                .forEach(System.out::println);

        System.out.print("\nВведите минимальную цену: ");
        int price = scanner.nextInt();
        System.out.printf("Телевизоры дороже %d руб.:\n", price);
        tvs.stream()
                .filter(tv -> tv.getPrice() > price)
                .forEach(System.out::println);

        System.out.println("\nТелевизоры, отсортированные по возрастанию цены:");
        List sortedList = tvs.stream()
                .sorted(Comparator.comparingInt(TV::getPrice))
                .collect(Collectors.toList());
        sortedList.forEach(System.out::println);

        System.out.println("\nТелевизоры, отсортированные по убыванию цены:");
        List sortedList2 = tvs.stream()
                .sorted(Comparator.comparingInt(TV::getPrice).reversed())
                .collect(Collectors.toList());
        sortedList2.forEach(System.out::println);


        System.out.println("\nТелевизоры, отсортированные по возрастанию диагонали:");
        List sortedList4 = tvs.stream()
                .sorted(Comparator.comparingInt(TV::getDiagonal))
                .collect(Collectors.toList());
        sortedList4.forEach(System.out::println);

        System.out.println("\nТелевизоры, отсортированные по убыванию диагонали:");
        List sortedList3 = tvs.stream()
                .sorted(Comparator.comparingInt(TV::getDiagonal).reversed())
                .collect(Collectors.toList());
        sortedList3.forEach(System.out::println);


    }
}
