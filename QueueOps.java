public class QueueOps extends DataStructureOps {
    private Queue<Integer> queue = new LinkedList<>();

    @Override
    public void menu(Scanner sc) {
        while (true) {
            System.out.println("\n=== Queue Operations ===");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Back");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int val = sc.nextInt();
                    queue.add(val);
                    System.out.println("Enqueued " + val + " into queue.");
                    break;
                case 2:
                    if (!queue.isEmpty())
                        System.out.println("Dequeued: " + queue.poll());
                    else
                        System.out.println("Queue is empty.");
                    break;
                case 3:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.print("Queue contents (front to rear): ");
                        for (int q : queue)
                            System.out.print(q + " ");
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
