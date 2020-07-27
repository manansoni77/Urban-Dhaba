import java.util.*;
class Restaurant_Main
{
    static int count,type;
    public static void main()
    {
        LaCarte l=new LaCarte();
        Party p=new Party();
        About a=new About();
        System.out.println('\u000c');
        System.out.println("-----Welcome to Urban Dhaba-----");
        Scanner in = new Scanner(System.in);
        System.out.println("Please select type of service,");
        System.out.println("1.La Carte");
        System.out.println("2.Party Meal");
        System.out.println("3.About us");
        System.out.println("4.Exit");
        type=in.nextInt();
        for (int count=0;count==0;)
        {
            if (type==1)
            {
                count=1;
                System.out.println("You have selected La Carte");
                l.LaCarte();
            }
            else if (type==2)
            {
                count=1;
                System.out.println("You have selected Party Meal");
                p.Party();
            }
            else if (type==3)
            {
                count=1;
                a.about();
            }
            else if (type==4)
            {
                System.exit(0);
            }
            else
            {
                System.out.println("Wrong choice....Pls try again");
            }
        }
    }
}