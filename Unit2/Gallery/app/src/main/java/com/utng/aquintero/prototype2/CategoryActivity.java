package com.utng.aquintero.prototype2;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class CategoryActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    ListView listaRecorridos;

    private Restaurant[] restaurants = {
            new Restaurant(R.drawable.barrafina, "Viñedos"),
            new Restaurant(R.drawable.bourkestreetbakery, "Museos"),
            new Restaurant(R.drawable.cafedeadend, "Iglesias"),
            new Restaurant(R.drawable.cafeloisl, "Artesanias"),
            new Restaurant(R.drawable.cafelore, "Otros")
    };


    private GridView grvRestaurants;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        grvRestaurants = findViewById(R.id.gvr_restaurants);
        RestaurantAdapter adapter = new RestaurantAdapter( this,restaurants);
        grvRestaurants.setAdapter(adapter);
        grvRestaurants.setOnItemClickListener(this);
        listaRecorridos = (ListView)findViewById(R.id.lv01);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String selectedOption=((Restaurant)adapterView.getItemAtPosition(i)).getName();
        Toast.makeText(this, "You selected: " +selectedOption, Toast.LENGTH_SHORT).show();

    }

    static  class ViewHolder{
        TextView txvName;
        ImageView imvPhoto;
    }


    class RestaurantAdapter extends ArrayAdapter<Restaurant> {
        public RestaurantAdapter(@NonNull Context context, Restaurant[] data){
            super (context, R.layout.cell_places,data);
        }

        @NonNull
        @Override

        public View getView(int position, @NonNull  View convertView, @NonNull ViewGroup parent){
            View cell = convertView;
            ViewHolder holder;
            if(cell == null){
                LayoutInflater inflater = LayoutInflater.from(getContext());
                cell= inflater.inflate(R.layout.cell_places, null);

                holder = new ViewHolder();
                holder.imvPhoto= cell.findViewById(R.id.imv_thumbnail);
                holder.txvName = cell.findViewById(R.id.txv_name);

                cell.setTag(holder);

            }else{
                holder=(ViewHolder) cell.getTag();
            }

            holder.imvPhoto.setImageResource(restaurants[position].getImageId());
            holder.txvName.setText(restaurants[position].getName());
            return cell;
        }


    }
}
