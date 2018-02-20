package com.utng.jonaml.customlist;

/**
 * Created by DLira on 08/02/2018.
 */

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private Restaurant[] restaurants = {
            new Restaurant(R.drawable.barrafina, "Barra Fina"),
            new Restaurant(R.drawable.bourkestreetbakery, "Bourke Street Bakery"),
            new Restaurant(R.drawable.cafedeadend, "Cafe dead end"),
            new Restaurant(R.drawable.cafeloisl, "Cafe Loisl"),
            new Restaurant(R.drawable.cafelore, "Cafe Lore"),
            new Restaurant(R.drawable.caskpubkitchen, "CASK Pub and Kitchen"),
            new Restaurant(R.drawable.confessional,"Confessional"),
            new Restaurant(R.drawable.donostia, "Donostia"),
            new Restaurant(R.drawable.fiveleaves,"Five Leaves"),
            new Restaurant(R.drawable.forkeerestaurant, "For Kee Restaurant"),
            new Restaurant(R.drawable.grahamavenuemeats, "Graham Avenue Meats"),
            new Restaurant(R.drawable.haighschocolate, "Haigh's Chocolate"),
            new Restaurant(R.drawable.homei,"Homei"),
            new Restaurant(R.drawable.palominoespresso,"Palomino Espresso"),
            new Restaurant(R.drawable.petiteoyster,"Petite Oyster"),
            new Restaurant(R.drawable.posatelier,"Po's Atelier"),
            new Restaurant(R.drawable.royaloak,"Royal Oak"),
            new Restaurant(R.drawable.teakha,"Teakha"),
            new Restaurant(R.drawable.traif,"Traif"),
            new Restaurant(R.drawable.upstate,"Upstate"),
            new Restaurant(R.drawable.wafflewolf, "Waffle & Wolf")
    };
    private ListView lsvRestaurants;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lsvRestaurants = findViewById(R.id.lsv_restaurant);
        RestaurantAdapter adapter = new RestaurantAdapter(this, restaurants);
        lsvRestaurants.setAdapter(adapter);
        lsvRestaurants.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String selectedOption = ((Restaurant) adapterView.getItemAtPosition(i)).getName();
        //String selectedOptionOne = ((TextView)view.findViewById(R.id.txv_name)).getText().toString();
        Toast.makeText(this, "You selected: " + selectedOption, Toast.LENGTH_LONG).show();
    }



    static class ViewHolder{
        TextView txvName;
        TextView txvLocation;
        TextView txvType;
        ImageView imvPhoto;
    }

    class RestaurantAdapter extends ArrayAdapter<Restaurant>{
        public  RestaurantAdapter(Context context, Restaurant[] data){
            super(context, R.layout.cell_layout, data);
        }


    public View getView(int position, View convertView, ViewGroup parent) {
        View cell = convertView;
        ViewHolder holder;
        if (cell == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            cell = layoutInflater.inflate(R.layout.cell_layout, null);

            holder = new ViewHolder();
            holder.imvPhoto = cell.findViewById(R.id.imv_photo);
            holder.txvName = cell.findViewById(R.id.txv_name);

            cell.setTag(holder);
        } else {
            holder = (ViewHolder) cell.getTag();
        }

        holder.imvPhoto.setImageResource(restaurants[position].getImageId());
        holder.txvName.setText(restaurants[position].getName());
        return cell;
        }
    }


    public void AddActivity(View view) {
        startActivity(new Intent(this, AddActivity.class));
    }

}//End
