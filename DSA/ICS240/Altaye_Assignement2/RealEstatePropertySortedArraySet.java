public class RealEstatePropertySortedArraySet {
    private RealEstateProperty[] propertyAry;
    private Integer max;
    private int count;

    public RealEstatePropertySortedArraySet(Integer max){
        this.max=max;
        this.propertyAry=new RealEstateProperty[max];
        this.count=0;
    }

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

    public void insert(RealEstateProperty i){
        if(i == null || count>max){
            return;
        }

        for(int j=0; j<count; j++){
            if(areEqual(propertyAry[j], i)){
                return;
            }
        }

        int insertIndex = 0;
        while (insertIndex < count && propertyAry[insertIndex].compareTo(i) < 0) {
            insertIndex++;
        }

        for (int k = count; k > insertIndex; k--) {
            propertyAry[k] = propertyAry[k - 1];
        }

        propertyAry[insertIndex] = i;
        count++;
    }

    public int size() {
        return count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(propertyAry[i].toString());
            if (i < count - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public int indexOf(RealEstateProperty i) {
        for (int k = 0; k < count; k++) {
            if (areEqual(propertyAry[k], i)) {
                return k;
            }
        }
        return -1;
    }

    public boolean remove(RealEstateProperty i) {
        int idx = indexOf(i);
        if (idx == -1) {
            return false;
        }

        for (int k = idx; k < count - 1; k++) {
            propertyAry[k] = propertyAry[k + 1];
        }

        propertyAry[count - 1] = null;
        count--;
        return true;
    }

    public RealEstateProperty grab(int index) {
        if (index < 0 || index >= count) {
            return null;
        }
        return propertyAry[index];
    }

    public RealEstatePropertySortedArraySet categorySet(int type) {
        if (type < 1 || type > 3) {
            return null;
        }

        RealEstatePropertySortedArraySet result = new RealEstatePropertySortedArraySet(this.max);

        for (int k = 0; k < count; k++) {
            RealEstateProperty item = propertyAry[k];
            if (type == 1 && item instanceof ResidentialProperty) {
                result.insert(item);
            } else if (type == 2 && item instanceof CommercialProperty) {
                result.insert(item);
            } else if (type == 3 && !(item instanceof ResidentialProperty) && !(item instanceof CommercialProperty)) {
                result.insert(item);
            }
        }

        return result;
    }
}
