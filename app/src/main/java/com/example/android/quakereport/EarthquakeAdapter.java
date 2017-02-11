package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by AP on 11.2.2017..
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes){
        super(context,0,earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        //check if existing list is there..if not create new
        View listItemView=convertView;

        if(listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);
        }
        Earthquake currentEarthquake=getItem(position);

        //find magnitude view and set value
        TextView magnitude=(TextView)listItemView.findViewById(R.id.magnitude);
        magnitude.setText(currentEarthquake.getmMagnitude());

        //find location view and set value
        TextView location=(TextView)listItemView.findViewById(R.id.location);
        location.setText(currentEarthquake.getmLocation());

        //find date view and set value
        TextView date=(TextView)listItemView.findViewById(R.id.date);
        date.setText(currentEarthquake.getmDate());

        return listItemView;
    }
}
