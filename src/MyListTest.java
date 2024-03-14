public class MyListTest {
    public static void main(String[] args) throws Exception {
        // Test w/ Integer
        MyList<Integer> intList = new MyList<>();
        intList.add(1);
        intList.add(5);
        intList.add(6);

        System.out.println("Largest Integer: " + intList.largest());
        System.out.println("Smallest Integer: " + intList.smallest());

        // Test w/ double
        MyList<Double> doubleList = new MyList<>();
        doubleList.add(1.1);
        doubleList.add(5.2);
        doubleList.add(3.2);


        System.out.println("Largest Double: " + doubleList.largest());
        System.out.println("Smallest Double: " + doubleList.smallest());

    }
}
