package com.resume.nico.myresume;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Nico on 1/26/2017.
 */

public class ExperienceFragment extends Fragment {

    CardView cardViewVillegas, cardViewTagcash, cardViewEmpathy, cardViewEcare;
    TextView txtTrains, txtTax, txtEcare;
    LinearLayout linearTagcash, linearEmpathy;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_experience, container, false);
        cardViewVillegas = (CardView) view.findViewById(R.id.card_villegas);
        cardViewTagcash = (CardView) view.findViewById(R.id.card_tagcash);
        cardViewEmpathy = (CardView) view.findViewById(R.id.card_empathy);
        cardViewEcare = (CardView) view.findViewById(R.id.card_ecare);
        linearTagcash = (LinearLayout) view.findViewById(R.id.linear_tagcash);
        linearEmpathy = (LinearLayout) view.findViewById(R.id.linear_empathy);
        txtTrains = (TextView) view.findViewById(R.id.text_trainsph);
        txtTax = (TextView) view.findViewById(R.id.text_taxph);
        txtEcare = (TextView) view.findViewById(R.id.text_ecare);
        cardViewVillegas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtTrains.getVisibility() == View.GONE) {
                    txtTrains.setVisibility(View.VISIBLE);
                    txtTax.setVisibility(View.VISIBLE);
                } else {
                    txtTrains.setVisibility(View.GONE);
                    txtTax.setVisibility(View.GONE);
                }

            }
        });

        cardViewTagcash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (linearTagcash.getVisibility() == View.GONE) {
                    linearTagcash.setVisibility(View.VISIBLE);
                } else {
                    linearTagcash.setVisibility(View.GONE);
                }

            }
        });

        cardViewEmpathy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (linearEmpathy.getVisibility() == View.GONE) {
                    linearEmpathy.setVisibility(View.VISIBLE);
                } else {
                    linearEmpathy.setVisibility(View.GONE);
                }

            }
        });

        cardViewEcare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtEcare.getVisibility() == View.GONE) {
                    txtEcare.setVisibility(View.VISIBLE);
                } else {
                    txtEcare.setVisibility(View.GONE);
                }

            }
        });
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
