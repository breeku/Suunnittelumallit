import java.util.Iterator;
import java.util.List;

public class ThirdStrategy implements ListConverter {

    @Override
    public String listToString(List<String> list) {
        String result = "";
        Iterator<String> iterator = list.iterator();
        Integer i = 1;
        while (iterator.hasNext()) {
            result += iterator.next();
            if (i % 3 == 0)
                result += "\n";
            i++;
        }
        return result;
    }

}