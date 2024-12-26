public class MyFirstProgram {
    /*
    * The used unicode character ’ was not displayed correctly in my console
    */
    public static void main(String[] args) {
        Out.println("Hello user, how tall are you (in cm)?");
        int cm = In.readInt();
        Out.println(String.format("So you’re %dcm tall?", cm));
        int mm = cm * 10;
        Out.println("Wow! That’s " + mm + "mm!");
        double meter = cm / 100.0;
        Out.println("Or " + meter + " meters!");
    }
}    