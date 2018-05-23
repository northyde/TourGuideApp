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

public class PlaygroundsFragment extends Fragment {
    ListView listView;

    public PlaygroundsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);
        // Content for the list
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("Playground Wöhren", "Lindenstraße", "Wöhren", R.drawable.woehren));
        places.add(new Place("Playground ehemalige Grundschule am Paradies", "Hölstenhöfener Straße 4", "Blomberg", R.drawable.ehemalige_grundschule_am_paradies));
        places.add(new Place("Playground Wellentrup", "Alte Ortsstraße", "Wellentrup", R.drawable.wellentrup));
        places.add(new Place("Playground Treptower Straße", "Treptower Straße", "Blomberg", R.drawable.treptower_strasse));
        places.add(new Place("Playground Höntrup", "Am Lietholz", "Höntrup", R.drawable.hoentrup));
        places.add(new Place("Playground Tegeler Straße", "Tegeler Straße", "Blomberg", R.drawable.tegeler_strasse));
        places.add(new Place("Playground Herrentrup", "Schwalbenweg", "Herrentrup", R.drawable.herrentrup));
        places.add(new Place("Playground Steinkuhle", "Gegerloh", "Blomberg", R.drawable.steinkuhle));
        places.add(new Place("Playground Grundschule Reelkirchen", "Fasanenweg", "Reelkirchen", R.drawable.grundschule_reelkirchen));
        places.add(new Place("Playground Saulsiek", "Bunerbergweg", "Blomberg", R.drawable.saulsiek));
        places.add(new Place("Playground Grundschule Istrup", "Detmolder Straße", "Istrup", R.drawable.grundschule_istrup));
        places.add(new Place("Playground Kita Zauberblume", "Neue Torstraße 114a", "Blomberg", R.drawable.kita_zauberblume));
        places.add(new Place("Playground Grundschule Großenmarpe", "Turnhallenstraße", "Großenmarpe", R.drawable.grundschule_grossenmarpe));
        places.add(new Place("Playground Gymnasium", "Ostring 14 ", "Blomberg", R.drawable.gymnasium));
        places.add(new Place("Playground Großenmarpe", "Am Pielberg", "Großenmarpe", R.drawable.grossenmarpe));
        places.add(new Place("Playground Grundschule Am Weinberg", "Schulstraße", "Blomberg", R.drawable.grundschule_am_weinberg));
        places.add(new Place("Playground Eschenbruch", "Winterbergstraße", "Eschenbruch", R.drawable.eschenbruch));
        places.add(new Place("Playground Flachsmarkt", "Flachsmarktstraße", "Blomberg", R.drawable.flachsmarkt));
        places.add(new Place("Playground Donop", "Alte Chaussee", "Donop", R.drawable.donop));
        places.add(new Place("Playground Bextenstraße", "Bextenstraße", "Blomberg", R.drawable.bextenstrasse));
        places.add(new Place("Playground Cappel Wehmekamp", "Wehmekamp", "Cappel", R.drawable.cappel_wehmekamp));
        places.add(new Place("Playground Berliner Straße", "Berliner Straße", "Blomberg", R.drawable.berliner_strasse));
        places.add(new Place("Playground Cappel Lilienweg", "Lilienweg", "Cappel", R.drawable.cappel_lilienweg));
        places.add(new Place("Playground Brüntrup", "Am Gökerkamp", "Brüntrup", R.drawable.bruentrup));
        places.add(new Place("Playground Altendonop", "Zum Kespohl", "Altendonop", R.drawable.altendonop));

        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places, R.color.category_Playgrounds);
        // Find list and apply custom adapter
        listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
