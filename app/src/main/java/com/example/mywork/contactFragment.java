package com.example.mywork;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link contactFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link contactFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class contactFragment extends Fragment {

    public contactFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contact, container, false);
    }

}
