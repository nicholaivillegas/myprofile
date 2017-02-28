package com.resume.nico.myresume;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nico on 1/26/2017.
 */

public class SkillFragment extends Fragment {

    PieChart mChart;
    TextView textSkillTitle;
    LinearLayout linearMultimedia, linearProfessional, linearProfessional1, linearProfessional2, linearSystem, linearApp,linearApp1,linearApp2;
    ImageView imageMaterial;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_skill, container, false);
        mChart = (PieChart) view.findViewById(R.id.pie_chart);
        imageMaterial = (ImageView) view.findViewById(R.id.image_material);
        linearMultimedia = (LinearLayout) view.findViewById(R.id.linear_multimedia);
        linearProfessional = (LinearLayout) view.findViewById(R.id.linear_professional);
        linearProfessional1 = (LinearLayout) view.findViewById(R.id.linear_professional1);
        linearProfessional2 = (LinearLayout) view.findViewById(R.id.linear_professional2);
        linearSystem = (LinearLayout) view.findViewById(R.id.linear_system_analysis);
        linearApp = (LinearLayout) view.findViewById(R.id.linear_app);
        linearApp1 = (LinearLayout) view.findViewById(R.id.linear_app1);
        linearApp2 = (LinearLayout) view.findViewById(R.id.linear_app2);
        textSkillTitle = (TextView) view.findViewById(R.id.text_skill_title);

        Description desc = new Description();
        desc.setText("");
//        desc.setTextSize(20);
        mChart.setDescription(desc);

        final List<PieEntry> entries = new ArrayList<>();
        entries.add(new PieEntry(10f, "UI/UX Design", 0));
        entries.add(new PieEntry(10f, "App Development", 1));
        entries.add(new PieEntry(10f, "System Analysis", 2));
        entries.add(new PieEntry(10f, "Professional Skills", 3));
        PieDataSet dataset = new PieDataSet(entries, "");
        dataset.setColors(ColorTemplate.PASTEL_COLORS);
        dataset.setHighlightEnabled(true);
        Legend l = mChart.getLegend();
        l.setVerticalAlignment(Legend.LegendVerticalAlignment.CENTER);
        l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.CENTER);
        l.setOrientation(Legend.LegendOrientation.VERTICAL);
        l.setDrawInside(true);
        PieData data = new PieData(dataset);
        data.setValueTextColor(Color.WHITE);
        data.setValueTextSize(0);
        mChart.setData(data);
        mChart.animateXY(1000, 1000);
        mChart.setEntryLabelTextSize(10);
//        mChart.setUsePercentValues(true);
        mChart.setOnChartValueSelectedListener(new OnChartValueSelectedListener() {
            @Override
            public void onValueSelected(Entry e, Highlight h) {
                String index = e.getData().toString();
                String label = entries.get(Integer.parseInt(index)).getLabel();
                textSkillTitle.setText(label);

                switch (label) {
                    case "App Development":
                        linearMultimedia.setVisibility(View.GONE);
                        linearSystem.setVisibility(View.GONE);
                        linearProfessional.setVisibility(View.GONE);
                        linearProfessional1.setVisibility(View.GONE);
                        linearProfessional2.setVisibility(View.GONE);
                        linearApp.setVisibility(View.VISIBLE);
                        linearApp1.setVisibility(View.VISIBLE);
                        linearApp2.setVisibility(View.VISIBLE);
                        imageMaterial.setVisibility(View.GONE);
                        break;
                    case "System Analysis":
                        linearMultimedia.setVisibility(View.GONE);
                        linearSystem.setVisibility(View.VISIBLE);
                        linearProfessional.setVisibility(View.GONE);
                        linearProfessional1.setVisibility(View.GONE);
                        linearProfessional2.setVisibility(View.GONE);
                        linearApp.setVisibility(View.GONE);
                        linearApp1.setVisibility(View.GONE);
                        linearApp2.setVisibility(View.GONE);
                        imageMaterial.setVisibility(View.GONE);
                        break;
                    case "UI/UX Design":
                        linearMultimedia.setVisibility(View.VISIBLE);
                        linearSystem.setVisibility(View.GONE);
                        linearProfessional.setVisibility(View.GONE);
                        linearProfessional1.setVisibility(View.GONE);
                        linearProfessional2.setVisibility(View.GONE);
                        linearApp.setVisibility(View.GONE);
                        linearApp1.setVisibility(View.GONE);
                        linearApp2.setVisibility(View.GONE);
                        imageMaterial.setVisibility(View.VISIBLE);
                        break;
                    case "Professional Skills":
                        linearMultimedia.setVisibility(View.GONE);
                        linearSystem.setVisibility(View.GONE);
                        linearProfessional.setVisibility(View.VISIBLE);
                        linearProfessional1.setVisibility(View.VISIBLE);
                        linearProfessional2.setVisibility(View.VISIBLE);
                        linearApp.setVisibility(View.GONE);
                        linearApp1.setVisibility(View.GONE);
                        linearApp2.setVisibility(View.GONE);
                        imageMaterial.setVisibility(View.GONE);
                        break;
                }

            }

            @Override
            public void onNothingSelected() {

            }
        });
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
