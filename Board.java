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
		
		for(int i = N - 1; i < (N * N) ; i += N ) {				//put right walls
			tiles[i].setRight(true);
		}
		
		for(int i = 1 ; i < N ;  i++) {							//put down walls	
			tiles[i].setDown(true);
		}
		
		for(int i = 0; i < (N * N) ; i += N ) {					//put left walls
			tiles[i].setRight(true);
		}
		
		for(int i = (N * (N-1)) ; i < (N * N) ;  i++) {			//put up walls
			tiles[i].setDown(true);
		}
		
		int i = 0;
		while (i < W) {
			int randTileId = random.nextInt(N * N);
			int counter = 0;
			
			
			if(tiles[randTileId - 1].getRight() == true ) {      	 //puts wall on the left if left tile has on its right
				tiles[randTileId].setLeft(true);
				counter++;
				i++;
			}
			
			if(tiles[randTileId - N].getUp() == true ) {			//puts northen wall if tile above it has a wall on the southern side
				tiles[randTileId].setDown(true);
				counter++;
				i++;
			}
		
			if(tiles[randTileId + N].getDown() == true ) {			//puts southern wall if tile below it has a wall on the northen side
				tiles[randTileId].setUp(true);
				counter++;
				i++;
			}
			
			if(tiles[randTileId + 1].getLeft() == true ) {			//puts wall on the right if right tile has on its left
				tiles[randTileId].setRight(true);
				counter++;
				i++;
			}
			
			if (counter == 0) {
				int k = random.nextInt(8); 
				switch (k) {
					case 0: 
						if (tiles[randTileId + N].fullTile() == false) {
							tiles[randTileId].setUp(true);
							counter++;
							i++;
						}
						break;
					
					case 1: 
						if (tiles[randTileId - N].fullTile() == false) {
							tiles[randTileId].setDown(true);
							counter++;
							i++;
						}
						break;
					
					case 2: 
						if (tiles[randTileId - 1].fullTile() == false) {
							tiles[randTileId].setLeft(true);
							counter++;
							i++;
						}
						break;
					
					case 3: 
						if (tiles[randTileId + 1].fullTile() == false) {
							tiles[randTileId].setRight(true);
							counter++;
							i++;
						}
						break;
					
					case 4: tiles[randTileId].setUp(false);
							break;
					
					case 5: tiles[randTileId].setDown(false);
							break;
							
					case 6: tiles[randTileId].setLeft(false);
							break;
					
					case 7: tiles[randTileId].setRight(false);
							break;
					}
			}
			
			if (counter == 1) {
				int l = random.nextInt(8); 
				switch (l) {
					case 0: 
						if (tiles[randTileId + N].fullTile() == false && tiles[randTileId].getUp()== false) {
							tiles[randTileId].setUp(true);
							counter++;
							i++;
						}
						break;
							
					case 1: 
						if (tiles[randTileId - N].fullTile() == false && tiles[randTileId].getDown()== false) {
							tiles[randTileId].setDown(true);
							counter++;
							i++;
						}
						break;
						
					case 2: 
						if (tiles[randTileId - 1].fullTile() == false && tiles[randTileId].getLeft()== false) {
							tiles[randTileId].setLeft(true);
							counter++;
							i++;
						}
						break;
						
					case 3: 
						if (tiles[randTileId + 1].fullTile() == false && tiles[randTileId].getRight()== false) {
							tiles[randTileId].setRight(true);
							counter++;
							i++;				
						}
						break;
							
					case 4: case 5: case 6: case 7: break;
							
				}	
			}
		}
	
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
