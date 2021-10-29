package com.jmr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "realEstateTransactions")
public class RealEstateTransaction {

        @Id
        @Column(name = "street")
        private String street;

        @Column(name = "city")
        private String city;

        @Column(name = "zip")
        private String zip;

        @Column(name = "state")
        private String state;

        @Column(name = "beds")
        private String beds;

        @Column(name = "baths")
        private String baths;

        @Column(name = "sqft")
        private String sq__ft;

        @Column(name = "type")
        private String type;

        @Column(name = "sale_date")
        private String sale_date;

        @Column(name = "price")
        private String price;

        @Column(name = "latitude")
        private String latitude;

        @Column(name = "longitude")
        private String longitude;

    public RealEstateTransaction() {
    }

    public RealEstateTransaction(String street, String city, String zip, String state, String beds, String baths,
                                 String sq__ft, String type, String sale_date, String price, String latitude,
                                 String longitude) {
        this.street = street;
        this.city = city;
        this.zip = zip;
        this.state = state;
        this.beds = beds;
        this.baths = baths;
        this.sq__ft = sq__ft;
        this.type = type;
        this.sale_date = sale_date;
        this.price = price;
        this.latitude = latitude;
        this.longitude = longitude;
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

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getBeds() {
        return beds;
    }

    public void setBeds(String beds) {
        this.beds = beds;
    }

    public String getSq__ft() {
        return sq__ft;
    }

    public void setSq__ft(String sq__ft) {
        this.sq__ft = sq__ft;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSale_date() {
        return sale_date;
    }

    public void setSale_date(String sale_date) {
        this.sale_date = sale_date;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getBaths() {
        return baths;
    }

    public void setBaths(String baths) {
        this.baths = baths;
    }
}
