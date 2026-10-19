public class zeropara {
    String name;

    // Zero-parameter constructor (same name as class, no return type)
    zeropara() {
        this.name = "Java";
        System.out.println("Zero-parameter constructor called!");
    }

    public static void main(String[] args) {
        // Creating an object automatically calls the zero-parameter constructor
        zeropara z = new zeropara();
        System.out.println("Course name: " + z.name);
    }
}