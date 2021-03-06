package com.codeclan.project.Project3.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.hateoas.ResourceSupport;

import java.util.ArrayList;

public class Search extends ResourceSupport {

    private String productName;
    private String imageLink;
    private double rating;
    private ArrayList<Country> countryList;

    @JsonCreator
    public Search(@JsonProperty("product_name") String productName, @JsonProperty("image_link") String imageLink, @JsonProperty("rating") double rating) {
        this.productName = productName;
        this.imageLink = imageLink;
        this.rating = rating;
        this.countryList = new ArrayList<>();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public ArrayList<Country> getCountryList() {
        return countryList;
    }

    public void addCountry(Country country) {
        this.countryList.add(country);
    }
}
