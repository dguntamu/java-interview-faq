package com.java.faq.immutable;

class Address {
    private String city;
    private Integer zip;
    private String country;


    public Address(String city, String country,Integer zip) {
        this.city = city;
        this.country = country;
        this.zip = zip;
    }
    public Address(Address address){
        this(address.getCity() ,address.getCountry(),address.zip);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}