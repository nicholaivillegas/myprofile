package com.resume.nico.myresume;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Nico on 1/26/2017.
 */

public class ExperienceFragment extends Fragment implements View.OnClickListener {

    CardView cardViewVillegas, cardViewTagcash, cardViewEmpathy, cardViewEcare;
    TextView txtTrains, txtTax, txtEcare;
    LinearLayout linearTagcash, linearEmpathy;
    ImageButton buttonMore1, buttonLess1, buttonMore2, buttonLess2, buttonMore3, buttonLess3, buttonMore4, buttonLess4;

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
        buttonMore1 = (ImageButton) view.findViewById(R.id.button_expand_more);
        buttonLess1 = (ImageButton) view.findViewById(R.id.button_expand_less);
        buttonMore2 = (ImageButton) view.findViewById(R.id.button_expand_more2);
        buttonLess2 = (ImageButton) view.findViewById(R.id.button_expand_less2);
        buttonMore3 = (ImageButton) view.findViewById(R.id.button_expand_more3);
        buttonLess3 = (ImageButton) view.findViewById(R.id.button_expand_less3);
        buttonMore4 = (ImageButton) view.findViewById(R.id.button_expand_more4);
        buttonLess4 = (ImageButton) view.findViewById(R.id.button_expand_less4);

        cardViewVillegas.setOnClickListener(this);
        cardViewTagcash.setOnClickListener(this);
        cardViewEmpathy.setOnClickListener(this);
        cardViewEcare.setOnClickListener(this);
        buttonMore1.setOnClickListener(this);
        buttonLess1.setOnClickListener(this);
        buttonMore2.setOnClickListener(this);
        buttonLess2.setOnClickListener(this);
        buttonMore3.setOnClickListener(this);
        buttonLess3.setOnClickListener(this);
        buttonMore4.setOnClickListener(this);
        buttonLess4.setOnClickListener(this);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    public void hideShowVillegas() {
        if (txtTrains.getVisibility() == View.GONE) {
            txtTrains.setVisibility(View.VISIBLE);
            txtTax.setVisibility(View.VISIBLE);
            buttonLess1.setVisibility(View.VISIBLE);
            buttonMore1.setVisibility(View.GONE);
        } else {
            txtTrains.setVisibility(View.GONE);
            txtTax.setVisibility(View.GONE);
            buttonLess1.setVisibility(View.GONE);
            buttonMore1.setVisibility(View.VISIBLE);
        }
    }

    public void hideShowTagcash() {
        if (linearTagcash.getVisibility() == View.GONE) {
            linearTagcash.setVisibility(View.VISIBLE);
            buttonLess2.setVisibility(View.VISIBLE);
            buttonMore2.setVisibility(View.GONE);
        } else {
            linearTagcash.setVisibility(View.GONE);
            buttonLess2.setVisibility(View.GONE);
            buttonMore2.setVisibility(View.VISIBLE);
        }
    }

    public void hideShowEmpathy() {
        if (linearEmpathy.getVisibility() == View.GONE) {
            linearEmpathy.setVisibility(View.VISIBLE);
            buttonLess3.setVisibility(View.VISIBLE);
            buttonMore3.setVisibility(View.GONE);
        } else {
            linearEmpathy.setVisibility(View.GONE);
            buttonLess3.setVisibility(View.GONE);
            buttonMore3.setVisibility(View.VISIBLE);
        }
    }

    public void hideShowEcare() {
        if (txtEcare.getVisibility() == View.GONE) {
            txtEcare.setVisibility(View.VISIBLE);
            buttonLess4.setVisibility(View.VISIBLE);
            buttonMore4.setVisibility(View.GONE);
        } else {
            txtEcare.setVisibility(View.GONE);
            buttonLess4.setVisibility(View.GONE);
            buttonMore4.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.card_villegas:
            case R.id.button_expand_more:
            case R.id.button_expand_less:
                hideShowVillegas();
                break;
            case R.id.card_tagcash:
            case R.id.button_expand_more2:
            case R.id.button_expand_less2:
                hideShowTagcash();
                break;
            case R.id.card_empathy:
            case R.id.button_expand_more3:
            case R.id.button_expand_less3:
                hideShowEmpathy();
                break;
            case R.id.card_ecare:
            case R.id.button_expand_more4:
            case R.id.button_expand_less4:
                hideShowEcare();
                break;
        }
    }
}
