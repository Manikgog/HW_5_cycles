public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1.");
        // С помощью цикла for вывести все числа от 1 до 10 в консоль.
        boolean first = true;
        for(int i = 0; i < 10; i++){
            if(!first){
                System.out.print(", ");
            }
            first = false;
            System.out.print(i+1);
        }
        System.out.println("\n");

        System.out.println("Задача 2.");
        // С помощью цикла for выведите все числа от 10 до 1
        first = true;
        for(int i = 10; i > 0; --i){
            if(!first){
                System.out.print(", ");
            }
            first = false;
            System.out.print(i);
        }
        System.out.println("\n");

        System.out.println("Задача 3.");
        // С помощью цикла for выведите все чётные числа от 0 до 17
        first = true;
        for(int i = 0; i <= 17; ++i){
            if(i%2 == 0) {
                if (!first) {
                    System.out.print(", ");
                }
                first = false;

                System.out.print(i);
            }
        }
        System.out.println("\n");

        System.out.println("Задача 4.");
        // Выведите в консоль все числа от 10 до −10 от бо́льшего числа к меньшему.
        first = true;
        for(int i = 10; i >= -10; --i){
                if (!first) {
                    System.out.print(", ");
                }
                first = false;
                System.out.print(i);
        }
        System.out.println("\n");

        System.out.println("Задача 5.");
        // Напишите программу, которая выводит в консоль все високосные года, начиная с
        // 1904 года до 2096. В консоль результат должен выводиться в формате: «… год
        // является високосным».
        for(int i = 1904; i <= 2096; i++){
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                System.out.println(i + " год является високосным.");
            }
        }
        System.out.println("\n");

        System.out.println("Задача 6.");
        // Напишите программу, которая выводит в консоль последовательность чисел:
        // 7 14 21 28 35 42 49 56 63 70 77 84 91 98
        first = true;
        for (int i = 7; i <= 98; i+=7){
            if (!first) {
                System.out.print(", ");
            }
            first = false;
            System.out.print(i);
        }
        System.out.println("\n");

        System.out.println("Задача 7.");
        // Напишите программу, которая выводит в консоль последовательность чисел:
        // 1 2 4 8 16 32 64 128 256 512
        first = true;
        int res = 1;
        for (int i = 0; i < 10; i++){
            if (!first) {
                System.out.print(", ");
            }
            first = false;
            if(i == 0){
                System.out.print(res);
                continue;
            }
            res *= 2;
            System.out.print(res);
        }
        System.out.println("\n");

        System.out.println("Задача 8.");
        // Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц
        // вы будете откладывать по 29 000 рублей «в банку».
        // Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц …,
        // сумма накоплений равна … рублей».

        int monthlyContribution = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++){
            total += monthlyContribution;
            System.out.println("Месяц " + i + ", cумма накоплений равна " + total + " рублей.");
        }
        System.out.println("\n");

        System.out.println("Задача 9.");
        // Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц
        // вы будете откладывать по 29 000 рублей «в банку».
        // Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц …,
        // сумма накоплений равна … рублей».

        float totaly = 0;
        float monthlyPercent;
        for (int i = 1; i <= 12; i++){
            monthlyPercent = totaly/100.0F;
            totaly += monthlyContribution + monthlyPercent;
            System.out.println("Месяц " + i + ", cумма накоплений равна " + totaly + " рублей.");
        }
        System.out.println("\n");

        System.out.println("Задача 10.");
        // Напишите программу, которая выводит в консоль таблицу умножения на 2:
        //2*1=2
        //2*2=4
        //2*3=6
        //2*4=8
        //2*5=10
        //2*6=12
        //2*7=14
        //2*8=16
        //2*9=18
        //2*10=20
        int two = 2;
        for (int i = 1; i <= 10; i++){
            System.out.println(two + "*" + i + "=" + two*i);
        }
        System.out.println("\n");

    }
}