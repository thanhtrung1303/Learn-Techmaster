public class MyLinkedListStack implements IStackAndQueue {
    
    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    Node topNode;
    MyLinkedListStack() {
        topNode = null;
     }

    @Override
    public boolean isEmpty() {
        return topNode == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int value = topNode.value;
        topNode = topNode.next;
        return 0;
    }

    @Override
    public boolean push(int value) {
        if (!isFull()) {
            Node newNode = new Node(value);
            newNode.next = topNode;
            topNode = newNode;
            return true;
        }
        return false;
    }

    @Override
    public void show() {
        Node temp = topNode;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
        
    }
    
}
