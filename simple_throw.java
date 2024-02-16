public class simple_throw {
    public static void main(String[] args) {
        // try block containing exception-prone code
        try {
            System.out.println("try Block:: Begin");
            int myArray[] = new int[5];
            myArray[6] = 10 / 0;
        }
        // multiple catch block
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds :: Accessed index out of bounds");
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception :: Divide by zero!!");
        }

        catch (Exception e) {
            System.out.println("Exception :: " + e.getMessage());
        }
        System.out.println("rest of the code");
    }
}
