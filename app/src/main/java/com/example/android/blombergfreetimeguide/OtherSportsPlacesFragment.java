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

public class OtherSportsPlacesFragment extends Fragment {
    ListView listView;

    public OtherSportsPlacesFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);
        //Content for the list
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("Indoor Riding Arena", "Alte Chaussee 8", "Donop"));
        places.add(new Place("Golf", "Huxoll 14", "Cappel"));
        places.add(new Place("Minigolf", "Walkenmühle 12", "Blomberg"));
        places.add(new Place("Glider Airfield", "Nessenbergstraße 6", "Blomberg"));
        places.add(new Place("Shooting Ground", "Winterbergstraße 68", "Eschenbruch"));
        places.add(new Place("Shooting Ground", "Rote Kuhle 3 ", "Großenmarpe"));
        places.add(new Place("Shooting Ground", "Am der Blomberger Straße", "Istrup"));
        places.add(new Place("Shooting Ground", "Ostring 35", "Blomberg"));
        places.add(new Place("Indoor Tennis Court", "Nederlandstraße 8", "Blomberg"));
        places.add(new Place("Tennis Court", "Am Friedhof", "Cappel"));
        places.add(new Place("Tennis Court", "Finkenweg 13 ", "Herrentrup"));
        places.add(new Place("Tennis Court", "Wesselweg", "Blomberg"));

        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places, R.color.category_OtherSportsPlaces);
        // Find list and apply custom adapter
        listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
