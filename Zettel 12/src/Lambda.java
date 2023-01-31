import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Predicate;

public class Lambda {

    public static <T> void removeIf(ArrayList<T> list, Predicate<T> filter){
        Iterator iter = list.iterator();

        while (iter.hasNext()){
            list.removeIf(filter);
        }
    }

    public static <T> void sortBy(ArrayList<T> list, Comparator<T> comparator){
        list.sort(comparator);
    }

    public static <T> String listToString(ArrayList<T> list){
        list.forEach(listelement -> );
        return null;
    }
}

