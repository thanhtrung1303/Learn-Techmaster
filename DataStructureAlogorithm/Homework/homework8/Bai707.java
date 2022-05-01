package homework8;

public class Bai707 {
    public static class MyNode {
        public int data;
        public MyNode next;

        public MyNode(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return this.data + "";
        }
    }

        public static MyNode head;

        public static int get(int index) {
            MyNode temp = head;
            int count = 0;
            while (temp != null) {
                if (count == index) {
                    return temp.data;
                }
                temp = temp.next;
                count++;
            }
            return -1;
        }

        public static void addAtHead(int val) {
            MyNode newNode = new MyNode(val);
            if (head != null) {
                newNode.next = head;
            }
            return;
        }

        public static void addAtTail(int val) {
            MyNode newNode = new MyNode(val);
            MyNode lastNode = head;

            if (head == null) {
                head = newNode;
                return;
            }
            while (lastNode != null) {
                if (lastNode.next == null) {
                    lastNode.next = newNode;
                    return;
                }
                lastNode = lastNode.next;
            }
            return;
        }

        public void addAtIndex(int index, int val) {
            if (index == 0) {
                addAtHead(val);
                return;
            }
            MyNode newNode = new MyNode(val);
            MyNode tmp = head;
            int count = 0;
            while (tmp != null) {
                count++;
                if (count == index) {
                    newNode.next = tmp.next;
                    tmp.next = newNode;
                    break;
                }
                tmp = tmp.next;
            }
        }

        public void deleteAtIndex(int index) {
        }

        public static void printLinkedList(MyNode head) {
            if (head == null) {
                System.out.println("List is empty");
            } else {
                while (head != null) {
                    System.out.print(head.data);
                    head = head.next;
                    if (head != null) {
                        System.out.print("->");
                    } else {
                        System.out.println();
                    }
                }
            }
        
    }

    public static void main(String[] args) {
        MyNode n1 = new MyNode(1);
        MyNode n2 = new MyNode(2);
        MyNode n3 = new MyNode(3);

        n1.next = n2;
        n2.next = n3;

        
    }
}
