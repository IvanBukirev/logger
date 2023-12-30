import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Filter {

    public static final String SPACEBAR = " ";
    private List<Integer> integerList = new ArrayList<>();
    private Logger logger;
    private Random random = new Random();

    public Filter(int elementCount, int maxValue) {
        logger = Logger.getInstance();
        logger.log("Создаём и наполняем список");
        for (int i = 0; i < elementCount; i++) {
            this.integerList.add(random.nextInt(maxValue));
        }
        messageWithList("Вот случайный список:", integerList);
    }

    public static void messageWithList(String message, List<Integer> list) {
        StringBuilder log = new StringBuilder(message);
        for (Integer i : list) {
            log.append(SPACEBAR);
            log.append(i);
        }

        System.out.println(log.toString());
    }

    public List<Integer> filterOut(int filter) {
        List<Integer> list = new ArrayList<>();
        int count = 0;
        logger.log("Запускаем фильтрацию");

        for (Integer i : integerList) {
            if (i > filter) {
                list.add(i);
                count++;
                logger.log("Элемент " + i + " проходит");
            } else {
                logger.log("Элемент " + i + " не проходит");
            }
        }
        logger.log("Прошло фильтр " + count + " элемента из " + (integerList.size() - count));
        return list;
    }
}