package day17;

public class ChessBoard {
//    private static char[][] chessPiece;
//
//    public ChessBoard(char[][] chessPiece) {
//        this.chessPiece=chessPiece;
//    }
//    public static  void print(){
//        for(int i=0; i<chessPiece.length; i++){
//            for (int j=0; j<chessPiece[i].length; j++){
//                System.out.print(chessPiece[i][j]);
//            }
//            System.out.println();
//
//        }
//
//    }
    private ChessPiece [][] board;

    public ChessBoard(ChessPiece[][] board) {
        this.board = board;
    }

    public void print(){
        for (int i =0; i< board.length; i++){
            for (int j=0; j< board[i].length; j++){
                System.out.print(board[i][j].getName());
            }
            System.out.println();
        }
    }
}
