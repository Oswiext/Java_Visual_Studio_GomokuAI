
// IMPORTANT IMPORT
//TODO ALWAYS
import java.util.Scanner;

class Main {
    public static void main(final String[] args) 
    {
    int player = 1;
    final int luffarschack = 1;
    int menuanswer = 0;
    boolean e = true;
    int resultx = 0; int resulto = 0;
    String name1 = ""; String name2 = "";
    int namecheck = 1;
    final Board board = new Board();
    final Scanner menu = new Scanner(System.in);
    
              while (e) {
              
              
            board.intro();
            board.board();
              
              menuanswer = menu.nextInt();
              
              if(menuanswer == 1 && namecheck == 1){
              final Scanner check = new Scanner(System.in);
              System.out.println("Spelare X name: ");
                    name1 = check.nextLine();
                    System.out.println("Spelare O name: ");
                    name2 = check.nextLine();
                    ++namecheck;
              } 
              


                  if(menuanswer == 1 || menuanswer == 2){
              while (board.game == 1){
              final Scanner input = new Scanner(System.in);
              board.printboard();
              
        if(player == 1)
              {
                System.out.println(name1 + " turn (1-9):");
               final int point = input.nextInt();
               if(point < 1 || point > 9){
          System.out.println("Between 1-9, try again");
              }
              else if(board.board[point-1] == "-"){
                board.board[point-1] = "X";
                board.printboard();
                board.alertx();
                board.alerto();
                board.alertdraw();
                player = 2;
                if(board.game != 1){
                  break;
                }
              }
              else{
                System.out.println("Already taken, try again");
              }
              }
              
              if(player == 2)
              {
                if(menuanswer == 2){
                  final int point = (int)(Math.random() * 9);
               if(point < 1 || point > 9){
          System.out.println("Computer error");
              }
              else if(board.board[point-1] == "-"){
                board.board[point-1] = "O";
                board.alertx();
                board.alerto();
                board.alertdraw();
                player = 1;
              }
              else{
                System.out.println("Computer tries to cheat");
              }
                }
                if(menuanswer == 1){
                System.out.println(name2 + " turn (1-9):");
               final int point = input.nextInt();
               if(point < 1 || point > 9){
          System.out.println("Between 1-9, try again");
              }
              else if(board.board[point-1] == "-"){
                board.board[point-1] = "O";
                board.alertx();
                board.alerto();
                board.alertdraw();
                player = 1;
              }
              else{
                System.out.println("Already taken, try again");
              }
              }
              }
              }
                  while (board.game != 1){
                
                if(board.game == 5){
                System.out.println(name1 + " X winner");
                ++resultx;
                board.game = 1;
                player = 1;
                break;
                }
                else if(board.game == 6){
                System.out.println(name2 + " O winner");
                ++resulto;
                board.game = 1;
                player = 1;
                break;
                }
                else if(board.game == 7){
                System.out.println("Draw");
                board.game = 1;
                player = 1;
                break;
                }
                  }
                  }
                  
                  
                  
                  
                  
                  
                  if(menuanswer == 3){
                    System.out.println("x score = " + resultx);
                    System.out.println("o score = " + resulto);
                  }
                  
                            if(menuanswer == 4){
                      e = false;
                      System.exit(0);
                            }
                            
              
    }
  }
  }