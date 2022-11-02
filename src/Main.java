public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1");
        for (int i=1; i<=10; i++)
            System.out.println(i);

        //Задача 2
        System.out.println("Задача 2");
        for (int a=10; a>=1; a--)
            System.out.println(a);

        //Задача 3
        System.out.println("Задача 3");
        for (int s=0; s<=17; s=s+2)
            System.out.println(s);

        //Задача 4
        System.out.println("Задача 4");
        for (int y=10; y>=-10; y--)
            System.out.println(y);

        //Задача 5
        System.out.println("Задача 5");
        for (int f=1904; f<=2096; f=f+4)
            System.out.println(f + " год - весокосный.");

        //Задача 6
        System.out.println("Задача 6");
        for (int r=7; r<=98; r=r+7)
            System.out.println(r);

        //Задача 7
        System.out.println("Задача 7");
        for (int e=1; e<=512; e=e*2)
            System.out.println(e);

        //Задача 8
        System.out.println("Задача 8");
        int money=29000;
        int total=0;
        for (int p=1; p<=12; p++) {
            total=total+money;
            System.out.println("Месяц по счету " + p + " итого, накопленно денег " + total);
        }

        //Задача 9
        System.out.println("Задача 9");
        int money1=29000;
        int total1=0;
        for (int d=1; d<=12; d++) {
            total1=total1+total1/100;
            total1=total1+money1;
            System.out.println("Месяц по счету " + d + " итого, накопленно денег " + total1);
        }

    }
}