 public class NodeTester{ 
    public static void main(String []args){
        Node<Integer> a = new Node();
        Node<Integer> b = new Node(42);
        Node<Integer> c = new Node(12, 24, 36);

        a.setFront(22);
        b.setBack(100);
        c.setData(1000);

        a.getFront();
        a.getBack();
        b.getData();
        b.getBack();
        c.getFront();
        c.getData();
    }
    }