package com.example.showbeacons.ui.main.beacons;



import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.showbeacons.R;

public class BeaconsFragment extends Fragment {

    private Context context;

    @NonNull
    public static BeaconsFragment newInstance() {

        return new BeaconsFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_beacons, container, false);
        context = getActivity();
        return view;
    }
}