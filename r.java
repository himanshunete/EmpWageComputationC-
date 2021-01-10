import java.util.HashMap;
import java.util.Map;

public class  r{
   public static void main(String[] args){
      HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
      //Variables
      int numberOfPlayers = 2;

      //Constants
      int NoPlay=0;
      int Ladder=1;
      int Snake=2;
      int NUM_OF_PLAY = 1000;
      int WIN_POSITION = 100;
      int[] position = new int[NUM_OF_PLAY];

      System.out.println(  numberOfPlayers + " players ie player 1 and 2 both at the start position: 0 now "  ) ;

      //Computation
      for (int numOfPlay=0 ; numOfPlay < NUM_OF_PLAY ; numOfPlay++) {
         for ( numberOfPlayers=0; numberOfPlayers<=1; numberOfPlayers++ ){
            if ( numberOfPlayers == 0 ){
               position[0] = 0;
               map.put(numOfPlay,position[numOfPlay]);
               int diceNumber = (int)Math.floor(Math.random() * 10)%6 + 1;
               int option = (int)Math.floor(Math.random() * 10)%3 ;
               if ( position[numOfPlay] >  WIN_POSITION   ){
                  position[numOfPlay]=position[numOfPlay-1];
               }
               if ( option == NoPlay ) {
                  position[numOfPlay + 1] = position[numOfPlay] ;
                  System.out.println( " The Player 1 is at the same position: " + position[numOfPlay+1] ) ;
               }


               //If a Player gets a ladder then play again (bonus)
               else if ( option == Ladder ){
                  position[ numOfPlay+1 ] = position[numOfPlay] + diceNumber;
                  System.out.println( "Player 1 moves forward to position:" + position[numOfPlay+1] ) ;
                  if ( position[numOfPlay] >  WIN_POSITION   ){
                     position[numOfPlay]=position[numOfPlay-1];
                  }
                  if ( option == NoPlay ) {
                     position[numOfPlay + 1] = position[numOfPlay] ;
                     System.out.println( " The Player 1 is at the same position: " + position[numOfPlay+1] ) ;
                  }
                  else if ( option == Ladder ){
                     position[ numOfPlay+1 ] = position[numOfPlay] + diceNumber;
                     System.out.println( "Player 1 moves forward to position:" + position[numOfPlay+1] ) ;


                  }
                  else if ( option == Snake ) {
                     position[ numOfPlay+1 ] = position[numOfPlay] - diceNumber;
                        if ( position[numOfPlay+1] < 0 ){
                           position[numOfPlay+1] = 0;
                           System.out.println( " Game restarts " ) ;
                        }
                     System.out.println( "Player 1 moves back to position:" + position[numOfPlay+1] ) ;
                  }
                  if ( position[numOfPlay+1] == WIN_POSITION ){
                     System.out.println( " The Player 1 wins the Snake ladder game " ) ;
                     int m=map.size();
                     System.out.println( m + " times the dice is rolled to win the game " ) ;
                     for (Integer hashmap:map.values()){
                        System.out.println(" position of player 1 after die roll is " + hashmap);
                     }


                     System.exit(0);
                  }


               }
               else if ( option == Snake ) {
                  position[ numOfPlay+1 ] = position[numOfPlay] - diceNumber;
                     if ( position[numOfPlay+1] < 0 ){
                        position[numOfPlay+1] = 0;
                        System.out.println( " Game restarts " ) ;
                     } 
                  System.out.println( "Player 1 moves back to position:" + position[numOfPlay+1] ) ;
               }
               if ( position[numOfPlay+1] == WIN_POSITION ){
                  System.out.println( " The Player 1 wins the Snake ladder game " ) ;
                  int m=map.size();
                  System.out.println( m + " times the dice is rolled to win the game " ) ;            
                  for (Integer hashmap:map.values()){
                     System.out.println(" position of player 1 after die roll is " + hashmap);
                  }
         
           
                  System.exit(0);
               } 
            }
            else if ( numberOfPlayers == 1 ){
               position[0] = 0;
               map.put(numOfPlay,position[numOfPlay]);
               int diceNumber = (int)Math.floor(Math.random() * 10)%6 + 1;
               int option = (int)Math.floor(Math.random() * 10)%3 ;
               if ( position[numOfPlay] >  WIN_POSITION   ){
                  position[numOfPlay]=position[numOfPlay-1];
               }
               if ( option == NoPlay ) {
                  position[numOfPlay + 1] = position[numOfPlay] ;
                  System.out.println( " The Player 2 is at the same position: " + position[numOfPlay+1] ) ;
               }


               //If a Player  gets a ladder then play again (bonus)
               else if ( option == Ladder ){
                  position[ numOfPlay+1 ] = position[numOfPlay] + diceNumber;
                  System.out.println( "Player 2 moves forward to position:" + position[numOfPlay+1] ) ;
                  if ( position[numOfPlay] >  WIN_POSITION   ){
                     position[numOfPlay]=position[numOfPlay-1];
                  }
                  if ( option == NoPlay ) {
                     position[numOfPlay + 1] = position[numOfPlay] ;
                     System.out.println( " The Player 2 is at the same position: " + position[numOfPlay+1] ) ;
                  }
                  else if ( option == Ladder ){
                     position[ numOfPlay+1 ] = position[numOfPlay] + diceNumber;
                     System.out.println( "Player 2 moves forward to position:" + position[numOfPlay+1] ) ;


                  }
                  else if ( option == Snake ) {
                     position[ numOfPlay+1 ] = position[numOfPlay] - diceNumber;
                        if ( position[numOfPlay+1] < 0 ){
                           position[numOfPlay+1] = 0;
                           System.out.println( " Game restarts " ) ;
                        }
                     System.out.println( "Player 2 moves back to position:" + position[numOfPlay+1] ) ;
                  }
                  if ( position[numOfPlay+1] == WIN_POSITION ){
                     System.out.println( " The Player 2 wins the Snake ladder game " ) ;
                     int m=map.size();
                     System.out.println( m + " times the dice is rolled to win the game " ) ;
                     for (Integer hashmap:map.values()){
                        System.out.println(" position of player 2 after die roll is " + hashmap);
                     }


                     System.exit(0);
                  }

               }
               else if ( option == Snake ) {
                  position[ numOfPlay+1 ] = position[numOfPlay] - diceNumber;
                     if ( position[numOfPlay+1] < 0 ){
                        position[numOfPlay+1] = 0;
                        System.out.println( " Game restarts " ) ;
                     }
                  System.out.println( "Player 2 moves back to position:" + position[numOfPlay+1] ) ;
               }
               if ( position[numOfPlay+1] == WIN_POSITION ){
                  System.out.println( " The Player 2 wins the Snake ladder game " ) ;
                  int m=map.size();
                  System.out.println( m + " times the dice is rolled to win the game " ) ;
                  for (Integer hashmap:map.values()){
                     System.out.println(" position player 2 after die roll is " + hashmap);
                  }
       
                  System.exit(0);
               }
            
            }
         }
      }
      
   }
}

