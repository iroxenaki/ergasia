package ergasiaA;

import java.util.Random;

public class Board {
	int N;
	int S;
	int W;
	Tile[] tiles;
	Supply[] supplies;
	
	public Board() {
		
	}
	
	public Board(int N, int S, int W) {
		this.N = N;
		this.S = S;
		this.W = W;
	}
	
	public Board(Board board) {
		
	}
	
	public void setN(int boardN) {
		N = boardN;
	}
	
	public int getN() {
		return N;
	}
	
	public void setS(int boardS) {
		S = boardS;
	}
	
	public int getS() {
		return S;
	}
	
	public void setW(int boardW) {
		W = boardW;
	}
	
	public int getW() {
		return W;
	}
	
	void creatTile() {
		Random random = new Random();
		
		for(int x = 0; x < N; x++) {
			for(int y = 0; y < N; y++) {
				int tileId = x + 5*y;
				tiles[tileId] = new Tile(tileId, x, y, random.nextBoolean(), random.nextBoolean(), random.nextBoolean(), random.nextBoolean());
				
			}
		}
	}
	
	void creatSupply() {
		Random random = new Random();
		
		
	}
	
	void creatBoard() {
		
	}
	
	String[][] getStringRepresentation(int theuseusTile, int minotaurTile){
		
		return ;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
