

public class PowerCalculator {

    public int number1Int;
    public int number2Int;

  

    

   

    public PowerCalculator(int number1Int, int number2Int) {
        this.number1Int = number1Int;
        this.number2Int = number2Int;
    }


    public void calculatePower(){
        try {
            checkDegree();
            System.out.println(number1Int+" ^ "+number2Int+" = "+Math.pow(number1Int, number2Int));
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }
       
       
        
        
    }


    public void checkDegree() throws InvalidInputException {
        int number1Int = this.number1Int;
        int number2Int = this.number2Int;
        if (number1Int == 0 && number2Int<=0) {
            throw new InvalidInputException("Некорректное основание (ноль) и отрицательная степень (или нулевая)");
        } 
    }
    
}
