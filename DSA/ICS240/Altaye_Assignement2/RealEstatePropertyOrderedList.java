public class RealEstatePropertyOrderedList {
    private RealEstatePropertyNode head;
    private RealEstatePropertyNode tail;

    public RealEstatePropertyOrderedList() {
        this.head = null;
        this.tail = null;
    }

    // Helper method for robust equality checking across subclasses
    private boolean areEqual(RealEstateProperty p1, RealEstateProperty p2) {
        if (p1 == null || p2 == null) return false;
        if (p1.getClass() != p2.getClass()) return false;

        if (p1 instanceof ResidentialProperty && p2 instanceof ResidentialProperty) {
            return ((ResidentialProperty) p1).equals((ResidentialProperty) p2);
        } else if (p1 instanceof CommercialProperty && p2 instanceof CommercialProperty) {
            return ((CommercialProperty) p1).equals((CommercialProperty) p2);
        } else {
            return p1.equals(p2);
        }
    }

    // Adds an Item to the end of the list
    public void add(RealEstateProperty element) {
        RealEstatePropertyNode newNode = new RealEstatePropertyNode(element, null);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setLink(newNode);
            tail = newNode;
        }
    }

    // Returns the number of nodes in the list
    public int size() {
        int count = 0;
        RealEstatePropertyNode current = head;
        while (current != null) {
            count++;
            current = current.getLink();
        }
        return count;
    }

    // Displays contents of the list, one item per line, attributes separated by tab
    public void display() {
        RealEstatePropertyNode current = head;
        while (current != null) {
            System.out.println(current.getProperty().toString());
            current = current.getLink();
        }
    }

    // Adds an element at the given index (head node is at index 1)
    public boolean add(int index, RealEstateProperty element) {
        if (index < 1) {
            return false;
        }

        int sz = size();
        if (index > sz + 1) {
            index = sz + 1; // If greater than size, added as the last element
        }

        if (index == 1) {
            RealEstatePropertyNode newNode = new RealEstatePropertyNode(element, head);
            head = newNode;
            if (tail == null) {
                tail = newNode;
            }
            return true;
        }

        RealEstatePropertyNode current = head;
        for (int i = 1; i < index - 1; i++) {
            current = current.getLink();
        }

        RealEstatePropertyNode newNode = new RealEstatePropertyNode(element, current.getLink());
        current.setLink(newNode);
        if (newNode.getLink() == null) {
            tail = newNode;
        }
        return true;
    }

    // Removes one occurrence of target from the list
    public boolean remove(RealEstateProperty target) {
        if (head == null || target == null) {
            return false;
        }

        if (areEqual(head.getProperty(), target)) {
            head = head.getLink();
            if (head == null) {
                tail = null;
            }
            return true;
        }

        RealEstatePropertyNode current = head;
        while (current.getLink() != null) {
            if (areEqual(current.getLink().getProperty(), target)) {
                current.setLink(current.getLink().getLink());
                if (current.getLink() == null) {
                    tail = current;
                }
                return true;
            }
            current = current.getLink();
        }
        return false;
    }

    // Removes the item located at position index (head node is at index 1)
    public boolean remove(int index) {
        if (index < 1 || index > size()) {
            return false;
        }

        if (index == 1) {
            head = head.getLink();
            if (head == null) {
                tail = null;
            }
            return true;
        }

        RealEstatePropertyNode current = head;
        for (int i = 1; i < index - 1; i++) {
            current = current.getLink();
        }

        current.setLink(current.getLink().getLink());
        if (current.getLink() == null) {
            tail = current;
        }
        return true;
    }

    // Returns the 1-based index of the first occurrence of target, or -1 if not found
    public int indexOf(RealEstateProperty target) {
        if (target == null) {
            return -1;
        }
        RealEstatePropertyNode current = head;
        int index = 1;
        while (current != null) {
            if (areEqual(current.getProperty(), target)) {
                return index;
            }
            current = current.getLink();
            index++;
        }
        return -1;
    }

    // Returns the item at position index (1-based), or null if out of bounds
    public RealEstateProperty get(int index) {
        if (index < 1) {
            return null;
        }
        RealEstatePropertyNode current = head;
        int currentIndex = 1;
        while (current != null) {
            if (currentIndex == index) {
                return current.getProperty();
            }
            current = current.getLink();
            currentIndex++;
        }
        return null;
    }
}