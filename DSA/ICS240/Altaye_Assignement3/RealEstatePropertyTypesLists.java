public class RealEstatePropertyTypesLists {
    private RealEstatePropertyOrderedList residentialPropertyList;
    private RealEstatePropertyOrderedList commercialPropertyList;

    public RealEstatePropertyTypesLists() {
        this.residentialPropertyList = new RealEstatePropertyOrderedList();
        this.commercialPropertyList = new RealEstatePropertyOrderedList();
    }

    // Adds element to the correct list 
    public void add(RealEstateProperty element) {
        try {
            if (element instanceof ResidentialProperty) {
                residentialPropertyList.add(element);
            } else if (element instanceof CommercialProperty) {
                commercialPropertyList.add(element);
            } else {
                throw new ClassNotFoundException("ELement not instance of either subclass");
            }
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    // Returns the number of nodes in the given list
    public int sizeOf(RealEstatePropertyOrderedList iol) {
        if (iol == null) {
            return 0;
        }
        return iol.size();
    }

    // Displays the contents of the specified list on the screen
    public void display(RealEstatePropertyOrderedList iol) {
        if (iol != null) {
            iol.display();
        }
    }

    // Adds element to the correct list at the given index
    public boolean add(int index, RealEstateProperty element) {
        if (index < 1 || element == null) {
            return false;
        }

        if (element instanceof ResidentialProperty) {
            return residentialPropertyList.add(index, element);
        } else if (element instanceof CommercialProperty) {
            return commercialPropertyList.add(index, element);
        }
        return false;
    }

    // Remove one occurrence of target from the correct list
    public boolean remove(RealEstateProperty target) {
        if (target == null) {
            return false;
        }

        if (target instanceof ResidentialProperty) {
            return residentialPropertyList.remove(target);
        } else if (target instanceof CommercialProperty) {
            return commercialPropertyList.remove(target);
        }
        return false;
    }

    // Removes the Item located at position index
    public boolean remove(RealEstatePropertyOrderedList iol, int index) {
        if (iol == null) {
            return false;
        }
        return iol.remove(index);
    }

    // Returns the index of the first occurrence of target
    public int indexOf(RealEstateProperty target) {
        if (target == null) {
            return -1;
        }

        if (target instanceof ResidentialProperty) {
            return residentialPropertyList.indexOf(target);
        } else if (target instanceof CommercialProperty) {
            return commercialPropertyList.indexOf(target);
        }
        return -1;
    }

    // Returns the list of the given type 
    public RealEstatePropertyOrderedList getList(char type) {
        char lowerType = Character.toLowerCase(type);
        if (lowerType == 'a') {
            return residentialPropertyList;
        } else if (lowerType == 'b') {
            return commercialPropertyList;
        }
        return null;
    }

    // Returns the item at position index in the specified list
    public RealEstateProperty get(RealEstatePropertyOrderedList iol, int index) {
        if (iol == null) {
            return null;
        }
        return iol.get(index);
    }
}