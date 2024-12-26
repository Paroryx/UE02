public class Calc {
    public static void main(String[] args) {
        //input
        int a = In.readInt();
        int b = In.readInt();
        int c = In.readInt();
        int d = In.readInt();
        
        //calculations
        int calc1 = b+c+d;
        int calc2 = a*b*c*d;
        int calc3 = (a+d)*(b+c);
        float calc4 = (float)b/d;
        int calc5 = b % d;
        float calc6 = (float)Math.sqrt((double)a);
        float calc7 = (float)Math.pow(c, (double)d);
        float calc8 = (float)Math.pow(2, (double)b/c);
        float calc9 = (float)((double)b/10 *(Math.pow(Math.PI, d+(double)a/4)+5)+c);

        //output
        Out.println("1st number (a): %s".formatted(a));
        Out.println("2nd number (b): %s".formatted(b));
        Out.println("3rd number (c): %s".formatted(c));
        Out.println("4th number (d): %s".formatted(d));
        Out.println("Sum of b, c, and d: %d".formatted(calc1));
        Out.println("Product of all numbers: %d".formatted(calc2));
        Out.println("The sum of a and d times the sum of b and c: %d".formatted(calc3));
        Out.println("b divided by d: %.2f".formatted(calc4));
        Out.println("Remainder of b divided by d: %d".formatted(calc5));
        Out.println("Square root of a: %.2f".formatted(calc6));
        Out.println("c to the power of d (displayed without floating point): %.0f".formatted(calc7));
        Out.println("2 to the power of b/c (as floating point number): %.2f".formatted(calc8));
        Out.println("Complex equation: %.2f".formatted(calc9));
    }
    
}
