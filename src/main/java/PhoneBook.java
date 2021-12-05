import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class PhoneBook {
    private HashMap<String, HashSet<String>> mapOfBook;

    public PhoneBook() {
        mapOfBook = new HashMap<>();
    }

        public void add (String name, String phone){
            if (!mapOfBook.containsKey(name)) {
                mapOfBook.put(name, new HashSet<>());
            }
            mapOfBook.get(name).add(phone);
        }
        public void get (String family){
            if (!mapOfBook.containsKey(family)){
                System.out.println("Family not found!");
            }else{

            System.out.println(family + " number " + mapOfBook.get(family));}
        }


    }


