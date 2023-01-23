package day17;

public class Task2 {
    public static void main(String[] args) {

//        char [][] chess= new char[][]{
//                {ChessPiece.ROOK_BLACK.getName(), ChessPiece.EMPTY.getName(),ChessPiece.EMPTY.getName(),ChessPiece.EMPTY.getName(),
//                        ChessPiece.EMPTY.getName(),ChessPiece.ROOK_BLACK.getName(), ChessPiece.KING_BLACK.getName(),ChessPiece.EMPTY.getName()},
//                {ChessPiece.EMPTY.getName(),ChessPiece.ROOK_WHITE.getName(),ChessPiece.EMPTY.getName(),ChessPiece.EMPTY.getName(),
//                        ChessPiece.PAWN_BLACK.getName(),ChessPiece.PAWN_BLACK.getName(),ChessPiece.EMPTY.getName(),ChessPiece.PAWN_BLACK.getName()},
//                {ChessPiece.PAWN_BLACK.getName(),ChessPiece.EMPTY.getName(), ChessPiece.KNIGHT_BLACK.getName(),ChessPiece.EMPTY.getName(),
//                        ChessPiece.EMPTY.getName(),ChessPiece.EMPTY.getName(),ChessPiece.PAWN_BLACK.getName(),ChessPiece.EMPTY.getName()},
//                {ChessPiece.QUEEN_BLACK.getName(),ChessPiece.EMPTY.getName(),ChessPiece.EMPTY.getName(),ChessPiece.BISHOP_WHITE.getName(),
//                        ChessPiece.EMPTY.getName(),ChessPiece.EMPTY.getName(),ChessPiece.EMPTY.getName(),ChessPiece.EMPTY.getName()},
//                {ChessPiece.EMPTY.getName(),ChessPiece.EMPTY.getName(),ChessPiece.EMPTY.getName(),ChessPiece.BISHOP_BLACK.getName(),
//                        ChessPiece.PAWN_WHITE.getName(),ChessPiece.EMPTY.getName(),ChessPiece.EMPTY.getName(),ChessPiece.EMPTY.getName()},
//                {ChessPiece.EMPTY.getName(),ChessPiece.EMPTY.getName(),ChessPiece.EMPTY.getName(),ChessPiece.EMPTY.getName(),
//                        ChessPiece.BISHOP_WHITE.getName(),ChessPiece.PAWN_WHITE.getName(),ChessPiece.EMPTY.getName(),ChessPiece.EMPTY.getName()},
//                {ChessPiece.PAWN_WHITE.getName(),ChessPiece.EMPTY.getName(),ChessPiece.EMPTY.getName(),ChessPiece.QUEEN_WHITE.getName(),
//                        ChessPiece.EMPTY.getName(),ChessPiece.PAWN_WHITE.getName(),ChessPiece.EMPTY.getName(),ChessPiece.PAWN_WHITE.getName()},
//                {ChessPiece.EMPTY.getName(),ChessPiece.EMPTY.getName(),ChessPiece.EMPTY.getName(),ChessPiece.EMPTY.getName(),
//                        ChessPiece.EMPTY.getName(),ChessPiece.ROOK_WHITE.getName(),ChessPiece.KING_WHITE.getName(),ChessPiece.EMPTY.getName()}};
//
//        ChessBoard chessBoard=new ChessBoard(chess);
//        ChessBoard.print();


        ChessBoard chessBoard=new ChessBoard(new ChessPiece[][]{
                {ChessPiece.ROOK_BLACK, ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,
                        ChessPiece.EMPTY,ChessPiece.ROOK_BLACK, ChessPiece.KING_BLACK,ChessPiece.EMPTY},
                {ChessPiece.EMPTY,ChessPiece.ROOK_WHITE,ChessPiece.EMPTY,ChessPiece.EMPTY,
                        ChessPiece.PAWN_BLACK,ChessPiece.PAWN_BLACK,ChessPiece.EMPTY,ChessPiece.PAWN_BLACK},
                {ChessPiece.PAWN_BLACK,ChessPiece.EMPTY, ChessPiece.KNIGHT_BLACK,ChessPiece.EMPTY,
                        ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.PAWN_BLACK,ChessPiece.EMPTY},
                {ChessPiece.QUEEN_BLACK,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.BISHOP_WHITE,
                        ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY},
                {ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.BISHOP_BLACK,
                        ChessPiece.PAWN_WHITE,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY},
                {ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,
                        ChessPiece.BISHOP_WHITE,ChessPiece.PAWN_WHITE,ChessPiece.EMPTY,ChessPiece.EMPTY},
                {ChessPiece.PAWN_WHITE,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.QUEEN_WHITE,
                        ChessPiece.EMPTY,ChessPiece.PAWN_WHITE,ChessPiece.EMPTY,ChessPiece.PAWN_WHITE},
                {ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,
                        ChessPiece.EMPTY,ChessPiece.ROOK_WHITE,ChessPiece.KING_WHITE,ChessPiece.EMPTY}
        });
        chessBoard.print();
    }
}
