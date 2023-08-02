import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Request {
    public int number1Int;
    public int number2Int;
    public String operator;

    public Request() {
        try {
            this.number1Int = requestInt("Введите первое число: ");
            this.number2Int = requestInt("Введите второе число: ");
            this.operator = requestOperator("Введите оператор: ");
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }

    private static int requestInt(String quetion) throws IOException {
        boolean cycle = true;
        String line;
        int a = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (cycle) {
                System.out.println(quetion);

                line = reader.readLine();

                try {
                    a = Integer.parseInt(line);
                    cycle = false;
                } catch (NumberFormatException e) {
                }

            }
        

        // reader.close();

        return a;
    }


    private static String requestOperator(String quetion) throws IOException {
        boolean cycle = true;
        String line="";
     
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (cycle) {
                System.out.println(quetion);

                line = reader.readLine();
                if (line .equals("*")|| line.equals("/") || line.equals("+")|| line.equals("-")|| line.equals("^")){
                    
                    cycle=false;
                    return line;
                }
                

            }
        

        // reader.close();

        return line;
    }

}
