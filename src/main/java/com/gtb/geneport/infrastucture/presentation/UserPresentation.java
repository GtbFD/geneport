package com.gtb.geneport.infrastucture.presentation;

import com.gtb.geneport.domain.entity.Address;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity(name = "user_")
public class UserPresentation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;
    private String githubLink;
    private String linkedinLink;
    private LocalDate dateOfBirth;
    @Embedded
    private AddressPresentation address;

    public UserPresentation(Long id, String firstName, String lastName, String email, String password, String phoneNumber,
                            String githubLink, String linkedinLink, LocalDate dateOfBirth, AddressPresentation address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.githubLink = githubLink;
        this.linkedinLink = linkedinLink;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public static class Builder {
        private Long id;
        private String firstName;
        private String lastName;
        private String email;
        private String password;
        private String phoneNumber;
        private String githubLink;
        private String linkedinLink;
        private LocalDate dateOfBirth;
        private AddressPresentation address;

        public Builder id(Long id){
            this.id = id;
            return this;
        }

        public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder email(String email){
            this.email = email;
            return this;
        }

        public Builder password(String password){
            this.password = password;
            return this;
        }

        public Builder phoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder address(AddressPresentation address){
            this.address = address;
            return this;
        }

        public Builder githubLink(String githubLink){
            this.githubLink = githubLink;
            return this;
        }

        public Builder linkedinLink(String linkedinLink){
            this.linkedinLink = linkedinLink;
            return this;
        }

        public Builder dateOfBirth(LocalDate dateOfBirth){
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public UserPresentation build(){
            return new UserPresentation(id, firstName, lastName, email, password, phoneNumber, githubLink, linkedinLink,
                    dateOfBirth, address);
        }
    }

    public UserPresentation() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGithubLink() {
        return githubLink;
    }

    public void setGithubLink(String githubLink) {
        this.githubLink = githubLink;
    }

    public String getLinkedinLink() {
        return linkedinLink;
    }

    public void setLinkedinLink(String linkedinLink) {
        this.linkedinLink = linkedinLink;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public AddressPresentation getAddress() {
        return address;
    }

    public void setAddress(AddressPresentation address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserPresentation that = (UserPresentation) o;
        return Objects.equals(id, that.id) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(email, that.email) && Objects.equals(password, that.password) && Objects.equals(phoneNumber, that.phoneNumber) && Objects.equals(githubLink, that.githubLink) && Objects.equals(linkedinLink, that.linkedinLink) && Objects.equals(dateOfBirth, that.dateOfBirth) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email, password, phoneNumber, githubLink, linkedinLink, dateOfBirth, address);
    }

    @Override
    public String toString() {
        return "UserPresentation{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", githubLink='" + githubLink + '\'' +
                ", linkedinLink='" + linkedinLink + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", address=" + address +
                '}';
    }
}
