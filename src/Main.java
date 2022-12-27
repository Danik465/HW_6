import java.util.HashSet;
import java.util.Set;

public class Main {

    /**
     * 1. Доделать задачу про кота.
     * Переделать флажок true\false сытность на хранение количества текущей энергии в диапазоне от 1 до 10
     *
     * 2. Создать массив (int[]) из 1000 случайных элементов от 0 до 24.
     * Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных значений
     * в данном массиве и верните его в виде числа с плавающей запятой (double)
     * Для вычисления процента используйте формулу:
     * процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
     */
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 7, 7, 7, 7, 7, 7, 7,8};

        System.out.println(Unique(array));
        oopDemo();
    }

    public  static double Unique(int[] arr){
        int count = 0;
        Set<Integer> unique = new HashSet<>();
        for (int x : arr) {
            if(unique.add(x)){
                count++;
            }
        }
        return (double) count*100/ arr.length;

    }

    private static void oopDemo() {
        // Создать кота. При создании должны указать аппетит (и энергию).
        // По-умолчанию кот голодный.
        // Покормить его.
        // Проверить, сытый ли он.


        Plate plate = new Plate(250);

        Cat gav = new Cat("Gav", 230);

        Cat cat = new Cat("Cat", 109);
        Cat cat2 = new Cat("Cat", 100);
        gav.eat(plate);
        System.out.println("Сколько осталось еды в тарелке " +plate.getCurrentFood());
        System.out.println("Энергия кота: "+gav.getEnergy());
        cat.eat(plate);
        System.out.println("Сколько осталось еды в тарелке " +plate.getCurrentFood());
        System.out.println("Энергия кота: "+cat.getEnergy());
        cat2.eat(plate);
        System.out.println("Сколько осталось еды в тарелке " +plate.getCurrentFood());
        System.out.println("Энергия кота: "+cat2.getEnergy());



        System.out.println("===============================");




        // A != B hash(A) == hash(A)

        // if A == B => hash(A) == hash(B)
        // if hash(A) == hash(B) !=> A == B
        // if hash(A) != hash(B) => A != B

    }

}