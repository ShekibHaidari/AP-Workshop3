public class Address {
    /**
     * Attributes
     */
    private String zipCode;
    private String country;
    private String city;
    private String email;
    // =======================================  CONSTRACTORS
    public Address(){}
    public Address(String zipCode, String country, String city, String email) {
        this.zipCode = zipCode;
        this.country = country;
        this.city = city;
        this.email = email;
    }public Address(String zipCode, String country, String city) {
        this.zipCode = zipCode;
        this.country = country;
        this.city = city;
        this.email = null;
    }
    public Address(String country, String city) {
        this.country = country;
        this.city = city;
        this.zipCode = null;
    }
    //======================================== setters


    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    // ======================================== getters

    public String getCountry() {
        return country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCity() {
        return city;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Address{" +
                "zipCode='" + zipCode + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
