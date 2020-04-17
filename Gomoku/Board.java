
class Board {
  
    //public static String[] board = new String[]{"-","-","-","-","-","-","-","-","-"};
    public static String[] board = new String[9];
        
    public static void board(){
      for ( int i = 0; i < 9; i++ ){
        board[i] = "-";
      }
    }
    int game = 1;
    
        public void intro() 
        {
              System.out.println("+-------~~~˜=˜~~~--------+");
              System.out.println("|      Luffarschack      |");
              System.out.println("+-------~~~˜=˜~~~--------+");
              System.out.println("1. 1v1 \n2. Solo \n3. Score \n4 Exit");
        }
        
        public void printboard() 
        {
          System.out.println("   ");
          System.out.println(board[0] + board[1] + board[2]);
          System.out.println(board[3] + board[4] + board[5]);
          System.out.println(board[6] + board[7] + board[8]);
          System.out.println("   ");
        }
        
        public int alertx() 
        {
          for ( int i = 0; i < 9; i++ ){
                        if(board[0]=="X"&&board[1]=="X"&&board[2]=="X"||board[3]=="X"&&board[4]=="X"&&board[5]=="X"||board[6]=="X"&&board[7]=="X"&&board[8]=="X"){
                          game = 5;
            }
                        if(board[0]=="X"&&board[3]=="X"&&board[6]=="X"||board[1]=="X"&&board[4]=="X"&&board[7]=="X"||board[2]=="X"&&board[5]=="X"&&board[8]=="X"){
                          game = 5;
            }
                        if(board[0]=="X"&&board[4]=="X"&&board[8]=="X"||board[2]=="X"&&board[4]=="X"&&board[6]=="X"){
                          game = 5;
                        }
          }
          return game;
        }
        public int alerto() 
        {
          for ( int i = 0; i < 9; i++ ){
                        if(board[0]=="O"&&board[1]=="O"&&board[2]=="O"||board[3]=="O"&&board[4]=="O"&&board[5]=="O"||board[6]=="O"&&board[7]=="O"&&board[8]=="O"){
                          game = 6;
            }
                        if(board[0]=="O"&&board[3]=="O"&&board[6]=="O"||board[1]=="O"&&board[4]=="O"&&board[7]=="O"||board[2]=="O"&&board[5]=="O"&&board[8]=="O"){
                          game = 6;
            }
                        if(board[0]=="O"&&board[4]=="O"&&board[8]=="O"||board[2]=="O"&&board[4]=="O"&&board[6]=="O"){
                          game = 6;
                        }
          }
          return game;
        }
          
        public int alertdraw() 
        {
          for ( int i = 0; i < 9; i++ ){
                        if(board[0]!="-"&&board[1]!="-"&&board[2]!="-"&&board[3]!="-"&&board[4]!="-"&&board[5]!="-"&&board[6]!="-"&&board[7]!="-"&&board[8]!="-"){
                          game = 7;
                        }
          }
          return game;
        }
        
        
        
        
        
        
        
        
        
        
        
        /*
            switch(board[9]) {
                  case X:
                      System.out.print('X');
                      break;
                  case O:
                      System.out.print('O');
                      break;
                  default:
                      System.out.print(' ');
                      break;
              }
        */
        
        // or this.x, this.o, this.e in class enum constant?
        /*
        enum place {
          X,
          O,
          E,
        }
        
        enum result {
          xwin,
          owin,
          draw,
        }
        */
    }