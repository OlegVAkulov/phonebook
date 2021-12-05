import java.util.HashMap;
import java.util.Map;

public class MainApp {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivanov", "111111");
        phoneBook.add("Ivanov", "222222");
        phoneBook.add("Ivanov", "333333");
        phoneBook.add("Sidorov", "444444");
        phoneBook.add("Petrov", "555555");
        phoneBook.add("Petrov", "666666");
        phoneBook.add("Sidorov", "777777");
        phoneBook.add("Uchaev", "888888");
        phoneBook.get("Uchaex");


        String[] array = {"AAA", "sss", "AAA", "sss", "AAA", "DDD", "ttt", "ttt", "FFF", "PPP"};
        Map<String, Integer> map = new HashMap<>();
        for (String string : array) {
            map.put(string, map.getOrDefault(string, 0) + 1);
//            if (!map.containsKey(string)) {
//                map.put(string, 1);
//            } else {
//                map.put(string, map.get(string) + 1);
//            }
        }
        System.out.println(map);
        System.out.println(map.keySet());

    }
}
