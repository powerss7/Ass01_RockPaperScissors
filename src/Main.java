import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    //nested IF
    {
        Scanner in = new Scanner(System.in);
        String playerA = "";
        String playerB = "";
        String trash = "";

        System.out.print("PlayerA pleas enter your move: ");
        playerA = in.nextLine();

        System.out.print("PlayerB pleas enter your move: ");
        playerB = in.nextLine();


        if(playerA.equalsIgnoreCase("R"))
        {
            // playerB code crossed agains thee playerA Rock move
            if(playerB.equalsIgnoreCase("R"))
            {
                System.out.println("Rock vs Rock. it is a TIE!");
            }
            else if (playerB.equalsIgnoreCase("P"))
            {
                System.out.println("Paper covers Rock. player B wins!");
            }
            else if (playerB.equalsIgnoreCase("S"))
            {
                System.out.println("Rock breaks scissors! player A wins!");
            }
            else
            {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid number");
            }
        }
        else if(playerA.equalsIgnoreCase("P"))
        {
            // playerB code crossed agains thee playerA paper move
            if(playerB.equalsIgnoreCase("R"))
            {
                System.out.println("Paper covers Rock! player A wins!");
            }
            else if (playerB.equalsIgnoreCase("P"))
            {
                System.out.println("Paper vs Paper! it is a TIE!");
            }
            else if (playerB.equalsIgnoreCase("S"))
            {
                System.out.println("Rock breaks scissors! player A wins!");
            }
            else
            {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid number");
            }
        }
        else
        {
            // playerB code crossed agains thee playerA scissor move
            if(playerB.equalsIgnoreCase("R"))
            {
                System.out.println("Rock breaks Scissors! player B wins!");
            }
            else if (playerB.equalsIgnoreCase("P"))
            {
                System.out.println("Scissors cut Paper! player A wins!");
            }
            else if (playerB.equalsIgnoreCase("S"))
            {
                System.out.println("Rock breaks scissors! player A wins!");
            }
            else
            {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid number");
            }
        }
    }
}
