package makeList;

public class Node {
    private String data;
    public Node nextNode;

    public Node(){
        this.data=null;
        this.nextNode = null;
    }

    public Node(String data){
        this.data = data;
        this.nextNode = null;
    }

    public Node(String data, Node nextNode){
        this.data = data;
        this.nextNode = nextNode;
    }

    public String getData() {
        return this.data;
    }
}
