using System;

namespace SnakeLadderGame
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Welcome to Snake and Ladder Game");
            int numberOfPlayers = 1;
            int position = 0;
            Console.WriteLine(" Only " + numberOfPlayers + " player is playing the game, starting from position " + position + " now ");
            Random rand = new Random();
            int diceNumber = rand.Next(1, 7);
            Console.WriteLine(" Player rolls the dice and the dice number he gets is: " + diceNumber);
        }
    }
}
