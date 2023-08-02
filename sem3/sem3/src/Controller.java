public class Controller {
    public void run(){
        boolean cycle= true;
        while (cycle){
            Request input =new Request();
            String operator = input.operator;

            BaseCalculator bCalc=new BaseCalculator(input.number1Int,input.number2Int);
            if (operator.equals("*")){
                bCalc.multy();
            }
            else if(operator.equals("/")){
                bCalc.division();
            }
            else if(operator.equals("+")){
                bCalc.plus();
            }
            else if(operator.equals("-")){
                bCalc.minus();
            }
            else if(operator.equals("^")){
                PowerCalculator pCalc=new PowerCalculator(input.number1Int, input.number2Int);
                pCalc.calculatePower();
            }
        }
    }
    
}
