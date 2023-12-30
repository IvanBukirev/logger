import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int elementCount, maxValue, filterValue;

        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");

        System.out.printf("Введите размер списка: ");
        elementCount = scanner.nextInt();

        System.out.printf("Введите верхнюю границу для значений: ");
        maxValue = scanner.nextInt();

        Filter filter = new Filter(elementCount, maxValue);

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.printf("Введите порог для фильтра: ");
        filterValue = scanner.nextInt();

        List<Integer> filteredList = filter.filterOut(filterValue);
        logger.log("Выводим результат на экран");
        Filter.messageWithList("Отфильтрованный список:", filteredList);

        logger.log("Завершаем программу");
    }
}