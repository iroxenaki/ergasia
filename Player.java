package ergasiaA;

public class Player {
	int playerId;
	String name;
	Board board;
	int score;
	int x;
	int y;
	
	public Player() {
		
	}
	
	public Player(int playerId, String name, Board board, int score, int x, int y) {
		this.playerId = playerId;
		this.name = name;
		this.board = board;
		this.score = score;
		this.x = x;
		this.y = y;
	}
	
	public void setPayerId(int plplayerId) {
		playerId = plplayerId;
	}
	
	public int getPayerId() {
		return playerId;
	}
	
	public void setName(String plname) {
		name = plname;
	}
	
	public String getName() {
		return name;
	}
	
	public void setBoard(Board plboard) {
		board = plboard;
	}
	
	public Board getBoard() {
		return board;
	}
	
	public void setScore(int plscore) {
		score = plscore;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setX(int plx) {
		x = plx;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int ply) {
		y = ply;
	}
	
	public int getY() {
		return y;
	}
	
	
	int[] move(int id) {
		
		return;
	}
	
	
}
