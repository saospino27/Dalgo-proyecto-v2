//This implementation is limited to the needs of the program, hence its simplicity.
public class DGraph {
	
	//The value of the node corresponds to the position in the adjacency list
	//i.e., the adjacent nodes of node i are in position i of this adjacency list.
	private Node[] adjList;
		
	private int E;
	
	//This graph has a fixed number of vertices.
	public DGraph(int E, Node[] adjList) {
		this.E = E;
		this.adjList = adjList;
	}
	
	public int getNumVertices() {return adjList.length; }
	
	public int getNumEdges() {return E; }
	
	public Node getNode(int vertex) {
		return adjList[vertex];
	}
	
	public Node getLastNode() {
		return adjList[adjList.length - 1];
	}
	
}
