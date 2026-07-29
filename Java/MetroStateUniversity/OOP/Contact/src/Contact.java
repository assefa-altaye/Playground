class Contact {
    private String firstName;
    private String lastName;
    private String email;

    public Contact(String firstName, String lastName, String email){
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
    }
    //getter methods
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public String getEmail(){
        return email;
    }
    //setter methods
    public void setFirstName(){
        this.firstName=firstName;
    }
    public void setLastName(){
        this.lastName=lastName;
    }

    @Override
    public String toString(){
        return "Contact[First: " + firstName + "Last: " +"Email: " + email +"]";
    }

    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(!(o instanceof Contact contact)) return false;

        return this.email.equalsIgnoreCase(contact.email);
    }
}