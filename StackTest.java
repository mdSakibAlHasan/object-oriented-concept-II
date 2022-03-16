package generics;

public class StackTest {

    private double[] doubleElement = {1.1, 1.2, 3.3, 2.2, 4.4, 5.5, 6.6};
    private int[]  integerElement = {1,2,3,4,54,6,7,8,9,10,11};

    private Stack< Double > doubleStack;
    private Stack< Integer > integerStack;


    public void testStack()
    {
        doubleStack = new Stack< Double >(5);
        integerStack = new Stack< Integer >(10);

        //testPush
    }

    public void testPushDouble()
    {
        try
        {
            System.out.println("\n Pushing elements ontu doubleStack");

            for(double element : doubleElement)
            {
                System.out.printf("%lf ",element);
                doubleStack.push(element);
            }
        }
        catch(FullStackException fullStackException){
            System.err.println();
            fullStackException.printStackTrace();
        }
    }


    public void testPopDouble()
    {
        try
        {
            System.out.println("\n Poping element from double stack");
            double popValue;

            while(true)
            {
                popValue = doubleStack.pop();
                System.out.printf("%lf ",popValue);
            }
        }
        catch(EmptyStackException emptyStackException)
        {
            System.err.println();
            emptyStackException.printStackTrace();
        }
    }



}
