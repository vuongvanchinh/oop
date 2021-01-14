import java.util.ArrayList;

public class Game {
   
   public static void main(String[] args) {
      Piece ob = new Rook(1,1);
      Rook a = new Rook(2,2);
      ob = a;

   }

   private Board board;
   private static ArrayList<Move> moveHistory;

   /**
    * c.
    * @param board c.
    */
   public Game(Board board) {
      this.board = board;
      moveHistory = new ArrayList<>();
   }

   /**
    * c.
    */
   public void movePiece(Piece p, int x, int y) {
      if (p.canMove(board, x, y)) {
         int xt = p.getCoordinatesX();
         int yt = p.getCoordinatesY();
         Move m;
         Piece t = board.getAt(x, y); 
         if (t == null) {
            p.setCoordinatesX(x);
            p.setCoordinatesY(y);
            m = new Move(xt, x, yt, y, p);
         } else {
            board.removeAt(x, y);
            p.setCoordinatesX(x);
            p.setCoordinatesY(y);
            m = new Move(xt, x, yt, y, p, t);
         }
         moveHistory.add(m);
         board.addPiece(p);
      }
   }

   /**
    * c.
    */
   public Board getBoard() {
      return this.board;
   }

   /**
    * c.
    */
   public void setBoard(Board board) {
      this.board = board;
   }

   public ArrayList<Move> getMoveHistory() {
      return this.moveHistory;
   }
}
