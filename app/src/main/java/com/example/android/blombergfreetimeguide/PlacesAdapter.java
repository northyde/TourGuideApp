package com.example.android.blombergfreetimeguide;

import android.app.Activity;
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
        mColorResourceId = colorResourceId;
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
        // Get the item which is currently shown
        Place currentPlace = getItem(position);
        // Apply information to current item
        TextView nameTextView = listItemView.findViewById(R.id.name_text_view);
        nameTextView.setText(currentPlace.getmName());

        TextView streetTextView = listItemView.findViewById(R.id.street_text_view);
        streetTextView.setText(currentPlace.getmStreet());

        TextView districtTextView = listItemView.findViewById(R.id.district_text_view);
        districtTextView.setText(currentPlace.getmDistrict());

        ImageView imageView = listItemView.findViewById(R.id.image);
        // Show the picture of the item if it has one, if not hide the ImageView completely
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
