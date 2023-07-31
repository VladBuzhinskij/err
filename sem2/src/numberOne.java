import java.io.BufferedReader;
import java.io.InputStreamReader;

public class numberOne {
    

    public int numberInt;
    public numberOne() throws Exception {
        
        
        this.numberInt=requestInt("Введите число");
    
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

    public  void checkSign ()throws InvalidNumberException{
        int numberInt=this.numberInt;
        if (numberInt>0){
            System.out.println("Число корректно");
        }
        else{
            throw new InvalidNumberException("Некорректное число");
        }
    }

}
