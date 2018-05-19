package com.example.android.blombergfreetimeguide;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Michaela on 16.05.2018.
 */

public class PoolsAndGymsFragment extends Fragment {
    ListView listView;

    public PoolsAndGymsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Outdoor Pool", "Wesselweg 28", "Blomberg"));
places.add(new Place("Indoor Pool", "Ulmenallee", "Blomberg"));
places.add(new Place("Gymnasium Grundschule am Paradies", "Holstenhöfener Straße 4", "Blomberg"));
places.add(new Place("Gymnasium Grundschule am Weinberg", "Friedrichstraße ", "Blomberg"));
places.add(new Place("Gymnasium Grundschule Reelkirchen", "Fasanenweg 3 ", "Reelkirchen"));
places.add(new Place("Gymnastics gymnasium", "Ostring 14", "Blomberg"));
places.add(new Place("Multi-purpose hall Istrup", "Detmolder Straße", "Istrup"));
places.add(new Place("Sportshall I im Schulzentrum", "Ulmenallee 11", "Blomberg"))
;places.add(new Place("Sportshall II im Schulzentrum", "Ulmenallee 11", "Blomberg"));
places.add(new Place("Gymnasium ehemalige Grundschule am Paradies", "Paradies 5", "Blomberg"));
places.add(new Place("Gymnasium Grundschule am Weinberg", "Friedrichstraße", "Blomberg"));
places.add(new Place("Gymnasium Grundschule Großenmarpe", "Turnhallenstraße", "Großenmarpe"));

        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places, R.color.category_PoolsAndGyms);

        listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        // Makes an item in a list clickable
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Place currentPlace = (Place) listView.getItemAtPosition(position);
            }
        });

        return rootView;
    }
}

