import java.util.Scanner;
class LaCarte
{
    static Menu m= new Menu();
    static int count2,count,ic=1,tl;
    static String ans;
    static int[][] arr=new int[20][2];
    static Scanner in = new Scanner(System.in);
    static Restaurant_Main r=new Restaurant_Main();
    public static void LaCarte()
    {
        for (count=0;count==0;)
        {
            System.out.println("Show Menu(y/n)?");
            ans=in.nextLine();
            ans=ans.toUpperCase();
            if (ans.equals("Y"))
            {
                for(count2=1;count2<21;count2++)
                {
                    m.menu(count2);
                    count=1;
                }
            }
            else if (ans.equals("N"))
            {
                count=1;
            }
            else if (!ans.equals("Y") && !ans.equals("N"))
            {
                System.out.println("Wrong choice!!!");
            }
        }
        System.out.println("Select items (enter 0 when done)");
        try
        {
            for(count=0;ic!=0;count++)
            { 
                System.out.println("enter item-code");
                ic=in.nextInt();
                if (ic!=0&&ic<21)
                {
                    arr[count][0]=ic;
                    System.out.println("enter number of items");
                    arr[count][1]=in.nextInt();
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("Wrong Input!!!");
        }
        if (arr[0][0]==0)
        {
            System.out.println("No Item Selected...");
            r.main();
        }
        System.out.println("Do you wish to generate bill of current items?");
        for (int count=0;count==0;)
        {
            ans=in.nextLine();
            ans=in.nextLine();
            ans=ans.toUpperCase();
            if (ans.equals("Y"))
            {
                count=1;
                System.out.println("Generating bill...");
                for(int tl=0;tl<20000000;tl++)
                {
                    System.out.print("");
                }
                Bill b=new Bill();
                b.LaCarteBill(arr);
            }
            else if (ans.equals("N"))
            {
                count=1;
                r.main();
            }
            else 
            {
                System.out.println("Wrong choice!!!");
            }
        }
    }
    
}