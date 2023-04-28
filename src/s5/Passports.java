package s5;

import java.util.HashMap;
import java.util.Map;

public class Passports {
    private Map<String, String> map = new HashMap<>();

    void add (String passportNum, String lastName){
        map.put(passportNum, lastName);
    }

    String get (String passportNum){
        return passportNum + ": " + map.get(passportNum);
    }

    String getAll() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> str : map.entrySet()) {
            stringBuilder.append(str.getKey());
            stringBuilder.append(": ");
            stringBuilder.append(str.getValue());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    String getByLastname(String lastName){
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> str : map.entrySet()) {
            if (str.getValue().equalsIgnoreCase(lastName)){
                stringBuilder.append(str.getKey());
                stringBuilder.append(": ");
                stringBuilder.append(str.getValue());
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }

    String print(){
        return map.toString();
    }
}
