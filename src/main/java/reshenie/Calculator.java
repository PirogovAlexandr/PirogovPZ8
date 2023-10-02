package reshenie;

import java.util.Scanner;
// PZ8 Pirogov.a.p. KI-35
public class Calculator {
    public Calculator()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи число а, чтобы я записал его для решения!");
        double a = scanner.nextDouble();
        System.out.println("Введи число b, чтобы я записал его для решения!");
        double b = scanner.nextDouble();
        System.out.println("Введи число c, чтобы я записал его для решения!");
        double c = scanner.nextDouble();
        double x1 = 0;
        double x2 = 0;
        double d = (b * b) - (4 * a * c);
        if (d > 0) {
            x1 = b - Math.sqrt(d) / (2 * a);
            x2 = b + Math.sqrt(d) / (2 * a);
            System.out.println("Выходит, что дискриминант выше нуля! Ответ таков: ");
            System.out.println("x2 = "+ x2 );
            System.out.println("x1 = " + x1);
            System.out.println("Спасибо за использование программы! Пока!");
        } else if (d == 0) {
            x1 = b / (2 * a);
            x2 = b / (2 * a);
            System.out.println("Ну что же, дискриминант равен нулю. Поздравляю, x1=x2!.");
            System.out.println("x1 = " +x1);
            System.out.println("x2 = " +x2);
            System.out.println("Спасибо за использование программы! Пока!");
        } else {
            System.out.println("Дискриминант меньше нуля. Корней нет. Точнее есть, но это мнимые корни, так что я тебе таких вещей не подскажу.");
            System.out.println("Спасибо за использование программы! Пока!");
            System.exit(0);
        }
    }
}