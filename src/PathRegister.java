
public class PathRegister {
	
	Node node;
	int sumPath;
	int pos;
	
	public PathRegister(Node node, int sumPath) {
		this.node = node;
		this.sumPath = sumPath;
		this.pos = -1;
	}
	
	public int getSumPath() { return sumPath; }
	
	public void setSumPath(int newSum) { this.sumPath = newSum; }
	
	public Node getNode() { return node; }
	
	public int getPos() { return pos; }
	
	public void setPos(int newPos) { this.pos = newPos; }
	
	public int compare(PathRegister pr) {
		if (sumPath > pr.getSumPath()) {
			return 1;
		}
		else if (sumPath == pr.getSumPath()) {
			return 0;
		}
		else {
			return -1;
		}
	}
	
	public String toString() {
		String str = String.format("(v->%d, sp->%d, pos->%d)", node.getVertex(), sumPath, pos);
		return str;
	}

}
