package generics;

import javax.print.attribute.IntegerSyntax;

public class StackTest2 {
    private Double[] doubleElement = {1.1,2.2,3.3,4.4,5.5,6.6};
    private Integer[] integerElement = {1,2,3,4,5,6,7,8,9,10,11};

    private Stack<Double> doubleStack;
    private Stack<Integer> integerStack;

    public void testStacks()
    {
        doubleStack = new Stack< Double>(5);
        integerStack = new Stack< Integer>(10);

        testPush("doubleStack",doubleStack,doubleElement);
        testPop("doubleStack",doubleStack);
        testPush("integerStack",integerStack,integerElement);
        testPop("integerStack",integerStack);
    }


    public<T> void testPush(String name, Stack<T> stack, T[] elements)
    {
        try{
            System.err.printf("\n Pushing element onto %s ",name);

            for(T element: elements){
                System.out.printf("%s ",element);
                stack.push(element);
            }
        }
        catch(FullStackException fullStackException)
        {
            System.out.println();
            fullStackException.printStackTrace();
        }
    }


    public<T> void testPop(String name, Stack< T > stack)
    {
        try
        {
            System.out.printf("\n Poping ements from %s \n",name);
            T popValue;

            while(true)
            {
                popValue = stack.pop();
                System.out.printf("%s",popValue);
            }
        }
        catch(EmptyStackException emptyStackException)
        {
            System.out.println();
            emptyStackException.printStackTrace();
        }
    }

    public static void main(String[] args) {
        StackTest2 application = new StackTest2();
        application.testStacks();
    }
}
