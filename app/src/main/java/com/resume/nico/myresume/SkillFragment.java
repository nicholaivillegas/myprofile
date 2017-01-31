package com.resume.nico.myresume;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nico on 1/26/2017.
 */

public class SkillFragment extends Fragment {

    PieChart mChart;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_skill, container, false);
        mChart = (PieChart) view.findViewById(R.id.pie_chart);
        Description desc = new Description();
        desc.setText("Pinakapogi");
//        desc.setTextAlign(Paint.Align.LEFT);
//        desc.setPosition(200,700);
        desc.setTextSize(20);
        mChart.setDescription(desc);
        List<PieEntry> entries = new ArrayList<>();
        entries.add(new PieEntry(4f, "Mark", 0));
        entries.add(new PieEntry(8f, "Oli", 1));
        entries.add(new PieEntry(6f, "Dione", 2));
        entries.add(new PieEntry(12f, "Jovi", 3));
        entries.add(new PieEntry(50f, "Nico", 4));
        PieDataSet dataset = new PieDataSet(entries, "# Poginess");
        dataset.setColors(ColorTemplate.PASTEL_COLORS);
        PieData data = new PieData(dataset);
        mChart.setData(data);
        mChart.animateY(3000);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
