import java.util.Scanner;

class Basics {
    public static void main(String[] args) {

// Hello World
        System.out.println("Hello, World!");

// ******************** Variables & Primitive DataTypes ****************************

/*
    Syntax of Valid Naming : int age; int _name; double totalAmount; String dollar$sign;
    Syntax of Invalid Naming : int 123abc; int a#name; int else;
*/

// Primitive Data Type :
        int i = 56;
        byte b = 4;
        short s = 45;
        char c = 'K';
        float f = 4.5f;
        double d = 56.6765;
        long l = 12322;

        System.out.println("integer :" + i);
        System.out.println("byte :" + b);
        System.out.println("short :" + s);
        System.out.println("char :" + c);
        System.out.println("float :" + f);
        System.out.println("double :" + d);
        System.out.println("long :" + l);

//******************************* Input & Output *******************************

        // ********* Input *******
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your age: ");

        int age = scn.nextInt();
        System.out.println("Your age is " + age);

        // *********** Output *******
        // Method 2
        String greeting = "Hello";
        System.out.println(greeting + " ");
        System.out.println("How are you?");

        // Method 3
        int num1 = 100, num2 = 300;
        System.out.printf("Num1 = %d, Num2 = %d", num1, num2);


// ***************************** Operators ****************************

        // 1.Arithmetic Operators
        int n1 = 10, n2 = 20;
        System.out.println("Addition : " + (n1+n2));
        System.out.println("Subtraction : " + (n1-n2));
        System.out.println("Multiplication : " + (n1*n2));
        System.out.println("Division : " + (n1 / n2));
        System.out.println("Modulo : " + (n1%n2));

        // 2.Assignment Operators
        int j = 10, k = 5;

        j = k; // simple assignment
        System.out.println("After assignment : " + j);

        j += k; // Compound assignment
        System.out.println("After addition assignment : " + j);

        j -= k;
        System.out.println("After subtraction assignment : " + j);

        j *= k;
        System.out.println("After multiplication assignment : " + j);

        j /= k;
        System.out.println("After division assignment : " + j);


        // 3.Relational Operators
        int m = 5, n = 7;

        System.out.println("Equal to : " + (m==n));
        System.out.println("Not Equal to : " + (m!=n));
        System.out.println("Greater than : " + (m>n));
        System.out.println("Less than : " + (m<n));
        System.out.println("Greater than  or Equal to : " + (m>=n));
        System.out.println("Less than or Equal to : " + (m<=n));


        // 4.Logical Operators
        boolean p = true, q = false;

        System.out.println("Logical AND :" + (p && q));
        System.out.println("Logical OR :" + (p || q));
        System.out.println("Logical NOT :" + (!p));

        // 5.Ternary operator
        int u = 20, v = 45, w = 67, result;
        result
                = ((u > v) ? (u > w) ? u : w : (v > w) ? v : w);
        System.out.println("Max of three numbers : " + result);
        

    }
}
