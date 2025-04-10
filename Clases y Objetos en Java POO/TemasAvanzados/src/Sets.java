import java.util.TreeSet;
import java.util.Set;
public class Sets {
    public static void main(String[] args) {
        Set<String> conjunto = new TreeSet<>();
        conjunto.add("Juan");
        conjunto.add("Juan");
        conjunto.add("Carlos");
        conjunto.add("Chavez");

        conjunto.forEach(System.out::println);
        conjunto.remove("Chavez");
        System.out.println("salto de linea");
        conjunto.forEach(System.out::println);

    }
}
