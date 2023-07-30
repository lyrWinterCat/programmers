package makeList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList testList = new SinglyLinkedList();
        System.out.println("태초의 리스트"+testList.getSize());

        boolean test1 = testList.insert(1,"test1");
        System.out.println("잘못된 insert : "+testList.getSize());
        System.out.println(test1);

        boolean test2 = testList.insert(0,"test2");
        System.out.println("firstNode에 값넣기: "+testList.getSize());
        System.out.println(testList.getFirstNode().getData());
        System.out.println(test2);

        boolean test3 = testList.insert(0,"test3");
        System.out.println("firstNode에 값 바꾸기 : "+testList.getSize());
        System.out.println(testList.getFirstNode().getData());
        System.out.println(test3);

        boolean test4 = testList.insert(5, "test4");
        System.out.println("잘못된 index에 insert: "+testList.getSize());
        System.out.println(test4);

        boolean test5 = testList.insert(1, "test5");
        boolean test6 = testList.insert(2, "test6");
        boolean test7 = testList.insert(3, "test7");
        System.out.println("올바른 index에 insert: "+testList.getSize());

        testList.printAllNodesData();

        Node node = testList.getNode(2);
        System.out.println("index 2 : "+node.getData());



    }
}
