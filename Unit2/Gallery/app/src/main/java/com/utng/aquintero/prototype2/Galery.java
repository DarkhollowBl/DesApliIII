package com.utng.aquintero.prototype2;

/**
 * Created by Murin on 08/02/2018.
 */

public class Galery {

    private int imageId;



    public Galery(int imageId ){

        this.imageId = imageId;


    }

    public Galery(){
        this(R.mipmap.ic_launcher_round);
    }

    public int getImageId() {
        return imageId;
    }



}
