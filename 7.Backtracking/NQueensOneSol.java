public class NQueensOneSol {
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
    public static boolean nQueens(char board[][],int row){
        //base case
        if(row == board.length){
            return true;
        }

        //kaam
        //Queen ko bithao -- columnwise   (Coz 1 ow mai ek he Queen baith sakti hai)
        for(int j=0;j<board.length;j++){
            //****condition inside FOR-LOOP */
            if(isSafe(board, row, j)){
                board[row][j]='Q';
                //recursive call
                if(nQueens(board, row+1)){                        //HERE CHANGE
                    return true;
                }
                board[row][j]='x';
            }
        }
        return false;
    }

    public static void printBoard(char board[][]){
        for(int i=0;i<board.length;i++){                     //take board as parameter
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=4;
        char board[][] = new char[n][n];
        System.out.println("Board length: "+n);

        //initialize
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            }
        }

        if(nQueens(board,0)){
            System.out.println("Yes, solution is possible");
            printBoard(board);
        }else{
            System.out.println("No, solution is not possible");
        }
    }

}

/*Output
Board length: 2
No, solution is not possible

Board length: 4
Yes, solution is possible
x Q x x
x x x Q
Q x x x
x x Q x

Board length: 5
Yes, solution is possible
Q x x x x
x x Q x x
x x x x Q
x Q x x x
x x x Q x
*/