import java.io.BufferedReader;
import java.io.InputStreamReader;

public class numberTwo {
    
    public int number1Int;
    public int number2Int;
    public numberTwo() throws Exception {
        
        
        this.number1Int=requestInt("Введите первое число");
        this.number2Int=requestInt("Введите второе число");
    }
    
    private static int requestInt(String quetion) throws Exception {
        boolean cycle = true;
        String line;
        int a=0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      
        while (cycle) {
            
            System.out.println(quetion);
            line = reader.readLine();
            try{
                a = Integer.parseInt(line);
                cycle = false;}
            catch (NumberFormatException e){}
            

        }
        //reader.close();

        return a;
    }

    public  void devide ()throws DivisionByZeroException{
        int number1Int=this.number1Int;
        int number2Int=this.number2Int;
        if (number2Int==0){
            throw new DivisionByZeroException("Деление на ноль недопустимо");
            
        }
        else{
            System.out.println("Результат дления: "+number1Int/number2Int);
        }
    }
}
