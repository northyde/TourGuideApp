package com.example.android.blombergfreetimeguide;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Michaela on 16.05.2018.
 */

public class PlacesAdapter extends ArrayAdapter<Place> {

    private int mColorResourceId;

    public PlacesAdapter(@NonNull Activity context, @NonNull List<Place> places, int colorResourceId) {
        super(context, 0, places);
        mColorResourceId= colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Place currentPlace = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        nameTextView.setText(currentPlace.getmName());

        TextView streetTextView = (TextView) listItemView.findViewById(R.id.street_text_view);
       streetTextView.setText(currentPlace.getmStreet());

       TextView districtTextView = (TextView) listItemView.findViewById(R.id.district_text_view);
       districtTextView.setText(currentPlace.getmDistrict());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if (currentPlace.hasImage()) {
            imageView.setImageResource(currentPlace.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }

}
