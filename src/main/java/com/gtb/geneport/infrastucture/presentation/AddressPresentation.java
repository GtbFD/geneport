package com.gtb.geneport.infrastucture.presentation;

import jakarta.persistence.Embeddable;

import java.util.Objects;

@Embeddable
public class AddressPresentation {
    private String street;
    private String district;
    private String city;
    private String state;
    private int number;
    private String zip;

    public AddressPresentation() {}

    public AddressPresentation(String street, String district, String city, String state, int number, String zip) {
        this.street = street;
        this.district = district;
        this.city = city;
        this.state = state;
        this.number = number;
        this.zip = zip;
    }

    public static class Builder{
        private String street;
        private String district;
        private String city;
        private String state;
        private int number;
        private String zip;

        public Builder setStreet(String street) {
            this.street = street;
            return this;
        }

        public Builder setDistrict(String district) {
            this.district = district;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setState(String state) {
            this.state = state;
            return this;
        }

        public Builder setNumber(int number) {
            this.number = number;
            return this;
        }

        public Builder setZip(String zip) {
            this.zip = zip;
            return this;
        }

        public AddressPresentation build(){
            return new AddressPresentation(street, district, city, state, number, zip);
        }
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
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

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressPresentation that = (AddressPresentation) o;
        return number == that.number && Objects.equals(street, that.street) && Objects.equals(district, that.district) && Objects.equals(city, that.city) && Objects.equals(state, that.state) && Objects.equals(zip, that.zip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, district, city, state, number, zip);
    }

    @Override
    public String toString() {
        return "AddressPresentation{" +
                "street='" + street + '\'' +
                ", district='" + district + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", number=" + number +
                ", zip='" + zip + '\'' +
                '}';
    }
}
