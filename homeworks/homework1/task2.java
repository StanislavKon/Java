package homeworks.homework1;

public class task2 {
    public static void main(String[] args) {
        // Вывести все простые числа от 1 до 1000 

        System.out.print("Простые числа от 1 до 1000: ");
        boolean flag = true;
        for (int num = 2; num <= 1000; num++) {
          for (int del = 2; del < num; del++) {
            if (num % del == 0) {
                flag = false;
                break;
            }
          }
            if (flag == true) System.out.print(num + " ");
            else flag = true;
        }
    }
}