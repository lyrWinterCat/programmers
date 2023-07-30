package makeList;

public class Node {
    private final String data;


    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    private Node nextNode;

    public Node getNextNode() {
        return nextNode;
    }
    public Node() {
        this.data = null;
        this.nextNode = null;
    }

    public Node(String data) {
        this.data = data;
        this.nextNode = null;
    }

//    public Node(String data, Node nextNode) {
//        this.data = data;
//        this.nextNode = nextNode;
//    }

    public String getData() {
        return this.data;
    }
}
