package com.example.android.blombergfreetimeguide;

import android.app.Activity;
import android.app.Fragment;
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

public class PlaygroundsFragment extends Fragment {
    ListView listView;

    public PlaygroundsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);



        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Test Name", "Teststraße", "Donop"));

        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places, R.color.category_Playgrounds);

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
