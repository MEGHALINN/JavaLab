public class GarbageCollectionDemo {
    public static void main(String[] args) {
        printMemoryUsage("Before creating objects");

        // Create many objects to consume memory
        for (int i = 0; i < 100000; i++) {
            new MyClass();
        }

        printMemoryUsage("After creating objects");

        // Explicitly call garbage collection
        System.gc();

        printMemoryUsage("After garbage collection");
    }

    public static void printMemoryUsage(String message) {
        long totalMemory = Runtime.getRuntime().totalMemory();
        long freeMemory = Runtime.getRuntime().freeMemory();
        long usedMemory = totalMemory - freeMemory;

        System.out.println(message + ":");
        System.out.println("Total Memory: " + totalMemory);
        System.out.println("Free Memory: " + freeMemory);
        System.out.println("Used Memory: " + usedMemory);
        System.out.println();
    }
}

class MyClass {
    // This class does not have any attributes or methods
    // It is just used to consume memory
}
