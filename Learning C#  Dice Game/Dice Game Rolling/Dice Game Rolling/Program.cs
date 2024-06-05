using System;

namespace Dice_Game
{
    class Program
    {
        static void Main(string[] args)
        {
            int playerRandomNum;
            int enemyRandomNum;
            Random random = new Random();

            int playerPoints = 0;
            int enemyPoints = 0;

            for (int i = 0; i < 10; i++)
            {

                Console.WriteLine("Press any key  to roll the dice");

                Console.ReadKey();

                playerRandomNum = random.Next(1, 7);
                Console.WriteLine("You rolled a " + playerRandomNum);

                enemyRandomNum = random.Next(1, 7);
                Console.WriteLine("Enemy AI Rolled a " + enemyRandomNum);

                Console.WriteLine("...");
                System.Threading.Thread.Sleep(1000);

                if (playerRandomNum > enemyRandomNum)
                {
                    playerPoints++;
                    Console.WriteLine("Player wins this round!");
                }
                else if (enemyRandomNum > playerRandomNum)
                {
                    enemyPoints++;
                    Console.WriteLine("Enemy wins this round");
                }
                else
                {
                    Console.WriteLine("Draw!");
                }

                Console.WriteLine("The Score is now = Player :" + playerPoints + ". Enemy : " + enemyPoints + " .");
                Console.WriteLine();
            }
            if (playerPoints > enemyPoints)
            {
                Console.WriteLine("You win!");
            }
            else if (enemyPoints > playerPoints)
            {
                Console.WriteLine("You lost !");

            }
            else
            {
                Console.WriteLine("It's a draw");
            }
            Console.ReadKey();

        }
    }



}
