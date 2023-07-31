package makeList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

    @Test
    public void addTest1() throws Exception{
        //given
        SinglyLinkedList test = new SinglyLinkedList();

        //when
        test.add("0");

        //then
        Assertions.assertEquals("0",test.getFirstNodeData());
        Assertions.assertEquals(1,test.getSize());

    }

    @Test
    public void addTest2() throws Exception{
        //given
        SinglyLinkedList test = new SinglyLinkedList();

        //when
        test.add("0");
        test.add("1");

        //then
        Assertions.assertEquals(2,test.getSize());
        Assertions.assertEquals("0",test.getFirstNodeData());
        Assertions.assertEquals("1",test.getNodeData(1));

    }



    @org.junit.jupiter.api.Test
    void getSize() {

        //given
        SinglyLinkedList list = new SinglyLinkedList();

        //when



        //then


    }

    @org.junit.jupiter.api.Test
    void getFirstNodeData() {
    }

    @org.junit.jupiter.api.Test
    void printAllNodesData() {
    }

    @org.junit.jupiter.api.Test
    void getNodeData() {
    }

    @org.junit.jupiter.api.Test
    void insert() {
    }

    @org.junit.jupiter.api.Test
    void delete() {
    }
}