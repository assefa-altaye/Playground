import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

 //This class contains Stack and Queue static methods and test cases 
public class RealEstatePropertyStackQueueDriver {
    //Part 1 - Stack 
    //This method returns integer representation of stack bedRooms
    public static int stackToInt(Stack<RealEstateProperty> s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        Stack<RealEstateProperty> temp = new Stack<>();
        StringBuilder sb = new StringBuilder();
        while (!s.isEmpty()) {
            RealEstateProperty item = s.pop();
            temp.push(item);
            sb.append(item.getBedRooms());
        }

        while (!temp.isEmpty()) {
            s.push(temp.pop());
        }

        return Integer.parseInt(sb.toString());
    }

    
     //Pops count items from the stack and returns the sum of their bedRooms.
     
    public static int popSome(Stack<RealEstateProperty> s, int count) {
        if (count <= 0) {
            return 0;
        }
        if (s == null || s.size() < count) {
            if (s != null) {
                while (!s.isEmpty()) {
                    s.pop();
                }
            }
            return -1;
        }

        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += s.pop().getBedRooms();
        }
        return sum;
    }

    /*
     Removes all occurrences of the input item from the stack and returns the number of extracted items.
     */
    public static int extractFromStack(Stack<RealEstateProperty> s, RealEstateProperty i) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        Stack<RealEstateProperty> temp1 = new Stack<>();
        Stack<RealEstateProperty> temp2 = new Stack<>();
        int count = 0;

        while (!s.isEmpty()) {
            temp1.push(s.pop());
        }

        while (!temp1.isEmpty()) {
            RealEstateProperty current = temp1.pop();
            if (current.equals(i)) {
                count++;
            } else {
                temp2.push(current);
            }
        }

        while (!temp2.isEmpty()) {
            s.push(temp2.pop());
        }

        return count;
    }

     //Returns true or false based on whether the two input stacks are equal.
    public static boolean equalStacks(Stack<RealEstateProperty> s1, Stack<RealEstateProperty> s2) {
        if (s1 == null && s2 == null) {
            return true;
        }
        if (s1 == null || s2 == null) {
            return false;
        }
        if (s1.isEmpty() && s2.isEmpty()) {
            return true;
        }
        if (s1.isEmpty() || s2.isEmpty()) {
            return false;
        }
        if (s1.size() != s2.size()) {
            return false;
        }

        Stack<RealEstateProperty> temp1 = new Stack<>();
        Stack<RealEstateProperty> temp2 = new Stack<>();
        boolean areEqual = true;

        while (!s1.isEmpty() && !s2.isEmpty()) {
            RealEstateProperty p1 = s1.pop();
            RealEstateProperty p2 = s2.pop();
            temp1.push(p1);
            temp2.push(p2);

            if (p1 == null || p2 == null || !p1.equals(p2)) {
                areEqual = false;
                break;
            }
        }

        while (!temp1.isEmpty()) {
            s1.push(temp1.pop());
        }
        while (!temp2.isEmpty()) {
            s2.push(temp2.pop());
        }

        return areEqual;
    }
    /*
    Part 2 - Queue 
    Updates the input queue by replacing each occurrence of oldVal with newVal.
    */
    public static int replace(Queue<RealEstateProperty> q, RealEstateProperty oldVal, RealEstateProperty newVal) {
        if (q == null || q.isEmpty()) {
            return 0;
        }

        int count = 0;
        int size = q.size();
        for (int i = 0; i < size; i++) {
            RealEstateProperty item = q.poll();
            if (item != null && item.equals(oldVal)) {
                q.offer(newVal);
                count++;
            } else {
                q.offer(item);
            }
        }
        return count;
    }

    /*
     Swaps the contents of stack s and queue q such that the top of stack 
     becomes the front of queue, and the front of queue becomes the bottom of stack.
     */
    public static void swap(Stack<RealEstateProperty> s, Queue<RealEstateProperty> q) {
        if (s == null || q == null) {
            return;
        }

        Queue<RealEstateProperty> tempQ = new LinkedList<>();
        Stack<RealEstateProperty> tempS = new Stack<>();

        while (!s.isEmpty()) {
            tempQ.offer(s.pop());
        }

        while (!q.isEmpty()) {
            tempS.push(q.poll());
        }

        while (!tempQ.isEmpty()) {
            q.offer(tempQ.poll());
        }

        while (!tempS.isEmpty()) {
            s.push(tempS.pop());
        }
    }

    
     //Takes a queue of RealEstateProperty and splits it into an array of two queues
    public static Queue<RealEstateProperty>[] split(Queue<RealEstateProperty> q) {
        Queue<RealEstateProperty> residentialQueue = new LinkedList<>();
        Queue<RealEstateProperty> commercialQueue = new LinkedList<>();
        Queue<RealEstateProperty> remainingQueue = new LinkedList<>();

        if (q != null) {
            while (!q.isEmpty()) {
                RealEstateProperty item = q.poll();
                if (item instanceof ResidentialProperty) {
                    residentialQueue.offer(item);
                } else if (item instanceof CommercialProperty) {
                    commercialQueue.offer(item);
                } else {
                    remainingQueue.offer(item);
                }
            }

            while (!remainingQueue.isEmpty()) {
                q.offer(remainingQueue.poll());
            }
        }

        @SuppressWarnings("unchecked")
        Queue<RealEstateProperty>[] result = new Queue[2];
        result[0] = residentialQueue;
        result[1] = commercialQueue;
        return result;
    }

    /**
     * Main method to test all required Stack and Queue methods with required test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== TEST START ===\n");
        // ========Part 1 Test
        // Test stackToInt
        System.out.println("\n==> stackToInt, test 1: Stack with at least four items ");
        Stack<RealEstateProperty> s1 = new Stack<>();
        s1.push(new RealEstateProperty("Apartment", 4));
        s1.push(new RealEstateProperty("Townhouse", 3));
        s1.push(new RealEstateProperty("House", 2));
        s1.push(new RealEstateProperty("Single_Family", 5));
        System.out.println("Result integer: " + stackToInt(s1));

        System.out.println("\n==> stackToInt, test 2: Stack with one item ");
        Stack<RealEstateProperty> s2 = new Stack<>();
        s2.push(new RealEstateProperty("Studio", 1));
        System.out.println("Result integer: " + stackToInt(s2));

        System.out.println("\n==> stackToInt, test 3: Stack with multiple items, including bedRooms = 0 ");
        Stack<RealEstateProperty> s3 = new Stack<>();
        s3.push(new RealEstateProperty("Apartment", 0));
        s3.push(new RealEstateProperty("Single_Family", 3));
        System.out.println("Result integer: " + stackToInt(s3));


        // Test popSome
        System.out.println("\n==> popSome, test 1: Stack has count items ");
        Stack<RealEstateProperty> popStack1 = new Stack<>();
        popStack1.push(new RealEstateProperty("A", 2));
        popStack1.push(new RealEstateProperty("B", 4));
        System.out.println("Sum: " + popSome(popStack1, 2));

        System.out.println("\n==> popSome, test 2: Stack has multiple items and count < number of items ");
        Stack<RealEstateProperty> popStack2 = new Stack<>();
        popStack2.push(new RealEstateProperty("A", 1));
        popStack2.push(new RealEstateProperty("B", 2));
        popStack2.push(new RealEstateProperty("C", 3));
        System.out.println("Sum: " + popSome(popStack2, 1));

        System.out.println("\n==> popSome, test 3: Stack has multiple items and count > number of items ");
        Stack<RealEstateProperty> popStack3 = new Stack<>();
        popStack3.push(new RealEstateProperty("A", 5));
        System.out.println("Result (expect -1): " + popSome(popStack3, 3));

        System.out.println("\n==> popSome, test 4: Empty stack and count > 1 ");
        Stack<RealEstateProperty> popStack4 = new Stack<>();
        System.out.println("Result (expect -1): " + popSome(popStack4, 2));

        System.out.println("\n==> popSome, test 5: Non-empty stack and count = 0 ");
        Stack<RealEstateProperty> popStack5 = new Stack<>();
        popStack5.push(new RealEstateProperty("A", 4));
        System.out.println("Result (expect 0): " + popSome(popStack5, 0));

        System.out.println("\n==> popSome, test 6: Non-empty stack and negative count ");
        Stack<RealEstateProperty> popStack6 = new Stack<>();
        popStack6.push(new RealEstateProperty("A", 4));
        System.out.println("Result (expect 0): " + popSome(popStack6, -1));


        // Test extractFromStack
        System.out.println("\n==> extractFromStack, test 1: Non-empty stack with one item matching ");
        Stack<RealEstateProperty> extStack1 = new Stack<>();
        RealEstateProperty target1 = new RealEstateProperty("House", 3);
        extStack1.push(new RealEstateProperty("Apartment", 2));
        extStack1.push(target1);
        System.out.println("Extracted count (expect 1): " + extractFromStack(extStack1, target1));

        System.out.println("\n==> extractFromStack, test 2: Non-empty stack with several items matching ");
        Stack<RealEstateProperty> extStack2 = new Stack<>();
        RealEstateProperty target2 = new RealEstateProperty("Apt", 1);
        extStack2.push(target2);
        extStack2.push(new RealEstateProperty("House", 4));
        extStack2.push(target2);
        System.out.println("Extracted count (expect 2): " + extractFromStack(extStack2, target2));

        System.out.println("\n==>extractFromStack, test 3: Non-empty stack with no items matching ");
        Stack<RealEstateProperty> extStack3 = new Stack<>();
        extStack3.push(new RealEstateProperty("Apartment", 2));
        System.out.println("Extracted count (expect 0): " + extractFromStack(extStack3, new RealEstateProperty("Single_Family", 5)));

        System.out.println("\n==> extractFromStack, test 4: Empty stack ");
        Stack<RealEstateProperty> extStack4 = new Stack<>();
        System.out.println("Extracted count (expect 0): " + extractFromStack(extStack4, new RealEstateProperty("House", 3)));


        // Test equalStacks
        System.out.println("\n==> equalStacks, test 1: Non-empty stacks and equal ");
        Stack<RealEstateProperty> eq1A = new Stack<>();
        Stack<RealEstateProperty> eq1B = new Stack<>();
        eq1A.push(new RealEstateProperty("House", 3));
        eq1B.push(new RealEstateProperty("House", 3));
        System.out.println("Equal (expect true): " + equalStacks(eq1A, eq1B));

        System.out.println("\n==> equalStacks, test 2: Non-empty stacks and not equal ");
        Stack<RealEstateProperty> eq2A = new Stack<>();
        Stack<RealEstateProperty> eq2B = new Stack<>();
        eq2A.push(new RealEstateProperty("House", 3));
        eq2B.push(new RealEstateProperty("Apartment", 2));
        System.out.println("Equal (expect false): " + equalStacks(eq2A, eq2B));

        System.out.println("\n==> equalStacks, test 3: One stack empty (returns false) ");
        Stack<RealEstateProperty> eq3A = new Stack<>();
        Stack<RealEstateProperty> eq3B = new Stack<>();
        eq3B.push(new RealEstateProperty("House", 3));
        System.out.println("Equal (expect false): " + equalStacks(eq3A, eq3B));

        System.out.println("\n==> equalStacks, test 4: Both stacks empty (returns true) ");
        Stack<RealEstateProperty> eq4A = new Stack<>();
        Stack<RealEstateProperty> eq4B = new Stack<>();
        System.out.println("Equal (expect true): " + equalStacks(eq4A, eq4B));


        // ========Part 2 Test

        // Test replace
        System.out.println("\n==> replace, test 1: Queue has multiple entries, including one oldVal ");
        Queue<RealEstateProperty> q1 = new LinkedList<>();
        RealEstateProperty oldV1 = new RealEstateProperty("Apartment", 1);
        q1.offer(oldV1);
        q1.offer(new RealEstateProperty("House", 3));
        System.out.println("Replaced count (expect 1): " + replace(q1, oldV1, new RealEstateProperty("Penthouse", 5)));

        System.out.println("\n==> replace, test 2: Queue has multiple entries, including multiple oldVal ");
        Queue<RealEstateProperty> q2 = new LinkedList<>();
        RealEstateProperty oldV2 = new RealEstateProperty("Apartment", 1);
        q2.offer(oldV2);
        q2.offer(new RealEstateProperty("House", 2));
        q2.offer(oldV2);
        System.out.println("Replaced count (expect 2): " + replace(q2, oldV2, new RealEstateProperty("Single_Family", 4)));

        System.out.println("\n==> replace, test 3: oldVal is first in the queue ");
        Queue<RealEstateProperty> q3 = new LinkedList<>();
        RealEstateProperty oldV3 = new RealEstateProperty("Studio", 1);
        q3.offer(oldV3);
        q3.offer(new RealEstateProperty("House", 3));
        System.out.println("Replaced count (expect 1): " + replace(q3, oldV3, new RealEstateProperty("Apartment", 2)));

        System.out.println("\n==> replace, test 4: oldVal is last in the queue ");
        Queue<RealEstateProperty> q4 = new LinkedList<>();
        RealEstateProperty oldV4 = new RealEstateProperty("Studio", 1);
        q4.offer(new RealEstateProperty("House", 3));
        q4.offer(oldV4);
        System.out.println("Replaced count (expect 1): " + replace(q4, oldV4, new RealEstateProperty("Apartment", 2)));

        System.out.println("\n==> replace, test 5: Queue has multiple entries, not including oldVal ");
        Queue<RealEstateProperty> q5 = new LinkedList<>();
        q5.offer(new RealEstateProperty("House", 3));
        System.out.println("Replaced count (expect 0): " + replace(q5, new RealEstateProperty("Single_Family", 5), new RealEstateProperty("Apartment", 1)));

        System.out.println("\n==> replace, test 6: Queue is empty ");
        Queue<RealEstateProperty> q6 = new LinkedList<>();
        System.out.println("Replaced count (expect 0): " + replace(q6, new RealEstateProperty("House", 3), new RealEstateProperty("Apartment", 2)));


        // Test swap
        System.out.println("\n==> swap, test 1: Non-empty stack and queue, both same length ");
        Stack<RealEstateProperty> swapS1 = new Stack<>();
        swapS1.push(new RealEstateProperty("House", 1));
        Queue<RealEstateProperty> swapQ1 = new LinkedList<>();
        swapQ1.offer(new RealEstateProperty("Single_Family", 3));
        swap(swapS1, swapQ1);
        System.out.println("Swap test 1 executed.");

        System.out.println("\n==> swap, test 2: Non-empty stack and queue not same length ");
        Stack<RealEstateProperty> swapS2 = new Stack<>();
        swapS2.push(new RealEstateProperty("House", 1));
        Queue<RealEstateProperty> swapQ2 = new LinkedList<>();
        swapQ2.offer(new RealEstateProperty("Single_Family", 3));
        swapQ2.offer(new RealEstateProperty("Apartment", 4));
        swap(swapS2, swapQ2);
        System.out.println("Swap test 2 executed.");

        System.out.println("\n==> swap, test 3: Empty stack and non-empty queue ");
        Stack<RealEstateProperty> swapS3 = new Stack<>();
        Queue<RealEstateProperty> swapQ3 = new LinkedList<>();
        swapQ3.offer(new RealEstateProperty("Single_Family", 3));
        swap(swapS3, swapQ3);
        System.out.println("Swap test 3 executed.");

        System.out.println("\n==> swap, test 4: Empty queue and non-empty stack ");
        Stack<RealEstateProperty> swapS4 = new Stack<>();
        swapS4.push(new RealEstateProperty("House", 1));
        Queue<RealEstateProperty> swapQ4 = new LinkedList<>();
        swap(swapS4, swapQ4);
        System.out.println("Swap test 4 executed.");

        System.out.println("\n==> swap, test 5: Empty queue and empty stack ");
        Stack<RealEstateProperty> swapS5 = new Stack<>();
        Queue<RealEstateProperty> swapQ5 = new LinkedList<>();
        swap(swapS5, swapQ5);
        System.out.println("Swap test 5 executed.");


        // Test split
        System.out.println("\n==> split, test 1: Input queue has mix of Item, ItemA and ItemB ");
        Queue<RealEstateProperty> splitQ1 = new LinkedList<>();
        splitQ1.offer(new RealEstateProperty("Base", 1));
        splitQ1.offer(new ResidentialProperty("Res", 3, 2));
        splitQ1.offer(new CommercialProperty("Com", 0, true));
        Queue<RealEstateProperty>[] splitRes1 = split(splitQ1);
        System.out.println("Resident queue size: " + splitRes1[0].size() + ", Commercial queue size: " + splitRes1[1].size() + ", Remaining size: " + splitQ1.size());

        System.out.println("\n==> split, test 2: Input queue has only ItemA items ");
        Queue<RealEstateProperty> splitQ2 = new LinkedList<>();
        splitQ2.offer(new ResidentialProperty("Res1", 3, 1));
        Queue<RealEstateProperty>[] splitRes2 = split(splitQ2);
        System.out.println("Resident queue size: " + splitRes2[0].size() + ", Commercial queue size: " + splitRes2[1].size());

        System.out.println("\n==> split, test 3: Input queue has only ItemB items ");
        Queue<RealEstateProperty> splitQ3 = new LinkedList<>();
        splitQ3.offer(new CommercialProperty("Com1", 0, true));
        Queue<RealEstateProperty>[] splitRes3 = split(splitQ3);
        System.out.println("Resident queue size: " + splitRes3[0].size() + ", Commercial queue size: " + splitRes3[1].size());

        System.out.println("\n==> split, test 4: Input queue has only Item items ");
        Queue<RealEstateProperty> splitQ4 = new LinkedList<>();
        splitQ4.offer(new RealEstateProperty("Base1", 2));
        Queue<RealEstateProperty>[] splitRes4 = split(splitQ4);
        System.out.println("Resident queue size: " + splitRes4[0].size() + ", Commercial queue size: " + splitRes4[1].size());

        System.out.println("\n==> split, test 5: Input queue is empty ");
        Queue<RealEstateProperty> splitQ5 = new LinkedList<>();
        Queue<RealEstateProperty>[] splitRes5 = split(splitQ5);
        System.out.println("Resident queue size: " + splitRes5[0].size() + ", Commercial queue size: " + splitRes5[1].size());

        System.out.println("\n=== ALL TESTS COMPLETED ===");
    }
}