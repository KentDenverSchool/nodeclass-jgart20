/* Name: Jeremy Gart
 * Date: September 15th, 2019
 * Purpose of Code: To create a class Node that holds a Type T and 
 * contains a reference to the node in front of and behind itself
*/
public class Node(){
    // Constructor with 3 manual inputs
    public Node(T inputData, T front, T back){
        T data = inputData;
        Node frontData = front;
        Node backData = back;
}
    //Constructor with 1 manual input and 2 default inputs
    public Node(T inputData){
        T data = inputData;
        Node frontData = null;
        Node backData = null;
}
    //Constructor with all default inputs
    public Node(){
        T data = null;
        Node frontData = null;
        Node backData = null;
}
    //Accessor that returns the value of the Node in front of a given Node
    public T getFront(){
        return frontData;
    }
    //Accessor that returns the value of the Node behind a given Node
    public T getBack(){
        return backData;
    }
    //Accessor that returns the value of a given Node
    public T getData(){
        return data;
    }
    //Mutator that sets the value of the Node's Front pointer to a Type T
    public void setFront(T newFront){
        frontData = newFront;
    }
    //Mutator that sets the value of the Node's Back pointer to a Type T
    public void setBack(T newBack){
        backData = newBack;
    }
    //Mutator that sets the value of the Node to a Type T
    public void setData(T newData){
        data = newData;
    }
    //Returns a String version of the Type T stored in Node
    public String toString(){
        return ("Node: " + data);
    }
    //Compares two Nodes with each other. Returns true if Nodes are equal, false otherwise
    public boolean equals(Node n){
        return data.equals(n.getData());
    }

}
