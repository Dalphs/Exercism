import java.util.ArrayList;
import java.util.List;

public class Flattener {

    public Flattener() {
    }

    public List<Object> flatten(List<Object> list){
        List<Object> flattenedList = new ArrayList<>();

        for (Object o: list) {
            if(o != null){
                if(o instanceof List)
                    flattenedList.addAll(flatten((List<Object>)  o));
                else
                    flattenedList.add(o);
            }
        }
        return flattenedList;
    }
}
