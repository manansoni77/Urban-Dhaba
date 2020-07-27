import java.util.Scanner;
class m
{
    public static  void menu(int a)
    {
        switch (a)
        {
            case 1:System.out.println("1.Cheese Chutney Sandwich        40");break;
            case 2:System.out.println("2.Chutney Sandwich               35");break;
            case 3:System.out.println("3.Veg Sandwich                   35");break;
            case 4:System.out.println("4.Veg Cheese Sandwich            40");break;
            case 5:System.out.println("5.Chutney Grill Sandwich         40");break;
            case 6:System.out.println("6.Veg Grill Sandwich             40");break;
            case 7:System.out.println("7.Cheese Veg Pizza               45");break;
            case 8:System.out.println("8.Cheese Burger                  45");break;
            case 9:System.out.println("9.Cheese Pattice                 35");break;
            case 10:System.out.println("10.Manchurian Role               40");break;
            case 11:System.out.println("11.Cold Coffee                   40");break;
            case 12:System.out.println("12.Cold coffee with Ice Cream    50");break;
            case 13:System.out.println("13.Frothy Cold coffee            45");break;
            case 14:System.out.println("14.Hot Espresso                  30");break;
            case 15:System.out.println("15.Cappucino Hot coffee          40");break;
            case 16:System.out.println("16.Mausambi Juice                35");break;
            case 17:System.out.println("17.Orange Juice                  35");break;
            case 18:System.out.println("18.Pineapple Juice               35");break;
            case 19:System.out.println("19.Mango Juice                   40");break;
            case 20:System.out.println("20.Apple Juice                   35");break;
        }
    }
    public static int menu(int a,int c,int b)
    {
        b=0;
        switch (a)
        {
            case 1:System.out.println("1.Cheese Chutney Sandwich        40"+"x"+c);b=(40*c);break;
            case 2:System.out.println("2.Chutney Sandwich               35"+"x"+c);b=(35*c);break;
            case 3:System.out.println("3.Veg Sandwich                   35"+"x"+c);b=(35*c);break;
            case 4:System.out.println("4.Veg Cheese Sandwich            40"+"x"+c);b=(40*c);break;
            case 5:System.out.println("5.Chutney Grill Sandwich         40"+"x"+c);b=(40*c);break;
            case 6:System.out.println("6.Veg Grill Sandwich             40"+"x"+c);b=(40*c);break;
            case 7:System.out.println("7.Cheese Veg Pizza               45"+"x"+c);b=(45*c);break;
            case 8:System.out.println("8.Cheese Burger                  45"+"x"+c);b=(45*c);break;
            case 9:System.out.println("9.Cheese Pattice                 35"+"x"+c);b=(35*c);break;
            case 10:System.out.println("10.Manchurian Role               40"+"x"+c);b=(40*c);break;
            case 11:System.out.println("11.Cold Coffee                   40"+"x"+c);b=(40*c);break;
            case 12:System.out.println("12.Cold coffee with Ice Cream    50"+"x"+c);b=(50*c);break;
            case 13:System.out.println("13.Frothy Cold coffee            45"+"x"+c);b=(45*c);break;
            case 14:System.out.println("14.Hot Espresso                  30"+"x"+c);b=(30*c);break;
            case 15:System.out.println("15.Cappucino Hot coffee          40"+"x"+c);b=(40*c);break;
            case 16:System.out.println("16.Mausambi Juice                35"+"x"+c);b=(35*c);break;
            case 17:System.out.println("17.Orange Juice                  35"+"x"+c);b=(35*c);break;
            case 18:System.out.println("18.Pineapple Juice               35"+"x"+c);b=(35*c);break;
            case 19:System.out.println("19.Mango Juice                   40"+"x"+c);b=(40*c);break;
            case 20:System.out.println("20.Apple Juice                   35"+"x"+c);b=(35*c);break;
        }
        return b;
    }
}