import java.util.List;
import java.util.stream.Collectors;

public class FirstStrategy implements ListConverter {

    @Override
    public String listToString(List<String> list) {
        return list.stream().map(n -> n + "\n").collect(Collectors.joining(""));
    }

}
