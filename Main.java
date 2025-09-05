public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataStructureOps ops = null;
        int choice;

        while (true) {
            System.out.println("\nChoose Data Structure:");
            System.out.println("1. Stack");
            System.out.println("2. Queue");
            System.out.println("3. Linked List");
            System.out.println("4. Circular Linked List");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    ops = new StackOps();
                    break;
                case 2:
                    ops = new QueueOps();
                    break;
                case 3:
                    ops = new LinkedListOps();
                    break;
                case 4:
                    ops = new CircularLinkedListOps();
                    break;
                case 5:
                    System.out.println("Program exited.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
                    continue; // skip calling menu
            }
            ops.menu(sc);
        }
    }
}
