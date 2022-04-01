//This implementation is limited to the needs of the program, hence its simplicity.
public class Edge {
	
	private int dest, weight;
	
	public Edge(int dest, int weight) {
		this.dest = dest;
		this.weight = weight;
	}
	
	public int getDest() {return dest;}
	
	public int getWeight() {return weight;}
}
