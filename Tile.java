package ergasiaA;

public class Tile {
	int tileId;
	int x;
	int y;
	boolean up;
	boolean down;
	boolean left;
	boolean right;
	
	public Tile() {
		
	}
	
	public Tile(int tileId, int x, int y, boolean up, boolean down, boolean left, boolean right) {
		this.tileId = tileId;
		this.x = x;
		this.y = y;
		this.up = up;
		this.down = down;
		this.left = left;
		this.right = right;
	}
	
	public Tile( Tile tl) {
		
	}
	
	public void setTileId(int tlId) {
		tileId = tlId;
	}
	
	public int getTileId() {
		return tileId;
	}
	
	public void setTileX(int tlx) {
		x = tlx; 
	}
	
	public int getTileX() {
		return x;
	} 
	
	public void setTileY(int tly) {
		y =tly;
	}
	
	public int getTileY() {
		return y;
	}
	
	public void setUp(boolean tlUp) {
		up = tlUp;
	}
	
	public boolean getUp() {
		return up;
	}
	
	public void setDown(boolean tldown) {
		down = tldown;
	}
	
	public boolean getDown() {
		return down;
	}
	
	public void setLeft(boolean tlleft) {
		left = tlleft;
	}
	
	public boolean getLeft() {
		return left;
	}
	public void setRight(boolean tlright) {
		right = tlright;
	}
	
	public boolean getRight() {
		return right;
	}
	
	
}
