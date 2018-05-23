package com.example.android.blombergfreetimeguide;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Michaela on 16.05.2018.
 */

public class SportsFieldsFragment extends Fragment {
    ListView listView;

    public SportsFieldsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);
        // Content for the list
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("Playingfield Oberes Bruch", "Paradies", "Blomberg"));
        places.add(new Place("Playingfield Brüntrup", "Wehrener Straße", "Brüntrup"));
        places.add(new Place("Playingfield Cappel", "Am Friedhof", "Cappel"));
        places.add(new Place("Playingfield Donop", "Im Ort", "Donop"));
        places.add(new Place("Playingfield Großenmarpe", "Am Sportplatz", "Großenmarpe"));
        places.add(new Place("Playingfield Istrup", "Detmolder Straße", "Istrup"));
        places.add(new Place("Stadium Am Rammbocke", "Am Rammbocke 20", "Blomberg"));
        places.add(new Place("Track and Field Schulzentrum", "Ulmenallee", "Blomberg"));
        places.add(new Place("Football ground Bexten", "Bextenstraße", "Blomberg"));
        places.add(new Place("Football ground Eschenbruch", "Winterbergstraße", "Eschenbruch"));
        places.add(new Place("Football ground Flachsmarkt", "Flachsmarktstraße", "Blomberg"));
        places.add(new Place("Football ground Gergeloh", "Gergeloh", "Blomberg"));
        places.add(new Place("Football ground Grundschule Reelkirchen", "Fasanenweg", "Reelkirchen"));
        places.add(new Place("Football ground Grunewalder Straße", "Grunewalder Straße", "Blomberg"));
        places.add(new Place("Football ground Jugendzentrum", "Am Paradies", "Blomberg"));
        places.add(new Place("Football ground Tintrup", "Maper Straße", "Tintrup"));
        places.add(new Place("Football ground Wellentrup", "Am Mühlenfeld", "Wellentrup"));
        places.add(new Place("Football ground Cappel", "Lilienweg", "Cappel"));

        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places, R.color.category_SportsFields);
        // Find list and apply custom adapter
        listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
