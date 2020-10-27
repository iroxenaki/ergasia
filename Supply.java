package ergasiaA;

public class Supply {
	int supplyId;
	int x;
	int y;
	int supplyTileId;
	
	
	public Supply() {
		
	}
	
	public Supply(int supplyId, int x, int y, int supplyTileId) {
		this.supplyId = supplyId;
		this.x = x;
		this.y = y;
		this.supplyTileId = supplyTileId;
	}
	
	public Supply(Supply supply) {
		
	}
	
	public void setSupplyId(int supId) {
		supplyId = supId; 
	}
	
	public int getSupplyId() {
		return supplyId;
	}
	
	public void setSupplyX(int supx) {
		x = supx; 
	}
	
	public int getSupplyX() {
		return x;
	}
	
	public void setSupplyY(int supy) {
		y = supy; 
	}
	
	public int getSupplyY() {
		return y;
	}
	
	public void setSupplyTileId(int supTlId) {
		supplyTileId = supTlId; 
	}
	
	public int getSupplyTileId() {
		return supplyTileId;
	}
}
