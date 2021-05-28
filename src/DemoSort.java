import java.util.List;

public class DemoSort implements SortStrategy {
    @Override
    public <T> void sort(List<T> items) {
        System.out.println("Demo");
    }
}
