public class ProblemaP1 {
	
	public static void main(String[] args) {
		
		//Implementar la apliación principal

        // Display message
        System.out.println("The Min Heap is ");
 
        // Creating object opf class in main() methodn
        MinHeap minHeap = new MinHeap(15);
 
        // Inserting element to minHeap
        // using insert() method
 
        // Custom input entries
        PathRegister pr = new PathRegister(new Node(2), 1);
        minHeap.insert(new PathRegister(new Node(1), 5));
        minHeap.insert(pr);
        minHeap.insert(new PathRegister(new Node(3), 17));
        minHeap.insert(new PathRegister(new Node(4), 10));
        minHeap.insert(new PathRegister(new Node(5), 84));
        minHeap.insert(new PathRegister(new Node(6), 19));
        minHeap.insert(new PathRegister(new Node(7), 6));
        minHeap.insert(new PathRegister(new Node(8), 22));
        minHeap.insert(new PathRegister(new Node(9), 9));
 
        // Print all elements of the heap
        minHeap.print();
 
        // Removing minimum value from above heap
        // and printing it
        System.out.println("The Min val is "
                           + minHeap.getMin());
        minHeap.update(9, 0);
        minHeap.print();
        System.out.println("The Min val is "
                + minHeap.getMin());
	}
}
