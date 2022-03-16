package generics;

public class First {

    public static void printObject(Object[] inputArray)
    {
        for(Object element : inputArray){
            System.out.printf("%s ",element);
        }
        System.out.println(" ");
    }

    public static <E> void printArray(E[] inputArray)
    {
        for(E element: inputArray ){
            System.out.print(element + " ");
        }
        System.out.println("\n");

    }

    public static void main(String[] args) {
        Integer intArray[] = {1,2,3,4,5,6,7,8,9,10};
        Double doubleArray[] = {1.5,2.34,3.78,4.1234,5.789,6.123,7.89,8.11122,9.6757,10.66};
        Character[] charArray = {'a','b','c','d','r'};
        String[] string = {"sakib", "Al", "Hasan"};


        System.out.println("Array integer array print");
        printArray(intArray);
        System.out.println("Array double array print");
        printArray(doubleArray);
        System.out.println("Array character array print");
        printArray(charArray);
        System.out.println("String   array print");
        printArray(string);

        System.out.println("\n\n Object print here\n\n");

        System.out.println("Array integer array print");
        printObject(intArray);
        System.out.println("Array double array print");
        printObject(doubleArray);
        System.out.println("Array character array print");
        printObject(charArray);
        System.out.println("Array string array print");
        printObject(string);
    }
}
