public class LinkedListOps extends DataStructureOps {
    private LinkedList<Integer> list = new LinkedList<>();

    @Override
    public void menu(Scanner sc) {
        while (true) {
            System.out.println("\n=== Linked List Operations ===");
            System.out.println("1. Insert at End");
            System.out.println("2. Delete from Beginning");
            System.out.println("3. Display");
            System.out.println("4. Back");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int val = sc.nextInt();
                    list.addLast(val);
                    System.out.println("Inserted " + val + " into linked list.");
                    break;
                case 2:
                    if (!list.isEmpty())
                        System.out.println("Deleted: " + list.removeFirst());
                    else
                        System.out.println("Linked List is empty.");
                    break;
                case 3:
                    if (list.isEmpty()) {
                        System.out.println("Linked List is empty.");
                    } else {
                        System.out.print("Linked List contents (head to tail): ");
                        for (int i : list)
                            System.out.print(i + " ");
                        System.out.println();
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
