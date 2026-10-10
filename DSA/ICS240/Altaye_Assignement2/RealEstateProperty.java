public class RealEstateProperty implements Comparable<RealEstateProperty>{
    private String propertyType;
    private Integer bedRooms;

    public RealEstateProperty(String propertyType, Integer bedRooms){
        this.propertyType=propertyType;
        this.bedRooms=bedRooms;
    }

    public String getPropertyType(){
        return propertyType;
    }
    public Integer getBedRooms(){
        return bedRooms;
    }

    public void setPropertyType(String propertyType){
        this.propertyType=propertyType;
    }
    public void setBedRooms(Integer bedRooms){
        this.bedRooms=bedRooms;
    }
    
    @Override 
    public String toString(){
        return propertyType + "\t" + bedRooms;
    }

    public boolean equals(RealEstateProperty o){
        if(o==null){
            return false;
        }

        boolean typeEqual=this.propertyType.equalsIgnoreCase(o.getPropertyType());
        boolean bedEqual=this.bedRooms.equals(o.getBedRooms());

        return typeEqual && bedEqual;
    }

    //Assignemnt 2 
    @Override
    public int compareTo(RealEstateProperty o){
        int typeCompare=this.propertyType.compareToIgnoreCase(o.getPropertyType());
        if(typeCompare !=0){
            return typeCompare;
        }
        return this.bedRooms.compareTo(o.getBedRooms());
    }
}