package com.example.pesanpancong;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pesanpancong.databinding.FragmentDetailBinding;
import com.example.pesanpancong.databinding.FragmentPesanBinding;

public class Detail extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final FragmentDetailBinding bind = FragmentDetailBinding.inflate(inflater, container, false);
        final View view = bind.getRoot();

        bind.viewNama.setText(getArguments().getString("nama"));
        bind.viewBawa.setText(getArguments().getString("bawa"));
        bind.viewPancong.setText(getArguments().getString("pancong"));
        bind.viewCoklat.setText(getArguments().getString("coklat"));
        bind.viewKeju.setText(getArguments().getString("keju"));
        bind.viewKacang.setText(getArguments().getString("kacang"));
        bind.viewOreo.setText(getArguments().getString("oreo"));

        return view;


    }
}