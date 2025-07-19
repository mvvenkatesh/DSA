public class DLL {

    private Node head;
    private Node tail;
    private int size;

    public int size(){
        return size;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        if(head!=null){
            head.previous = node;
        }
        head = node;
        size++;
    }
    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.println(temp.value);
            temp= temp.next;
        }
    }


    private class Node{
        private int value;
        private Node next;
        private Node previous;

        public Node(int value){
            this.value= value;
        }

        public Node(int value, Node next, Node previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }
}
