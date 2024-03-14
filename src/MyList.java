import java.util.ArrayList;
import java.util.Collections; 

public class MyList<T extends Number> {
  private ArrayList<T> list = new ArrayList<>();

  public void add(T item) {
    list.add(item);
  }

  public T largest() {
    return Collections.max(list, null);
  }

  public T smallest() { 
    return Collections.min(list, null);
  }

}
