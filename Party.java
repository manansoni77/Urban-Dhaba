import java.util.*;
import java.io.*;
class Party
{
    static Menu m= new Menu();
    static int ic,count,n,count2,tl;
    static String ans;
    static int[] arr=new int[5];
    static Scanner in = new Scanner(System.in); 
    public static void Party()
    {
        for (int count=0;count==0;)
        {
            System.out.println("Show Menu(y/n)?");
            ans=in.nextLine();
            ans=ans.toUpperCase();
            if (ans.equals("Y"))                
            {
                for(count2=1;count2<21;count2++)
                {
                    m.menu(count2);
                }
                count=1;
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
        System.out.println("Select Five Items");
        for (count=0;count<5;)
        {
            System.out.println("Enter item code");
            ic=in.nextInt();
            if (ic>0 && ic <21)
            {
                arr[count]=ic;
                count+=1;
            }
            else 
            {
                System.out.println("try again");
            }
        }
        for (int count=0;count==0;)
        {
                System.out.println("Enter number of people");
                n=in.nextInt();
                count++;
        }
        System.out.println("Generating bill...");
        for(tl=0;tl<20000000;tl++)
        {
            System.out.print("");
        }
        Bill b=new Bill();
        b.PartyBill(arr,n);
    }
}