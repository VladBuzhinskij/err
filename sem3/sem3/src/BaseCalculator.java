public class BaseCalculator {
    public int number1Int;
    public int number2Int;

    public BaseCalculator(int number1Int, int number2Int) {
        this.number1Int = number1Int;
        this.number2Int = number2Int;
    }

    public void plus() {
        System.out.println(number1Int + " + " + number2Int + " = " + (number1Int + number2Int));
    }

    public void minus() {
        System.out.println(number1Int + " - " + number2Int + " = " + (number1Int - number2Int));
    }

    public void division() {
        try {
            checkDivision();
            System.out.println(number1Int + " / " + number2Int + " = " + (number1Int / number2Int));
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }
        
    }

    public void multy() {
        System.out.println(number1Int + " * " + number2Int + " = " + (number1Int * number2Int));
    }

    public void checkDivision() throws InvalidInputException {

        int number2Int = this.number2Int;
        if (number2Int == 0) {
            throw new InvalidInputException("Деление на ноль ");
        }
    }
}
