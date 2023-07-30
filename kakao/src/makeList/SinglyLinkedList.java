package makeList;

import java.util.LinkedList;

public class SinglyLinkedList {
    private Node firstNode;
    private int size;

    public SinglyLinkedList() {
        this.firstNode = null;
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public Node getFirstNode() {
        return firstNode;
    }

    public void setFirstNode(Node firstNode) {
        this.firstNode = firstNode;
    }

    public void addSize() {
        this.size++;
    }

    //
    public boolean insert(int index, String data) {
        // size ,index 검증
        boolean validateInsert = checkInsert(getSize(), index);
        if (!validateInsert) {
            return false;
        }

        //어디에 들어갈지 찾는다
        if (index == 0) { //index ==0
            return addFirst(data);
        }

        // index!=0 >> 찾자 (targetNode, preNode) >> 넣어주지
        Node targetNode = new Node(data);
        Node preNode = findTargetPreNode(index);
        return insertNode(targetNode, preNode);
    }

    private boolean checkInsert(int size, int index) {
        if (index < 0) {
            return false;
        }
        if (size == 0 && index != 0) {
            return false;
        }
        if (size == 0 && index == 0) {
            return true;
        }
        if (index >= size) {
            return false;
        }
        return true;
    }

    private boolean addFirst(String data) {
        if (getSize() == 0) {
            setFirstNode(new Node(data));
            addSize();
            return true;
        }
        Node newFirstNode = new Node(data);
        newFirstNode.setNextNode(getFirstNode());
        setFirstNode(newFirstNode);
        addSize();
        return true;
    }


    private Node findTargetPreNode(int index) {
        Node targetPreNode = getFirstNode();
        while (index - 1 > 0) {
            targetPreNode = targetPreNode.getNextNode();
            index--;
        }
        return targetPreNode;
    }
    private boolean insertNode(Node targetNode, Node preNode) {
        Node nextNode = preNode.getNextNode();
        targetNode.setNextNode(nextNode);
        preNode.setNextNode(targetNode);
        addSize();
        return true;
    }






}
