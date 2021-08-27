public class RemusDrancaWeek1Homework {
    public static void main(String[] args) {


        //Define and print on separate lines the following data types:
        // Primitive: boolean, char, int, long, double
        // Non primitive: String, array;

        Boolean test = true;
        System.out.println("Boolean value is " + true);

        char firstLetter = 'C';
        System.out.println("First letter =  " + firstLetter);

        int IntNumber = 123;
        System.out.println("Int number = " + IntNumber);

        long LongNumber = 1000L;
        System.out.println("Long number = " + LongNumber);

        double DoubleNumber = 33.33;
        System.out.println("Double number = " + DoubleNumber);

        int array[]={1,2,3,4,5};
        System.out.println("Array =");
        for(int i=0;i<array.length;i++) {
            System.out.println(array[i]);
        }

        String z="StringName";
        System.out.println("The string is: " + z);

        //Define some integer variables. Perform the operations below and print the result
        // increment it using the unary operator

        int x = 20;
        System.out.println("Incremented number = " + ++x);

        // perform some random arithmetic operations using the arithmetic operators

        int d = 4;
        int d1 = 8;
        System.out.println("Random arithmetic operation = " + d*d1);

        int e = 3;
        int e1 = 9;
        System.out.println("Is e bigger then e1? " + (e>e1));


        // Define two integer variables, a and b
        //Using an if-else statement, compare the values, and
        //if a is larger, print "<value of a> is larger than <value of b>"
        //if b is larger, print "<value of b> is larger than <value of a>"
        //if numbers are equal, print "<value of a> is equal to <value of b>"

        int a = 5;
        int b = 10;

        if (a>b){
            System.out.println(a + " Is larger than " + b);
        }
        else if (a<b){
            System.out.println(b + " Is larger than " + a );}
        else if (a==b) { System.out.println(a + " Is egual to " + b ); }




        // Define a number array of 10 elements, using random values from range 1 to 100, which needs to include number 15;
        // Using a for loop, print the values of every element on separate lines. If an element has value 15, skip printing this value.

        int arr[]={10, 15, 20, 25, 30, 35, 40, 45, 50};
        for(int i=0;i<arr.length;i++) {
            if (arr[i] != 15)
                System.out.println(arr[i]);
        }




    }



}
