import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String playerA = "";
        String playerB = "";
        String playAgain = "Y";
        boolean playing = true;
        boolean PlayAgainTest = true;
        boolean AMoveTesting = true;
        boolean BMoveTesting = true;

        do //the game
        {
            do // player A input loop
            {
                System.out.print("PlayerA pleas enter your move: ");
                playerA = in.nextLine();

                if (playerA.equalsIgnoreCase("R"))
                {
                    do // player B input loop MK1
                    {
                        AMoveTesting = false;
                        System.out.print("PlayerB pleas enter your move: ");
                        playerB = in.nextLine();

                        if (playerB.equalsIgnoreCase("R"))
                        {
                            BMoveTesting = false;
                            System.out.println("Rock vs Rock. it is a TIE!");
                        }
                        else if (playerB.equalsIgnoreCase("P"))
                        {
                            BMoveTesting = false;
                            System.out.println("Paper covers Rock. player B wins!");
                        }
                        else if (playerB.equalsIgnoreCase("S")) {
                            BMoveTesting = false;
                            System.out.println("Rock breaks scissors! player A wins!");
                        }
                        else
                        {
                            System.out.println(playerB + " is not a valid answer");
                        }
                    }
                    while (BMoveTesting == true);
                }
                else if (playerA.equalsIgnoreCase("P"))
                {
                    do //player B input loop MK 2
                    {

                        AMoveTesting = false;
                        System.out.print("PlayerB pleas enter your move: ");
                        playerB = in.nextLine();

                        if (playerB.equalsIgnoreCase("R"))
                        {
                            BMoveTesting = false;
                            System.out.println("Paper covers Rock! player A wins!");
                        }
                        else if (playerB.equalsIgnoreCase("P"))
                        {
                            BMoveTesting = false;
                            System.out.println("Paper vs Paper! it is a TIE!");
                        }
                        else if (playerB.equalsIgnoreCase("S"))
                        {
                            BMoveTesting = false;
                            System.out.println("Scissors cuts paper! player B wins!");
                        }
                        else
                        {
                            System.out.println(playerB + " is not a valid answer");
                        }
                    } while (BMoveTesting == true);
                }
                else if (playerA.equalsIgnoreCase("S"))
                {
                    do // player B input loop MK 3
                    {
                        AMoveTesting = false;
                        System.out.print("PlayerB pleas enter your move: ");
                        playerB = in.nextLine();

                        if (playerB.equalsIgnoreCase("R"))
                        {
                            BMoveTesting = false;
                            System.out.println("Rock breaks Scissors! player B wins!");
                        }
                        else if (playerB.equalsIgnoreCase("P"))
                        {
                            BMoveTesting = false;
                            System.out.println("Scissors cut Paper! player A wins!");
                        }
                        else if (playerB.equalsIgnoreCase("S"))
                        {
                            BMoveTesting = false;
                            System.out.println("Scissors vs Scissors! it is a TIE!");
                        }
                        else
                        {
                            System.out.println(playerB + " is not a valid answer");
                        }
                    } while (BMoveTesting == true);
                }
                else
                {
                    System.out.println(playerA + " is not a valid answer");
                }

            } while (AMoveTesting == true);

            do //do you want to play a game
            {
                System.out.print("Would you like to play again? [Y/N] ");
                playAgain = in.nextLine();
                if (playAgain.equalsIgnoreCase("Y"))
                {
                    //System.out.println("play again");
                    playing = true;
                    PlayAgainTest = false;
                    AMoveTesting = true;
                    BMoveTesting = true;
                }
                else if (playAgain.equalsIgnoreCase("N"))
                {
                    System.out.println("Thanks for playing");
                    playing = false;
                    PlayAgainTest = false;
                    System.exit(0);
                }
                else
                {
                    System.out.println(playAgain + " is not a valid answer");
                }
            } while (PlayAgainTest == true);
            PlayAgainTest = true;// this is set after the loop to set up for the replay
        } while (playing == true);
    }
}
