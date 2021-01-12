package com.example.showbeacons.ui.main.beacons;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.showbeacons.databinding.FragmentBeaconsBinding;

public class BeaconsFragment extends Fragment {

    private FragmentBeaconsBinding binding;

    @NonNull
    public static BeaconsFragment newInstance() {

        return new BeaconsFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentBeaconsBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.search.setOnClickListener(v -> {

        });
        binding.clean.setOnClickListener(v -> {

        });
        binding.stop.setOnClickListener(v -> {

        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}