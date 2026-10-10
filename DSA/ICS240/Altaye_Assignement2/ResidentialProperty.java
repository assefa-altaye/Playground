public class ResidentialProperty extends RealEstateProperty {
    private Integer garageCapacity;

    public ResidentialProperty(String s, Integer n1, Integer n2) {
        super(s, n1);
        this.garageCapacity = n2;
    }

    public Integer getGarageCapacity() {
        return garageCapacity;
    }

    public void setGarageCapacity(Integer garageCapacity) {
        this.garageCapacity = garageCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + garageCapacity;
    }

    public boolean equals(ResidentialProperty a) {
        if (a == null) {
            return false;
        }
        return super.equals(a) && this.garageCapacity.equals(a.getGarageCapacity());
    }
}