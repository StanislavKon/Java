package homeworks2;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;

public class task4 {public static void main(String[] args) throws IOException {
    Scanner iScanner = new Scanner(System.in);
    System.out.print("Введите первое число = ");
    double a = iScanner.nextDouble();

    System.out.print("Введите знак операции (*, /, -, +): ");
    String sym = iScanner.next();

    System.out.print("Bведите второе число = ");
    double b = iScanner.nextDouble();
    iScanner.close();

    double result = calc(a, sym, b);
    log_result(a,b,result,sym);
    System.out.printf("Результат вычисления: %.2f %s %.2f = %.2f", a, sym, b, result);

}

static double calc(double a, String sym, double b) {
    double result;
    switch (sym) {
        case "*" -> result = a * b;
        case "/" -> {
            if (b == 0) {
                throw new ArithmeticException("На ноль делить нельзя!");
            }
            result = a / b;
        }
        case "+" -> result = a + b;
        case "-" -> result = a - b;
        default -> throw new IllegalArgumentException("Unsupported operation: " + sym);
    }
    return result;
}
static void log_result(double a, double b, double result, String operation) throws IOException {
    Logger log = Logger.getLogger(task4.class.getName());
    FileHandler fh =new FileHandler("logCalc.txt", true);
    log.addHandler(fh);
    log.setUseParentHandlers(false);

    SimpleFormatter sf = new SimpleFormatter();
    fh.setFormatter(sf);

    StringBuilder sb = new StringBuilder("Результат вычисления: ");
    sb.append(a);
    sb.append(" ");
    sb.append(operation);
    sb.append(" ");
    sb.append(b);
    sb.append(" ");
    sb.append(" = ");
    sb.append(" ");
    sb.append(result);
    sb.append(";");
    sb.append("\n");
    String res = sb.toString();

    log.log(Level.INFO, res);
}
    
}
