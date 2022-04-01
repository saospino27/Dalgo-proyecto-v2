import java.util.ArrayList;
import java.util.List;

public class Node {
	
	private int vertex;
	
	private PathRegister pr;
		
	private List<Edge> adjVertices;
	
	public Node(int vertex) {
		this.vertex = vertex;
		this.adjVertices = new ArrayList<>();
	}
	
	public int getVertex() {
		return vertex;
	}
	
	public PathRegister getPR() {
		return pr;
	}
	
	public List<Edge> getAdjVertices(){
		return adjVertices;
	}
	
	public void addEdge(Edge edge) {
		adjVertices.add(edge);
	}
	
	public int getEdges() {
		return adjVertices.size();
	}
	
	public void setPR(PathRegister newPr) {
		this.pr = newPr;
	}
		
}
