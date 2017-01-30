package com.resume.nico.myresume;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Nico on 1/26/2017.
 */

public class ProjectFragment extends Fragment implements View.OnClickListener {

    Button btnEcare, btnEmcat, btnEmpos, btnShutapp, btnTagcash, btnGofer, btnTag77, btnTaxph, btnTrainsph;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_project, container, false);
        btnEcare = (Button) view.findViewById(R.id.button_ecare);
        btnEmcat = (Button) view.findViewById(R.id.button_emcat);
        btnEmpos = (Button) view.findViewById(R.id.button_empos);
        btnShutapp = (Button) view.findViewById(R.id.button_shutapp);
        btnTagcash = (Button) view.findViewById(R.id.button_tagcash);
        btnGofer = (Button) view.findViewById(R.id.button_gofer);
        btnTag77 = (Button) view.findViewById(R.id.button_tag77);
        btnTaxph = (Button) view.findViewById(R.id.button_taxph);
        btnTrainsph = (Button) view.findViewById(R.id.button_trainsph);
        btnEcare.setOnClickListener(this);
        btnEmcat.setOnClickListener(this);
        btnEmpos.setOnClickListener(this);
        btnShutapp.setOnClickListener(this);
        btnTagcash.setOnClickListener(this);
        btnGofer.setOnClickListener(this);
        btnTag77.setOnClickListener(this);
        btnTaxph.setOnClickListener(this);
        btnTrainsph.setOnClickListener(this);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_ecare:
                openUrl("http://www.ecare.be/about");
                break;
            case R.id.button_emcat:
                openUrl("https://www.empathy.co.jp/eng/product/p_em10.php");
                break;
            case R.id.button_empos:
                openUrl("https://www.empathy.co.jp/eng/saas/pos.php");
                break;
            case R.id.button_shutapp:
                Toast.makeText(this.getContext(), "App is not yet available", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_tagcash:
                openUrl("https://tagcash.com/");
                break;
            case R.id.button_gofer:
                openUrl("http://www.goferbike.com/");
                break;
            case R.id.button_tag77:
                openUrl("http://tag77.com/");
                break;
            case R.id.button_taxph:
                openUrl("https://play.google.com/store/apps/details?id=com.itseasyright.app.taxphcalculator&hl=en");
                break;
            case R.id.button_trainsph:
                openUrl("https://play.google.com/store/search?q=trainsph&c=apps&hl=en");
                break;
        }
    }

    public void openUrl(String url) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}
