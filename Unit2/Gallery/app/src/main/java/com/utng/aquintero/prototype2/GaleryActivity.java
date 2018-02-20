package com.utng.aquintero.prototype2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class GaleryActivity extends AppCompatActivity /*implements AdapterView.OnItemClickListener*/{

    private Galery[] galeries = {
            new Galery(R.drawable.parroquia1),
            new Galery(R.drawable.parroquia2),
            new Galery(R.drawable.parroquia3),
            new Galery(R.drawable.parroquia4),
            new Galery(R.drawable.parroquia5)

    };
    private GridView lsvRestaurants;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galery);
        lsvRestaurants = findViewById(R.id.lsv_restaurant);
        RestaurantAdapter adapter = new RestaurantAdapter(this, galeries);
        lsvRestaurants.setAdapter(adapter);
        /*lsvRestaurants.setOnItemClickListener(this);*/
    }

    public void nextActivity(View view){
        startActivity(new Intent(this, InfoActivity.class));
        finish();
    }

    /*@Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String selectedOption = ((Galery) adapterView.getItemAtPosition(i));
        //String selectedOptionOne = ((TextView)view.findViewById(R.id.txv_name)).getText().toString();
        Toast.makeText(this, "You selected: " + selectedOption, Toast.LENGTH_LONG).show();
    }*/

        static class ViewHolder {
            ImageView imvPhoto;

        }

        class RestaurantAdapter extends ArrayAdapter<Galery> {
            public RestaurantAdapter(Context context, Galery[] data) {
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


                    cell.setTag(holder);
                } else {
                    holder = (ViewHolder) cell.getTag();
                }

                holder.imvPhoto.setImageResource(galeries[position].getImageId());

                return cell;
            }
        }


}
