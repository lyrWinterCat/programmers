package makeList;

public class SinglyLinkedList {
    private Node headNode;

    public SinglyLinkedList() {
        headNode = null;
    }

    //중간 삽입 노드
    public void insertNode(Node preNode, String data) {
        Node newNode = new Node(data);

        newNode.link = preNode.link;
        preNode.link = newNode;
    }

    // 노드 추가 (마지막 노드에 추가)
    public void addNode(String data) {
        Node newNode = new Node(data);

        if (headNode == null) {
            this.headNode = newNode;
        } else {
            Node tempNode = headNode;

            while (tempNode.link != null) {
                tempNode = tempNode.link;
            }
            tempNode.link = newNode;
        }
    }

    // 중간 노드 삭제
    public void deleteNode(String data) {
        Node preNode = headNode;
        Node tempNode = headNode.link;

        if (data.equals(preNode.getData())) {
            headNode = preNode.link;
            preNode.link = null;
        } else {
            while (tempNode != null) {
                if (data.equals(tempNode.getData())) {
                    if (tempNode.link == null) {
                        preNode.link = null;
                    } else {
                        preNode.link = tempNode.link;
                        tempNode.link = null;
                    }
                    break;
                } else {
                    preNode = tempNode;
                    tempNode = tempNode.link;
                }
            }
        }
    }

    public void deleteLastNode(){
        Node preNode;
        Node tempNode;

        if(headNode.link==null){
            return;
        }

        if(headNode.link==null){
            headNode=null;
        }else{
            preNode = headNode;
            tempNode = headNode.link;

            while(tempNode.link != null){
                preNode = tempNode;
                tempNode = tempNode.link;
            }
            preNode.link=null;
        }
    }


}
