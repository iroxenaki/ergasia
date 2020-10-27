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
	
	}
	
	void creatSupply() {
		Random random = new Random();
		
		for(int i = 0; i < S ; i++) {
			
			int x = random.nextInt(N);
			int y = random.nextInt(N);
			int supplyTileId = x + y * N;
			
			supplies[i] = Supply(random.nextInt(S), x, y, supplyTileId);
			
		
			for(int j = i; j >= 0; j--) {
				if (supplies[i].getSupplyTileId() == supplies[j].getSupplyTileId()) {
					while(supplies[i].getSupplyTileId() == supplies[j].getSupplyTileId()) {
					 
						x = random.nextInt(N);
						y = random.nextInt(N);
						supplyTileId = x + y * N;
					
						supplies[i] = Supply(random.nextInt(S), x, y, supplyTileId);
					}
				}
			}
		}
	}
	
	void creatBoard() {
		
	}
	
	String[][] getStringRepresentation(int theuseusTile, int minotaurTile){
		
		return ;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
