package makeList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        SinglyLinkedList insertTestList = new SinglyLinkedList();
        System.out.println("태초의 리스트"+insertTestList.getSize());

        boolean test1 = insertTestList.insert(1,"test1");
        System.out.println("잘못된 insert : "+insertTestList.getSize());
        System.out.println(test1);

        boolean test2 = insertTestList.insert(0,"test2");
        System.out.println("firstNode에 값넣기: "+insertTestList.getSize());
        System.out.println(insertTestList.getFirstNodeData());
        System.out.println(test2);

        boolean test3 = insertTestList.insert(1,"test3");
        System.out.println("잘못된 insert : "+insertTestList.getSize());
        System.out.println(test3);

        boolean test4 = insertTestList.insert(0,"test4");
        System.out.println("firstNode에 값넣기: "+insertTestList.getSize());
        System.out.println(insertTestList.getNodeData(0));
        System.out.println(insertTestList.getNodeData(1));
        System.out.println(test4);
//
//        boolean test3 = insertTestList.insert(0,"test3");
//        System.out.println("firstNode에 값 바꾸기 : "+insertTestList.getSize());
//        System.out.println(insertTestList.getFirstNodeData());
//        System.out.println(test3);
//
//        boolean test4 = insertTestList.insert(5, "test4");
//        System.out.println("잘못된 index에 insert: "+insertTestList.getSize());
//        System.out.println(test4);
//
//        boolean test5 = insertTestList.insert(1, "test5");
//        boolean test6 = insertTestList.insert(2, "test6");
//        boolean test7 = insertTestList.insert(3, "test7");
//        System.out.println("올바른 index에 insert: "+insertTestList.getSize());
//
//        insertTestList.printAllNodesData();
//
//        String testNodeData = insertTestList.getNodeData(2);
//        System.out.println("index 2 : "+testNodeData);

        //delete Test

//        SinglyLinkedList deleteTestList = new SinglyLinkedList();
//        deleteTestList.insert(0,"test0");
//        deleteTestList.insert(1,"test1");
//        deleteTestList.insert(2,"test2");
//        deleteTestList.insert(3,"test3");
//        deleteTestList.insert(4,"test4");
//
//        deleteTestList.printAllNodesData();
//        System.out.println(deleteTestList.getSize());
//
//        boolean delete1 = deleteTestList.delete(-1);
//        System.out.println("delete1 = " + delete1);
//        System.out.println("잘못된 삭제1 : "+ deleteTestList.getSize());
//        boolean delete2 = deleteTestList.delete(5);
//        System.out.println("delete2 = " + delete2);
//        System.out.println("잘못된 삭제2 : "+ deleteTestList.getSize());
//
//        System.out.println("----------------------");
//        boolean delete3 = deleteTestList.delete(2);
//        deleteTestList.printAllNodesData();
//        System.out.println("제대로 된 삭제 사이즈: "+deleteTestList.getSize());
//        System.out.println("----------------------");
//
//        boolean delete4 = deleteTestList.delete(0);
//        deleteTestList.printAllNodesData();
//        System.out.println("firstNode 삭제 사이즈: "+deleteTestList.getSize());
//
//        System.out.println("----------------------");
//        boolean delete5 = deleteTestList.delete(2);
//        deleteTestList.printAllNodesData();
//        System.out.println("마지막Node 삭제 사이즈: "+deleteTestList.getSize());

    }
}
