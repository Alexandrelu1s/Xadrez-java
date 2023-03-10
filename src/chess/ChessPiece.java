package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece{
	
	private Color color;
	private int moveCout;
	
	
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}
	
	
	public Color getColor() {
		return color;
	}
	
	public int getMoveCount() {
		return moveCout;
	}
	
	
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}
	
	
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() != color;
	}
	
	
	protected void increaseMoveCount() {
		moveCout++;
	}
	
	protected void decreaseMoveCount() {
		moveCout--;
	}
}
