import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        ArrayList<String> list = new ArrayList<>();

        list.add("Marek");
        list.add("Fiut");
        list.add("Mrówka");
        list.add("Dupa");

        for (String l : list) {
            System.out.println(l);
        }
    }
}
