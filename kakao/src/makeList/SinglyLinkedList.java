package makeList;

public class SinglyLinkedList {
    private Node firstNode;

    public SinglyLinkedList() {
        firstNode = null;
    }


    // 노드 추가 (마지막 노드에 추가)
    public void addNode(String data) {
        Node newNode = new Node(data);

        if (firstNode == null) {
            this.firstNode = newNode;
        } else {
            Node tempNode = firstNode; //마지막 노드를 찾기 위해 headNode를 참조함

            //node.link==null일때까지 while문을 돌기
            while (tempNode.nextNode != null) {
                tempNode = tempNode.nextNode;
            }

            //현재 tempNode는 마지막노드
            //마지막 노드에 newNode 넣어주기
            tempNode.nextNode = newNode;
        }
    }

    //중간 삽입 노드
    public void insertNode(Node preNode, String data) { // 추가 될 노드의 앞 노드
        Node newNode = new Node(data); //들어온 데이터로 새 노드 생성

        newNode.nextNode = preNode.nextNode; //새로 생성된 노드의 link (다음 노드값)은 preNode가 가지고 있던 link값
        preNode.nextNode = newNode; //기존 Node의 link는 이제 다음으로 들어올 newNode가 된다.
    }


    // 중간 노드 삭제
    public void deleteNode(String data) {
        Node preNode = null;
        Node targetNode = firstNode; // headNode 다음값을 할당

        while (targetNode.nextNode != null) {

            if (targetNode.getData().equals(data)) {

                if(preNode == null){
                    firstNode = targetNode.nextNode;
                    break;
                }
                preNode.nextNode = targetNode.nextNode;
                break;
            } else {
                preNode = targetNode;
                targetNode = targetNode.nextNode;
            }
        }

    }

    //마지막 노드 삭제
//    public void deleteLastNode() {
//        Node preNode;
//        Node targetNode;
//
//        if (firstNode == null) {
//            return;
//        }
//
//        if (firstNode.nextNode == null) {
//            firstNode = null;
//        } else {
//            preNode = firstNode;
//            targetNode = firstNode.nextNode;
//
//            while (targetNode.nextNode != null) {
//                preNode = targetNode;
//                targetNode = targetNode.nextNode;
//            }
//            preNode.nextNode = null;
//        }
//    }

    public void deleteLast(){
        Node preNode = null;
        Node targetNode = firstNode;

        if(targetNode == null){
            return;
        }

        while(targetNode.nextNode != null){
            preNode = targetNode;
            targetNode = targetNode.nextNode;
        }

        if(preNode == null){ //while문을 돌린 다음에도 preNode==null / targetNode.equals(firstNode)
            firstNode = null;
            return;
        }

        preNode.nextNode = null;
    }


}
