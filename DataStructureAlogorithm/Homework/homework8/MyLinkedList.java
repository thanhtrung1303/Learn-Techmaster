package homework8;

public class MyLinkedList {
    static class MyNode {
        public int value;
        public MyNode next;

        public MyNode(int value) {
            this.value = value;
        }
    }

    public static void printLinkedList(MyNode head) {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            while (head != null) {
                System.out.print(head.value);
                head = head.next;
                if (head != null) {
                    System.out.print("->");
                } else {
                    System.out.println();
                }
            }
        }
    }

    public static MyNode addToHead(MyNode headNode, int value) {
        MyNode newNode = new MyNode(value);
        if (headNode != null) {
            newNode.next = headNode;
        }
        return newNode;
    }

    public static MyNode addToTail(MyNode headNode, int value) {
        MyNode newNode = new MyNode(value);

        if (headNode == null) {
            return newNode;
        } else {
            MyNode lastNode = headNode;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
        return headNode;
    }

    public static MyNode addToIndex(MyNode headNode, int value, int index) {
        if (index == 0) {
            return addToHead(headNode, value);
        } else {
            MyNode newNode = new MyNode(value);
            MyNode curNode = headNode;
            int count = 0;
            while (curNode != null) {
                count++;
                if (count == index) {
                    newNode.next = curNode.next;
                    curNode.next = newNode;
                    break;
                }
                curNode = curNode.next;
            }
        }
        return headNode;
    }

    public static MyNode removeAtHead(MyNode headNode) {
        if (headNode != null) {
            return headNode.next;
        }
        return headNode;
    }
    
    public static MyNode removeAtTail(MyNode headNode) {
        if (headNode == null) {
            return null;
        }
        MyNode lastNode = headNode;
        MyNode previousNode = null;
        while (lastNode.next != null) {
            previousNode = lastNode;
            lastNode = lastNode.next;
        }

        if (previousNode == null) {
            return null;
        } else {
            previousNode.next = lastNode.next;
        }
        return headNode;
    }

    public static MyNode removeAtIndex(MyNode headNode, int index) {
        if (headNode == null || index < 0) {
            return null;
        }
        if (index == 0) {
            return removeAtHead(headNode);
        }

        MyNode previousNode = null;
        MyNode currentNode = headNode;
        int count = 0;

        while (currentNode.next != null) {
            
            if (count == index) {
                
                break;
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
            count++;

        }

        return headNode;
    }

    public static void main(String[] args) {
        MyNode n1 = new MyNode(1);
        MyNode n2 = new MyNode(2);
        MyNode n3 = new MyNode(3);

        n1.next = n2;
        n2.next = n3;

        printLinkedList(n1);
        n1 = addToHead(n1, 0);
        n1 = addToTail(n1, 4);
        n1 = addToIndex(n1, 3, 3);
        n1 = removeAtHead(n1);
        n1 = removeAtTail(n1);
        printLinkedList(n1);
    }

}
