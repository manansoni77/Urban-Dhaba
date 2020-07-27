import java.util.Scanner;
class About
{
    public static void about()
    {
        Scanner in = new Scanner(System.in);
        System.out.println('\u000c');
        System.out.println("----------URBAN DHABA----------");
        System.out.println("We are a standalone restaurant aimed"+'\n'+"at providing college students and"+'\n'+"general public quality food at low prices.");
        System.out.println("Contact Us-"+'\n'+"mobile-9329903929"+'\n'+"email-id-urban_dhaba@gmail.com");
        System.out.println("Address-"+'\n'+"21/7,Anand Bazaar"+'\n'+"Indore");
        System.out.println("Return?(Press enter)");
        in.nextLine();
        Restaurant_Main r=new Restaurant_Main();
        r.main();
    }
}
    
    