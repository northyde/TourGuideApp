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

public class PlaygroundsFragment extends Fragment {
    ListView listView;

    public PlaygroundsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Playground Wöhren", "Lindenstraße", "Wöhren"));
        places.add(new Place("Playground ehemalige Grundschule am Paradies", "Hölstenhöfener Straße 4", "Blomberg"));
        places.add(new Place("Playground Wellentrup", "Alte Ortsstraße", "Wellentrup"));
        places.add(new Place("Playground Treptower Straße", "Treptower Straße", "Blomberg"));
        places.add(new Place("Playground Höntrup", "Am Lietholz", "Höntrup"));
        places.add(new Place("Playground Tegeler Straße", "Tegeler Straße", "Blomberg"));
        places.add(new Place("Playground Herrentrup", "Schwalbenweg", "Herrentrup"));
        places.add(new Place("Playground Steinkuhle", "Gegerloh", "Blomberg"));
        places.add(new Place("Playground Grundschule Reelkirchen", "Fasanenweg", "Reelkirchen"));
        places.add(new Place("Playground Saulsiek", "Bunerbergweg", "Blomberg"));
        places.add(new Place("Playground Grundschule Istrup", "Detmolder Straße", "Istrup"));
        places.add(new Place("Playground Kita Zauberblume", "Neue Torstraße 114a", "Blomberg"));
        places.add(new Place("Playground Grundschule Grußenmarpe", "Turnhallenstraße", "Großenmarpe"));
        places.add(new Place("Playground Gymnasium", "Ostring 14 ", "Blomberg"));
        places.add(new Place("Playground Großenmarpe", "Am Pielberg", "Großenmarpe"));
        places.add(new Place("Playground Grundschule Am Weinberg", "Schulstraße", "Blomberg"));
        places.add(new Place("Playground Eschenbruch", "Winterbergstraße", "Eschenbruch"));
        places.add(new Place("Playground Flachsmarkt", "Flachsmarktstraße", "Blomberg"));
        places.add(new Place("Playground Donop", "Alte Chaussee", "Donop"));
        places.add(new Place("Playground Bextenstraße", "Bextenstraße", "Blomberg"));
        places.add(new Place("Playground Cappel Wehmekamp", "Wehmekamp", "Cappel"));
        places.add(new Place("Playground Berliner Straße", "Berliner Straße", "Blomberg"));
        places.add(new Place("Playground Cappel Lilienweg", "Lilienweg", "Cappel"));
        places.add(new Place("Playground Brüntrup", "Am Gökerkamp", "Brüntrup"));
        places.add(new Place("Playground Altendonop", "Zum Kespohl", "Altendonop"));

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
