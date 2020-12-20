package com.example.bayareatours_fragments;

public class Attraction {

    private String mAttraction;
    private String mAttractionAddress;
    private int mAttractionImage = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    //Create the Attraction constructor
    public Attraction(String attraction, String attractionAddress, int attractionImage){

        mAttraction = attraction;
        mAttractionAddress = attractionAddress;
        mAttractionImage = attractionImage;
    }

    //Set up all getter methods for the attraction class
    //Get attraction name
    public String getAttraction(){return mAttraction;}
    //Get attraction location
    public String getAttractionAddress(){return mAttractionAddress;}
    //Get attraction image
    public int getAttractionImage(){return mAttractionImage;}
    //Boolean to determine whether an attraction includes an image
    public boolean hasImage(){
        if(mAttractionImage == NO_IMAGE_PROVIDED){
            return false;
        }
        else
            return true;
    }

}
