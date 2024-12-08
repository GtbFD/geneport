package com.gtb.geneport.domain.entity;

import java.util.Objects;

public class Address {
    private String street;
    private String district;
    private String city;
    private String state;
    private int number;
    private String zip;

    public Address(String street, String district, String city, String state, int number, String zip) {
        this.street = street;
        this.district = district;
        this.city = city;
        this.state = state;
        this.number = number;
        this.zip = zip;
    }

    public Address() {}

    public static class Builder {
        private String street;
        private String district;
        private String city;
        private String state;
        private int number;
        private String zip;

        public Builder street(String street) {
            this.street = street;
            return this;
        }

        public Builder district(String district) {
            this.district = district;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public Builder number(int number) {
            this.number = number;
            return this;
        }

        public Builder zip(String zip) {
            this.zip = zip;
            return this;
        }

        public Address build() {
            return new Address(street, district, city, state, number, zip);
        }
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return number == address.number && Objects.equals(street, address.street) && Objects.equals(district, address.district) && Objects.equals(city, address.city) && Objects.equals(state, address.state) && Objects.equals(zip, address.zip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, district, city, state, number, zip);
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", district='" + district + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", number=" + number +
                ", zip='" + zip + '\'' +
                '}';
    }
}
