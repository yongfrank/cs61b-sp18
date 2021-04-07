/** Demonstrates creation of a method in Java. */
public class HelloNumbers {
    public static void main(String[] args) {
        int x = 0;
        int i = 1;
        while (x < 50) {
            System.out.print(x + " ");
            x = x + i;
            i++;
        }
        System.out.println();
    }
}
/*
1. Before Java variables can be used, they must be declared.
2. Java variables must ahve a specific type.
3. Java vvariable types can never change.
4. Types are verified before the code even runs.
*/

/*
3. All parameters of a function must have a declared type, and the return value of the function must have a declared type.
   Functions in Java return only one value!
*/