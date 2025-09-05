public class StackOps extends DataStructureOps {
    private Stack<Integer> stack = new Stack<>();

    @Override
    public void menu(Scanner sc) {
        while (true) {
            System.out.println("\n=== Stack Operations ===");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Back");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int val = sc.nextInt();
                    stack.push(val);
                    System.out.println("Pushed " + val + " into stack.");
                    break;
                case 2:
                    if (!stack.isEmpty())
                        System.out.println("Popped: " + stack.pop());
                    else
                        System.out.println("Stack is empty.");
                    break;
                case 3:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.print("Stack contents (top to bottom): ");
                        ListIterator<Integer> it = stack.listIterator(stack.size());
                        while (it.hasPrevious())
                            System.out.print(it.previous() + " ");
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
