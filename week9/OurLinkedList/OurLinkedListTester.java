package week9.OurLinkedList;


public class OurLinkedListTester {


    public static void main(String[] args) {


        // create and test a linked list
        OurLinkedList list = new OurLinkedList();
        System.out.println("list is " + list);
//
////        //list.insert(10,50);
////        //System.out.println(list);
        list.addNode(4);
        System.out.println("list is " + list); // 4
//        System.out.println("0th item: "+ list.getValue(0));
        list.addNode(2);
        System.out.println(list); // 4 2
        list.addNode(7);
        list.addNode(71);
        list.addNode(6);
        System.out.println("list should be 4 2 7 71 6: " +  list); // 4 2 7 71 6
        System.out.println("Size is " + list.size());
////
        list.insert(3, 10);
        System.out.println("list should be 4 2 7 10 71 6: " + list); // 4 2 7 10 71 6
        list.insert(1, 100);
        System.out.println("list should be 4 100 2 7 10 71 6: " + list); // 4 100 2 7 10 71 6
        list.insert(0, 5);
        System.out.println("list should be 5 4 100 2 7 10 71 6: " + list); // 5 4 100 2 7 10 71 6
        list.insert(-2, -2);
        System.out.println("list should be -2 5 4 100 2 7 10 71 6: " + list); // -2 5 4 100 2 7 10 71 6
//
        list.insert(500, -4);
        System.out.println("list should be -2 5 4 100 2 7 10 71 6 -4: " + list); // -2 5 4 100 2 7 10 71 6 -4
//
        list.addNode(1000);
        System.out.println("list should be -2 5 4 100 2 7 10 71 6 -4 1000: " + list); // -2 5 4 100 2 7 10 71 6 -4 1000
        System.out.println(list.getValue(11));

        list.remove(-3);
        System.out.println("list should be 5 4 100 2 7 10 71 6 -4 1000: " + list); // 5 4 100 2 7 10 71 6 -4 1000
////
        list.remove(3);
        System.out.println("list should be 5 4 100 7 10 71 6 -4 1000: " + list); // 5 4 100 7 10 71 6 -4 1000
        list.remove(800);
        System.out.println("list should be 5 4 100 7 10 71 6 -4: " + list); // 5 4 2 7 10 71 6 -4
        int deleteCount = list.size();  //Note this goes one beyond the end of the list
        //deleteCount = list.size();
        for (int count = 0; count < deleteCount; count++) {
            list.remove(0);
            System.out.println("List " + list);
        }

    }

}
