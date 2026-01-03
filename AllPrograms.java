import java.util.Scanner;

public class AllPrograms {

    static Scanner sc = new Scanner(System.in);

    // 1 & 2 & 5 & 6 handled using matrix
    static void matrixOperations() {
        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] a = new int[r][c];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();

        // Row sum
        for (int i = 0; i < r; i++) {
            int sum = 0;
            for (int j = 0; j < c; j++)
                sum += a[i][j];
            System.out.println("Sum of row " + i + " = " + sum);
        }

        // Column sum
        for (int j = 0; j < c; j++) {
            int sum = 0;
            for (int i = 0; i < r; i++)
                sum += a[i][j];
            System.out.println("Sum of column " + j + " = " + sum);
        }

        // Diagonal sum
        int dsum = 0;
        for (int i = 0; i < r && i < c; i++)
            dsum += a[i][i];
        System.out.println("Diagonal sum = " + dsum);

        // Search element
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                if (a[i][j] == key)
                    found = true;

        System.out.println(found ? "Element Found" : "Element Not Found");
    }

    // 3 & 4
    static void arrayOperations() {
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int max = a[0], min = a[0];
        int pos = 0, neg = 0, zero = 0;

        for (int x : a) {
            if (x > max) max = x;
            if (x < min) min = x;
            if (x > 0) pos++;
            else if (x < 0) neg++;
            else zero++;
        }

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        System.out.println("Positive = " + pos);
        System.out.println("Negative = " + neg);
        System.out.println("Zero = " + zero);
    }

    // 7
    static void addMatrix() {
        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] a = new int[r][c];
        int[][] b = new int[r][c];

        System.out.println("Enter first matrix:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Enter second matrix:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                b[i][j] = sc.nextInt();

        System.out.println("Sum of matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                System.out.print((a[i][j] + b[i][j]) + " ");
            System.out.println();
        }
    }

    // 8
    static void palindrome() {
        System.out.print("Enter number: ");
        int n = sc.nextInt(), rev = 0, temp = n;

        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }

        System.out.println(temp == rev ? "Palindrome" : "Not Palindrome");
    }

    // 9
    static void gcd() {
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();

        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        System.out.println("GCD = " + a);
    }

    // 10
    static void digitCountSum() {
        System.out.print("Enter number: ");
        int n = sc.nextInt(), count = 0, sum = 0;

        while (n > 0) {
            sum += n % 10;
            count++;
            n /= 10;
        }
        System.out.println("Digits = " + count);
        System.out.println("Sum of digits = " + sum);
    }

    // 11
    static void primeCheck() {
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        boolean prime = n > 1;

        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0) prime = false;

        System.out.println(prime ? "Prime" : "Not Prime");
    }

    // 12
    static void armstrong() {
        System.out.print("Enter number: ");
        int n = sc.nextInt(), temp = n, sum = 0;

        while (n > 0) {
            int d = n % 10;
            sum += d * d * d;
            n /= 10;
        }

        System.out.println(sum == temp ? "Armstrong" : "Not Armstrong");
    }

    // 13
    static void fibonacci() {
        System.out.print("Enter limit: ");
        int n = sc.nextInt(), a = 0, b = 1;

        System.out.print("Fibonacci: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    // 14
    static void factorial() {
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        long fact = 1;

        for (int i = 1; i <= n; i++)
            fact *= i;

        System.out.println("Factorial = " + fact);
    }

    // 15
    static void largestOfTwo() {
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Largest = " + (a > b ? a : b));
    }

    public static void main(String[] args) {
        System.out.println("---- ALL PROGRAMS ----");
        matrixOperations();
        arrayOperations();
        addMatrix();
        palindrome();
        gcd();
        digitCountSum();
        primeCheck();
        armstrong();
        fibonacci();
        factorial();
        largestOfTwo();
    }
}
