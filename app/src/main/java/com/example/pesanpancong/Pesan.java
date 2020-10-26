package com.example.pesanpancong;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;

import com.example.pesanpancong.databinding.FragmentPesanBinding;


public class Pesan extends Fragment {
    public Pesan() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final FragmentPesanBinding bind = FragmentPesanBinding.inflate(inflater, container, false);
        final View view = bind.getRoot();
        final Pemesanan pemesanan = new Pemesanan();

        bind.radioBawa.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    pemesanan.setViewBawa("Bawa Pulang");
                }
            }
        });

        bind.radioDisini.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    pemesanan.setViewBawa("Makan Disini");
                }
            }
        });

        bind.buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bund = new Bundle();

                bund.putString("nama", bind.editNama.getText().toString());

                if(bind.radioBawa.isChecked()){
                    bund.putString("bawa", bind.radioBawa.getText().toString());
                }else{
                    bund.putString("bawa", bind.radioDisini.getText().toString());
                }

                bund.putString("pancong", bind.spinnerPancong.getSelectedItem().toString());

                if (bind.checkCoklat.isChecked()){
                    bund.putString("coklat", "Pakai Coklat");
                } else if (!bind.checkCoklat.isChecked()) {
                    bund.putString("coklat", "Tidak Pakai Coklat");
                }

                if (bind.checkKeju.isChecked()){
                    bund.putString("keju", "Pakai Keju");
                } else if (!bind.checkKeju.isChecked()) {
                    bund.putString("keju", "Tidak Pakai Keju");
                }

                if (bind.checkKacang.isChecked()){
                    bund.putString("kacang", "Pakai Kacang");
                } else if (!bind.checkKacang.isChecked()) {
                    bund.putString("kacang", "Tidak Pakai Kacang");
                }

                if (bind.checkOreo.isChecked()){
                    bund.putString("oreo", "Pakai Oreo");
                } else if (!bind.checkOreo.isChecked()) {
                    bund.putString("oreo", "Tidak Pakai Oreo");
                }
                Navigation.findNavController(view).navigate(R.id.action_pesan_to_detail, bund);
            }
        });


        return view;
    }
}