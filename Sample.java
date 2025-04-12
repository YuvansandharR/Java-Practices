class Ayyan {
    String name;
    static int i = 1;

    // Default constructor
    Ayyan() {
        // No need for super(), Java automatically calls Object's constructor if not explicitly done.
    }

    @Override
    protected void finalize() throws Throwable {
        // Print when the object is garbage collected
        
        System.out.println(i++ +" Object Removed");
        super.finalize();  // Call the superclass finalize method
    }
}

public class Sample {
    public static void main(String[] args) throws InterruptedException {
        // Create and discard 100 objects
        Ayyan ani = null;
        for (int i = 1; i <= 100; i++) {
            ani = new Ayyan();
        }
        Ayyan.i = 20;
        // Suggest the JVM to run garbage collection
        System.gc();

        // Wait for a while to ensure finalize is called
        Thread.sleep(2000);  // Sleep for 2 seconds to give garbage collector time to work
    }
}
