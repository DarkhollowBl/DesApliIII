package com.example.vazquez.gridview;

/**
 * Created by vazquez on 09/02/2018.
 */

public class Restaurant {
    private int imageId;
    private String name;
    private String location;
    private String type;

    public Restaurant(int imageId, String name){
        this.imageId = imageId;
        this.name = name;
        this.location = location;
        this.type = type;
    }

    public Restaurant(){
        this(R.mipmap.ic_launcher_round, "unamed");
    }

    public int getImageId() {
        return imageId;
    }

    public String getName() {
        return name;
    }


}
