package makeList;

//singlyLinkedList 에서 get Node , node를 접근할 수 없게 해야한다.
// getFirstData가 되어야 함!

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

    private Node getFirstNode() {
        return firstNode;
    }

    private void setFirstNode(Node firstNode) {
        this.firstNode = firstNode;
    }

    private void addSize() {
        this.size++;
    }
    private void minusSize(){ this.size--;}

    public String getFirstNodeData(){
        return getFirstNode().getData();
    }

    //viewAllNodes
    public void printAllNodesData(){
        Node node = getFirstNode();
        while(node.getNextNode()!=null){
            System.out.println(node.getData());
            node = node.getNextNode();
        }
        System.out.println(node.getData());
    }


    //getIndexNode
    public String getNodeData(int index) {
        if (index >= getSize()) {
            return null;
        } else if (index == 0) {
            return getFirstNode().getData();
        }
        Node targetNode = getFirstNode();
        while (index > 0) {
            targetNode = targetNode.getNextNode();
            index--;
        }
        return targetNode.getData();
    }

    //나중에 메서드로 빼주기
    public boolean add(String data){
        Node newNode = new Node(data);
        if(size==0){
            setFirstNode(newNode);
            addSize();
            return true;
        }

        Node preNode = getFirstNode();
        while(preNode.getNextNode()!=null){
            preNode = preNode.getNextNode();
        }
        preNode.setNextNode(newNode);
        addSize();
        return true;
    }

    public boolean insert(int index, String data) {
        // size ,index 검증
        if (!isPossibleInsert(getSize(), index)) {
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

    private boolean isPossibleInsert(int size, int index) {
        if (index < 0) {
            return false;
        }
        if (size == 0 && index != 0) {
            return false;
        }
        if (size == 0) {
            return true;
        }
        return index < size;
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

    public boolean delete(int index){

        if(!isPossibleDelete(getSize(), index)){
            return false;
        }

        if(index==0){
            return removeFirst();
        }

        Node preNode = findTargetPreNode(index);
        return deleteNode(preNode);
    }

    private boolean isPossibleDelete(int size, int index) {
        if(size == 0){
            return false;
        }
        if(index < 0) {
            return false;
        }

        return index < size;
    }
    private boolean removeFirst() {
        // size가 1이라면 >> firstNode밖에 없다면
        if(getSize() == 1){
            setFirstNode(null);
            minusSize();
            return true;
        }

        //size가 1이 아니라면 >> firstNode를 그 다음노드로 바꿔주기
        Node newFirstNode = getFirstNode().getNextNode();
        setFirstNode(newFirstNode);
        minusSize();
        return true;
    }

    private boolean deleteNode(Node preNode) {
        Node targetNode = preNode.getNextNode();
        preNode.setNextNode(targetNode.getNextNode());
        minusSize();
        return true;
    }







}
