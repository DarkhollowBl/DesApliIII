package com.utng.jonaml.customlist;

/**
 * Created by Murin on 08/02/2018.
 */

public class Restaurant {

    private int imageId;
    private String name;


    public Restaurant(int imageId, String name){

        this.imageId = imageId;
        this.name = name;
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
