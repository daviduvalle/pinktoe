/**
 * Main class and CLI
 */
public final class Pinktoe {

    public static void main(String[] args) {
        System.out.println("Pinktoe is happy spider!");

        if (args.length > 0) {
            System.out.println("Starting discovery from: "+args[0]);
        }
    }
}
