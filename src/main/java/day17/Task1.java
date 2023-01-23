package day17;



public class Task1 {
    public static void main(String[] args) {
        ChessPiece [] chess = new ChessPiece[]{ChessPiece.PAWN_WHITE,ChessPiece.PAWN_WHITE,ChessPiece.PAWN_WHITE,
                ChessPiece.PAWN_WHITE, ChessPiece.ROOK_BLACK,ChessPiece.ROOK_BLACK,ChessPiece.ROOK_BLACK,ChessPiece.ROOK_BLACK};
        for (ChessPiece figure : chess){
            System.out.print(figure.getName()+ " ");
        }

    }
}