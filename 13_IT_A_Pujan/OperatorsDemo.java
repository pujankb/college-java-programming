
public class OperatorsDemo {
    public static void main(String[] args) {

        int a = 12;
        int b = 4;

        // 1. ARITHMETIC OPERATORS
        System.out.println("========== ARITHMETIC OPERATORS ==========");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println("==========================================");

        // 2. RELATIONAL OPERATORS
        System.out.println("\n========== RELATIONAL OPERATORS ==========");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("==========================================");

        // 3. LOGICAL OPERATORS
        System.out.println("\n========== LOGICAL OPERATORS =============");
        System.out.println("(a > b) && (a != b): " + ((a > b) && (a != b)));
        System.out.println("(a < b) || (a != b): " + ((a < b) || (a != b)));
        System.out.println("!(a > b): " + (!(a > b)));
        System.out.println("==========================================");

        // 4. ASSIGNMENT OPERATORS
        System.out.println("\n========== ASSIGNMENT OPERATORS ==========");
        int c = 10;

        System.out.println("c = " + c);

        c += 5;
        System.out.println("c += 5: " + c);

        c -= 3;
        System.out.println("c -= 3: " + c);

        c *= 2;
        System.out.println("c *= 2: " + c);

        c /= 4;
        System.out.println("c /= 4: " + c);

        c %= 3;
        System.out.println("c %= 3: " + c);
        System.out.println("==========================================");

        // 5. UNARY OPERATORS
        System.out.println("\n========== UNARY OPERATORS ===============");
        int x = 10;

        System.out.println("Original x = " + x);
        System.out.println("Pre-increment ++x = " + (++x));
        System.out.println("Post-increment x++ = " + (x++));
        System.out.println("After increment x = " + x);
        System.out.println("Pre-decrement --x = " + (--x));
        System.out.println("Post-decrement x-- = " + (x--));
        System.out.println("After decrement x = " + x);
        System.out.println("Unary plus +x = " + (+x));
        System.out.println("Unary minus -x = " + (-x));
        System.out.println("Logical NOT !true = " + (!true));
        System.out.println("==========================================");
    }
}
