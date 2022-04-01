
public class Case {
	
	//number of rows n and number of columns m.
	private int n, m;
	
	//Array storing the information of the energy cost of moving in the rows.
	//The position of the integer representing the energy is the corresponding row.
	private int[] e;
	
	//Matrix that stores the information of the portals between the different rows.
	private int[][] p;
	
	public Case(int n, int m, int[] e, int[][] p) {
		this.n = n;
		this.m = m;
		this.e = e;
		this.p = p;
	}
	
	public int getRows() { return n;}
	
	public int getColumns() { return m;}
	
	public int[] getEnergyVector() { return e;}
	
	public int[][] getPortalMatrix() { return p;}

}
