import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Создание переменных типов-оберток (wrapper classes) для примитивов
        Integer i1 = 10;  // Эквивалентно: Integer i1 = new Integer(10), создается объект типа Integer со значением 10
        Integer i2 = 10;  // Эквивалентно: Integer i2 = new Integer(10), создается еще один объект типа Integer со значением 10
        Double d = 5.3;   // Эквивалентно: Double d = new Double(5.3), создается объект типа Double со значением 5.3
        double q;         // Объявляется переменная примитивного типа double, но значение не присваивается

        // Автоматическая распаковка (auto-unboxing)
        int k = i1;  // Автоматическая распаковка объекта i1 в примитив int, эквивалентно i1.intValue()

        // Сложение двух объектов Integer с автоматической распаковкой и упаковкой
        i1 = i1 + i2;  // Операция распаковки (i1.intValue() + i2.intValue()) и затем упаковка результата обратно в объект Integer

        // Вызов метода для ввода списка целых чисел с клавиатуры
        List<Integer> ints = getIntsFromScanner();
        System.out.println(ints);  // Печать полученного списка на экран
    }

    // Метод для получения списка целых чисел от пользователя через сканнер
    public static List<Integer> getIntsFromScanner(){
        // Создаем сканнер для чтения данных с консоли
        Scanner scanner = new Scanner(System.in);

        // Создаем список для хранения целых чисел, введенных пользователем
        List<Integer> result = new ArrayList<>();

        // Бесконечный цикл для запроса чисел у пользователя
        while (true){
            // Печатаем приглашение для ввода целого числа
            System.out.println("Введите целое число или 0 для завершения");

            // Читаем число, введенное пользователем
            int number = scanner.nextInt();

            // Если введен 0, то возвращаем текущий список и завершаем цикл
            if (number == 0) {
                return result;
            }

            // Добавляем введенное число в список
            result.add(number);
        }
    }
}