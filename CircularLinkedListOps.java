public class CircularLinkedListOps extends DataStructureOps {
    private Node last = null;

    @Override
    public void menu(Scanner sc) {
        while (true) {
            System.out.println("\n=== Circular Linked List Operations ===");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Back");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int val = sc.nextInt();
                    insert(val);
                    System.out.println("Inserted " + val + " into circular linked list.");
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private void insert(int data) {
        Node newNode = new Node(data);
        if (last == null) {
            last = newNode;
            last.next = last;
        } else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
    }

    private void delete() {
        if (last == null) {
            System.out.println("Circular Linked List is empty.");
            return;
        }
        Node temp = last.next;
        if (last == last.next) {
            System.out.println("Deleted: " + temp.data);
            last = null;
        } else {
            System.out.println("Deleted: " + temp.data);
            last.next = temp.next;
        }
    }

    private void display() {
        if (last == null) {
        	System.out.println("Circular Linked List is empty.");
            return;
        }
        Node temp = last.next;
        System.out.print("Circular Linked List contents (start to end): ");
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != last.next);
        System.out.println();
    }
}
