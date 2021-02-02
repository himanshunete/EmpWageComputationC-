using System;

namespace LineComparisonComputation
{
    class Program
    {
        static void Main(string[] args)
        {
            //Coordinates
            double x1 = Console.Read();
            double y1 = Console.Read();
            double x2 = Console.Read();
            double y2 = Console.Read();
            double squareX = (x2 - x1) * (x2 - x1);
            double squareY = (y2 - y1) * (y2 - y1);
            Console.WriteLine( $" Length of a Line: { Math.Sqrt(squareX + squareY) }" );
        }
    }
}
