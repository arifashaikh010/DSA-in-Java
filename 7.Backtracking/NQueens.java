public class NQueens {
    public static boolean isSafe(char board[][], int row, int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //left-diagonal
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        //right-diagonal
        for(int i=row-1,j=col+1; i>=0 && j<board.length; i--, j++){  //why not <=
            if(board[i][j]=='Q'){
                return false;
            }
        }

        return true;
    }

    //Q2. static int count=0;
    public static void nQueens(char board[][],int row){
        //base case
        if(row == board.length){
            printBoard(board);
            //Q2.count++;
            return;
        }

        //kaam
        //Queen ko bithao -- columnwise   (Coz 1 ow mai ek he Queen baith sakti hai)
        for(int j=0;j<board.length;j++){
            //****condition inside FOR-LOOP */
            if(isSafe(board, row, j)){
                board[row][j]='Q';
                //recursive call
                nQueens(board, row+1);
                board[row][j]='x';
            }
        }
    }

    public static void printBoard(char board[][]){
        System.out.println("------------------------");
        for(int i=0;i<board.length;i++){                     //take board as parameter
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=5;
        char board[][] = new char[n][n];
        System.out.println("Board length: "+n);

        //initialize
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            }
        }

        nQueens(board,0);
        //Q2.System.out.println("Total :"+count);
    }

}
/*Output:
Board length: 4
------------------------
x Q x x
x x x Q
Q x x x
x x Q x
------------------------
x x Q x
Q x x x
x x x Q
x Q x x

Board length: 4
Total :2

***************************************************************************************************************
Board length: 5
------------------------
Q x x x x
x x Q x x
x x x x Q
x Q x x x
x x x Q x
------------------------
Q x x x x
x x x Q x
x Q x x x
x x x x Q
x x Q x x
------------------------
x Q x x x
x x x Q x
Q x x x x
x x Q x x
x x x x Q
------------------------
x Q x x x
x x x x Q
x x Q x x
Q x x x x
x x x Q x
------------------------
x x Q x x
Q x x x x
x x x Q x
x Q x x x
x x x x Q
------------------------
x x Q x x
x x x x Q
x Q x x x
x x x Q x
Q x x x x
------------------------
x x x Q x
Q x x x x
x x Q x x
x x x x Q
x Q x x x
------------------------
x x x Q x
x Q x x x
x x x x Q
x x Q x x
Q x x x x
------------------------
x x x x Q
x Q x x x
x x x Q x
Q x x x x
x x Q x x
------------------------
x x x x Q
x x Q x x
Q x x x x
x x x Q x
x Q x x x

Board length: 5
Total :10
*/