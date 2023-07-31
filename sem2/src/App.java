import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
 
    public static void main(String[] args) throws Exception {

       
        // Задача 1:
        // Напишите программу, которая запрашивает у пользователя число и проверяет,
        // является ли оно положительным. Если число
        // отрицательное или равно нулю, программа должна выбрасывать исключение
        // InvalidNumberException с сообщением "Некорректное
        // число". В противном случае, программа должна выводить сообщение "Число
        // корректно".
        System.out.println("Задача 1");
        numberOne one = new numberOne();
        one.checkSign();
        // Задача 2:
        // Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление. Если второе число равно нулю, 
        // программа должна выбрасывать исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо". В противном 
        // случае, программа должна выводить результат деления.

        System.out.println("Задача 2");
        numberTwo two = new numberTwo();
        two.devide();

    }
}
