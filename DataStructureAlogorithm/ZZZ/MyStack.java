public class MyStack implements IStackAndQueue {
    private int[] array;
    private int SIZE;
    private int topIndex;

    MyStack(int size) {
        SIZE = size;
        array = new int[SIZE];
        topIndex = -1;
    }

    @Override
    public boolean isEmpty() {
        return topIndex < 0;
    }

    @Override
    public boolean isFull() {
        return topIndex == SIZE -1; 
    }

    @Override
    public int pop() {
        if (!isEmpty()) {
            int value = array[topIndex];
            topIndex--;
            return value;
        }
        return -1;
    }

    @Override
    public boolean push(int value) {
        if (!isFull()) {
            topIndex++;
            array[topIndex] = value;
            return true;
       }
        return false;
    }

    @Override
    public void show() {
        for (int i = 0; i <= topIndex; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
}
