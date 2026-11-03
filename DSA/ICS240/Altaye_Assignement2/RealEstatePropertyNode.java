public class RealEstatePropertyNode {
    private RealEstateProperty property; //data = property, instead of myProperty I use property
    private RealEstatePropertyNode link; //link will not be achanged

    public RealEstatePropertyNode(RealEstateProperty property, RealEstatePropertyNode link) {
        this.property = property;
        this.link = link;
    }

    public RealEstateProperty getProperty() {
        return property;
    }

    public void setProperty(RealEstateProperty property) {
        this.property = property;
    }

    public RealEstatePropertyNode getLink() {
        return link;
    }

    public void setLink(RealEstatePropertyNode link) {
        this.link = link;
    }
}