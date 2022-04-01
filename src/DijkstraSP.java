//This implementation is limited to the needs of the program, hence its simplicity.
public class DijkstraSP {
	
	//The graph over which the algorithm will find the minimum amount of energy to reach all the vertices.
	private DGraph graph;
	
	//The binary tree that helps to find the minimum unvisited vertex in a fast way.
	private MinHeap priorityQueue;
	
	//The target vertex
	private Node dest;
		
	public DijkstraSP(DGraph graph, MinHeap priorityQueue, Node dest) {
		this.graph = graph;
		this.dest = dest;
		this.priorityQueue = priorityQueue;
	}
		
	//Run the algorithm and return the minimum energy expenditure needed to reach the destination vertex from the origin vertex.
	//It is linked and limited to the project requirements.
	//Simply run method 1 and method 2 as long as the priority queue heap tree is not empty.
	public int run() {
		PathRegister destp = dest.getPR();
		while (priorityQueue.getSize() > 0) {
			Node currentVertex = findMinimumUnvisitedVertex();
			relaxVertex(currentVertex);
		}
		return destp.getSumPath();
	}
	
	//Method 1
	//Find the unvisited vertex with the minimum energy expenditure to reach it from the origin.
	private Node findMinimumUnvisitedVertex() {
		return priorityQueue.getMin().getNode();
	}
	
	//Methond 2
	//The part of the algorithm that relaxes the vertices adjacent to the vertex currently being visited.
	//Helps to update the information in the priority queue from local information of the visited vertex.
	private void relaxVertex(Node vertex) {
		// To be implemented
	}
	
}
