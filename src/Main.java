import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        //ArrayList with no size defined

        ArrayList<Integer> list = new ArrayList<>();

        //Adding elements to ArrayList

        list.add(10);

        list.add(20);

        list.add(30);

        list.add(40);

        System.out.println("Initial");
        System.out.println(list.size());     //Output : 4

        //Removing an element at index 0

        list.remove(0);

        System.out.println("Later");
        System.out.println(list.size());    //Output : 3

    }
}