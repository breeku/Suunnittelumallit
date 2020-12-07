import java.util.ArrayList;
import java.util.Iterator;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");
        list.add("H");
        list.add("J");
        list.add("I");

        Iterator iterator = list.iterator();

        // a)
        MyThread threadOne = new MyThread(iterator, "first thread");
        MyThread threadTwo = new MyThread(iterator, "second thread");

        // threadOne.start();
        // threadTwo.start();

        // threadOne.join();
        // threadTwo.join();
        //

        // b)

        //

        // c)
        // threadOne.start();
        try {
            // list.add("H");
        } catch (Exception e) {
            System.out.println(e);
        }
        // threadOne.join();
        //

        // d)
        threadOne.start();
        list.remove(3);
        threadOne.join();
        //
    }
}
