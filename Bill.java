import java.util.Scanner;
class Bill
{
    static int count,tl,cost;
    static Scanner in = new Scanner ( System.in );
    static Menu m=new Menu();
    static Restaurant_Main r=new Restaurant_Main();
    public static void LaCarteBill(int arr[][])
    {
        System.out.println('\u000c');
        System.out.println("----------Urban Dhaba----------");
        System.out.println("Type-LaCarte");
        System.out.println("Items-");
        for(count=0;count<20;count++)
        {
            cost=cost+m.menu(arr[count][0],arr[count][1]);
        }
        System.out.println("Sum Total               "+cost);
        System.out.println("Return?(press enter)");
        in.nextLine();
        r.main();
    }
    public static void PartyBill(int arr[],int n)
    {
        cost=n*250;
        System.out.println('\u000c');
        System.out.println("----------Urban Dhaba----------");
        System.out.println("Type-Party");
        System.out.println("Items-");
        for(count=0;count<5;count++)
        {
            m.menu(arr[count]);
        }
        System.out.println("Sum Total               "+cost);
        System.out.println("Return?(press enter)");
        in.nextLine();
        r.main();
        }
}