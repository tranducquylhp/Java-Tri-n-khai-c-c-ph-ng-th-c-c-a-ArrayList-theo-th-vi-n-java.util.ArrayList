public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<Integer>();

        myList.add(1,1);
        myList.add(1,2);
        myList.add(1,3);
        myList.add(1,4);

        myList.remove(2);

        for (int i=0; i<myList.size(); i++){
            System.out.println(myList.get(i));
        }

        boolean contains = myList.contains(5);
        System.out.println(contains);

        System.out.println(myList.indexOf(3));

        System.out.println(myList.add(2));
        for (int i=0; i<myList.size(); i++){
            System.out.println(myList.get(i));
        }

        MyList<Integer> myList1 = myList.clone();
        System.out.println("Danh sach myList1:");
        for (int i=0; i<myList1.size(); i++){
            System.out.println(myList1.get(i));
        }

        myList.clear();
    }
}
