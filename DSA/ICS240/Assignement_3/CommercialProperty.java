public class CommercialProperty extends RealEstateProperty {
    private Boolean hasPermit;

    public CommercialProperty(String s, Integer n1, Boolean n2) {
        super(s, n1);
        this.hasPermit = n2;
    }

    public Boolean getHasPermit() {
        return hasPermit;
    }

    public void setHasPermit(Boolean hasPermit) {
        this.hasPermit = hasPermit;
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + hasPermit;
    }

    public boolean equals(CommercialProperty b) {
        if (b == null) {
            return false;
        }
        return super.equals(b) && this.hasPermit.equals(b.getHasPermit());
    }
}