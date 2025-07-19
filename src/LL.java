public class LL {

    private Node head;
    private Node tail;
    private int size;
    public int getSize(){
        return size;
    }

    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next=head;
        head=node;
        if(tail==null){
            tail=node;
        }
        size += 1;
    }

    public void insertEnd(int value){
        if(tail==null){
            insertFirst(value);
        }
        else{
            Node node = new Node(value);
            tail.next = node;
            tail=node;
            size++;
        }
    }
    public void insert(int value,int index){
        if(head==null){
            insertFirst(value);
            return;
        }
        if(index==size){
            insertEnd(value);
            return;
        }
        Node temp = head;
        for(int i=1;i<index;i++){
            temp = temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next=node;
        size++;
    }

    public int deleteFirst(){
        int value = head.value;
        head=head.next;
        if (head==null){
            tail=null;
        }
        size--;
        return value;
    }

    public int deleteLast(){
        Node temp = head;
        if(temp == tail){
            deleteFirst();
        }
        while (temp!= null){
            if(temp.next==tail){
                break;
            }
            temp = temp.next;
        }
        tail = temp;
        int value = temp.next.value;
        tail.next=null;
        return value;
    }

    public int delete(int index){
        Node temp =head;
        for (int i=0;i<index-1;i++){
            temp = temp.next;
        }
        int val = temp.next.value;
        Node n = temp.next.next;
        temp.next = n;
        return val;
    }
    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }

    public void insRec(int value,int index){
        Node temp = head;
        insertRec(temp,value,index);
    }
    public void insertRec(Node head,int value,int index){
        if(index==1){
            Node node = new Node(value);
            Node temp = head.next;
            node.next = temp;
            head.next=node;
            return;
        }
        if(head!=null){
            head = head.next;
        }

        index--;
        insertRec(head,value,index);
    }

    public void sort(){

        for(int i=0 ;i<size;i++){
            Node h = head;
            for(int j=0;j<size-i;j++){
                if(h.value > h.next.value){
                    int temp = h.value;
                    h.value = h.next.value;
                    h.next.value = temp;
                }
                h=h.next;
            }
        }
    }

}
