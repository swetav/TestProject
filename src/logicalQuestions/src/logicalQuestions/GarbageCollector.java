package logicalQuestions;

public class GarbageCollector {
	
		protected void finalize() {
			System.out.println("Object is garbage collected");
		}

	public static void main(String[] args) {
		
		/* Java manages memory using Heap Space and Stack Memory.
		 * Garbage Collector (GC) automatically removes unreferenced objects from memory.
		 * GC uses algorithms like Mark and Sweep, Reference Counting, and Generational GC.
		 */
		
		GarbageCollector obj = new GarbageCollector();
		obj=null; //eligibal for garbage collection
		
		System.gc();

	}

	


}


