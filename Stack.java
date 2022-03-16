package generics;

public class Stack< E >{
    private final int size;
    private int top;
    private E[] element;

    public Stack()
    {
        //size = 10;
        this(10);
    }

    public Stack(int s)
    {
        size = s > 0 ? s : 0;
        top = -1;

        element = (E[]) new Object[size];
    }


    public void push(E pushValue)
    {
        if(top == size -1){
            throw new FullStackException(String.format("Stack is Full. Can't push %s \n", pushValue));

        }

        element[ ++top] = pushValue;
    }

    public E pop() throws EmptyStackException {
        if( top == -1){
            throw new EmptyStackException("Stack is empty can't push");
        }

        return element[ top--];
    }
}
