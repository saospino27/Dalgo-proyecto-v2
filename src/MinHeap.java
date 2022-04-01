// Java Program to Implement Heaps
// by Illustrating Min Heap
class MinHeap {

	// Member variables of this class
	private PathRegister[] Heap;
	private int size;
	private int maxsize;

	// Initializing front as static with unity
	private static final int FRONT = 1;

	// Constructor of this class
	public MinHeap(int maxsize){

		// This keyword refers to current object itself
		this.maxsize = maxsize;
		this.size = 0;

		Heap = new PathRegister[this.maxsize + 1];
		Heap[0] = new PathRegister(null, Integer.MIN_VALUE);
	}

	// Method 1
	// Returning the position of
	// the parent for the node currently
	// at pos
	private int parent(int pos) { return pos / 2; }

	// Method 2
	// Returning the position of the
	// left child for the node currently at pos
	private int leftChild(int pos) { return (2 * pos); }

	// Method 3
	// Returning the position of
	// the right child for the node currently
	// at pos
	private int rightChild(int pos) {
		return (2 * pos) + 1;
	}

	// Method 4
	// Returning true if the passed
	// node is a leaf node
	private boolean isLeaf(int pos) {

		if (pos > (size / 2) && pos <= size) {
			return true;
		}

		return false;
	}

	// Method 5
	// To swap two nodes of the heap
	private void swap(int fpos, int spos) {

		PathRegister tmp;
		tmp = Heap[fpos];
		
		Heap[spos].setPos(fpos);
		Heap[fpos] = Heap[spos];
		
		tmp.setPos(spos);
		Heap[spos] = tmp;
	}

	// Method 6
	// To heapify the node at pos
	private void minHeapify(int pos) {

		// If the node is a non-leaf node and greater
		// than any of its child
		if (!isLeaf(pos)) {
			if (Heap[pos].compare(Heap[leftChild(pos)]) == 1
				|| Heap[pos].compare(Heap[rightChild(pos)]) == 1) {

				// Swap with the left child and heapify
				// the left child
				if (Heap[leftChild(pos)].compare(Heap[rightChild(pos)]) == -1) {
					swap(pos, leftChild(pos));
					minHeapify(leftChild(pos));
				}

				// Swap with the right child and heapify
				// the right child
				else {
					swap(pos, rightChild(pos));
					minHeapify(rightChild(pos));
				}
			}
		}
	}

	// Method 7
	// To insert a node into the heap
	public void insert(PathRegister element)
	{

		if (size >= maxsize) {
			return;
		}

		Heap[++size] = element;
		element.setPos(size);
		int current = size;

		while (Heap[current].compare(Heap[parent(current)]) == -1) {
			swap(current, parent(current));
			current = parent(current);
		}
	}

	// Method 8
	// To print the contents of the heap
	public void print()
	{
		for (int i = 1; i <= size / 2; i++) {

			// Printing the parent and both childrens
			System.out.print(
				" PARENT : " + Heap[i].toString()
				+ " LEFT CHILD : " + Heap[2 * i].toString()
				+ " RIGHT CHILD :" + Heap[2 * i + 1].toString());

			// By here new line is required
			System.out.println();
		}
	}

	// Method 9
	// To remove and return the minimum
	// element from the heap
	public PathRegister remove(){

		PathRegister popped = Heap[FRONT];
		Heap[FRONT] = Heap[size--];
		minHeapify(FRONT);

		return popped;
	}
	
	// Method 10
	// Updates the value of the sum of the energy of a tree node
	// Therefore, the tree is also updated
	public void update(int pos, int newPathSum) {
		Heap[pos].setSumPath(newPathSum);
		int current = pos;

		while (Heap[current].compare(Heap[parent(current)]) == -1) {
			swap(current, parent(current));
			current = parent(current);
		}
		
	}
	public int getSize() { return size; }
	
	public PathRegister getMin() { return Heap[FRONT]; }
	
}

