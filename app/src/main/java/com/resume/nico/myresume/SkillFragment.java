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
import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nico on 1/26/2017.
 */

public class SkillFragment extends Fragment {

    PieChart mChart;
    TextView textSkillTitle;
    LinearLayout linearFirst, linearSecond, linearThird, linearThird1, linearThird2, linearFourth, linearFifth;
    ImageView imageMaterial, image1, image2, image3, image4, image5, image6, image7, image8, image9, image10, image11, image12;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_skill, container, false);
        mChart = (PieChart) view.findViewById(R.id.pie_chart);
        imageMaterial = (ImageView) view.findViewById(R.id.image_material);
        image1 = (ImageView) view.findViewById(R.id.image1);
        image2 = (ImageView) view.findViewById(R.id.image2);
        image3 = (ImageView) view.findViewById(R.id.image3);
        image4 = (ImageView) view.findViewById(R.id.image4);
        image5 = (ImageView) view.findViewById(R.id.image5);
        image6 = (ImageView) view.findViewById(R.id.image6);
        image7 = (ImageView) view.findViewById(R.id.image7);
        image8 = (ImageView) view.findViewById(R.id.image8);
        image9 = (ImageView) view.findViewById(R.id.image9);
        image10 = (ImageView) view.findViewById(R.id.image10);
        image11 = (ImageView) view.findViewById(R.id.image11);
        image12 = (ImageView) view.findViewById(R.id.image12);
        imageMaterial = (ImageView) view.findViewById(R.id.image_material);
        linearFirst = (LinearLayout) view.findViewById(R.id.linear_first);
        linearSecond = (LinearLayout) view.findViewById(R.id.linear_second);
        linearThird = (LinearLayout) view.findViewById(R.id.linear_third);
        linearThird1 = (LinearLayout) view.findViewById(R.id.linear_third1);
        linearThird2 = (LinearLayout) view.findViewById(R.id.linear_third2);
        linearFourth = (LinearLayout) view.findViewById(R.id.linear_fourth);
        linearFifth = (LinearLayout) view.findViewById(R.id.linear_fifth);

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
                        linearFirst.setVisibility(View.VISIBLE);
                        linearSecond.setVisibility(View.VISIBLE);
//                        linearThird.setVisibility(View.VISIBLE);
                        linearThird1.setVisibility(View.GONE);
                        linearThird2.setVisibility(View.GONE);
                        linearFourth.setVisibility(View.VISIBLE);
                        linearFifth.setVisibility(View.VISIBLE);
                        imageMaterial.setVisibility(View.GONE);
                        Picasso.with(container.getContext())
                                .load(R.drawable.android_studio)
                                .resize(200, 200).memoryPolicy(MemoryPolicy.NO_CACHE)
                                .into(image1);
                        Picasso.with(container.getContext())
                                .load(R.drawable.github)
                                .resize(200, 200).memoryPolicy(MemoryPolicy.NO_CACHE)
                                .into(image2);
                        Picasso.with(container.getContext())
                                .load(R.drawable.firebase)
                                .resize(200, 200).memoryPolicy(MemoryPolicy.NO_CACHE)
                                .into(image3);
                        Picasso.with(container.getContext())
                                .load(R.drawable.xamarin)
                                .resize(200, 200).memoryPolicy(MemoryPolicy.NO_CACHE)
                                .into(image4);
                        Picasso.with(container.getContext())
                                .load(R.drawable.mercurial)
                                .resize(200, 200).memoryPolicy(MemoryPolicy.NO_CACHE)
                                .into(image5);
                        Picasso.with(container.getContext())
                                .load(R.drawable.visual_studio)
                                .resize(200, 200).memoryPolicy(MemoryPolicy.NO_CACHE)
                                .into(image6);
                        Picasso.with(container.getContext())
                                .load(R.drawable.windows)
                                .resize(200, 200).memoryPolicy(MemoryPolicy.NO_CACHE)
                                .into(image7);
                        Picasso.with(container.getContext())
                                .load(R.drawable.phonegap)
                                .resize(200, 200).memoryPolicy(MemoryPolicy.NO_CACHE)
                                .into(image8);
                        Picasso.with(container.getContext())
                                .load(R.drawable.jquery)
                                .resize(200, 200).memoryPolicy(MemoryPolicy.NO_CACHE)
                                .into(image9);
                        Picasso.with(container.getContext())
                                .load(R.drawable.sqlite)
                                .resize(200, 200).memoryPolicy(MemoryPolicy.NO_CACHE)
                                .into(image10);
                        Picasso.with(container.getContext())
                                .load(R.drawable.php_logo)
                                .resize(200, 200).memoryPolicy(MemoryPolicy.NO_CACHE)
                                .into(image11);
                        Picasso.with(container.getContext())
                                .load(R.drawable.fusetools)
                                .resize(200, 200).memoryPolicy(MemoryPolicy.NO_CACHE)
                                .into(image12);
                        break;
                    case "System Analysis":
                        linearFirst.setVisibility(View.VISIBLE);
                        linearSecond.setVisibility(View.GONE);
                        linearThird.setVisibility(View.GONE);
                        linearThird1.setVisibility(View.GONE);
                        linearThird2.setVisibility(View.GONE);
                        linearFourth.setVisibility(View.GONE);
                        linearFifth.setVisibility(View.GONE);
                        imageMaterial.setVisibility(View.GONE);
                        Picasso.with(container.getContext())
                                .load(R.drawable.project)
                                .resize(200, 200).memoryPolicy(MemoryPolicy.NO_CACHE)
                                .into(image1);

                        Picasso.with(container.getContext())
                                .load(R.drawable.office)
                                .resize(300, 150).memoryPolicy(MemoryPolicy.NO_CACHE)
                                .into(image2);

                        Picasso.with(container.getContext())
                                .load(R.drawable.visio)
                                .resize(200, 200).memoryPolicy(MemoryPolicy.NO_CACHE)
                                .into(image3);
                        break;
                    case "UI/UX Design":

                        linearFirst.setVisibility(View.VISIBLE);
                        linearSecond.setVisibility(View.GONE);
                        linearThird.setVisibility(View.GONE);
                        linearThird1.setVisibility(View.GONE);
                        linearThird2.setVisibility(View.GONE);
                        linearFourth.setVisibility(View.GONE);
                        linearFifth.setVisibility(View.GONE);
                        imageMaterial.setVisibility(View.VISIBLE);

                        Picasso.with(container.getContext())
                                .load(R.drawable.google_material)
                                .resize(590, 150).memoryPolicy(MemoryPolicy.NO_CACHE)
                                .into(imageMaterial);

                        Picasso.with(container.getContext())
                                .load(R.drawable.adobe_flash)
                                .resize(255, 200).memoryPolicy(MemoryPolicy.NO_CACHE)
                                .into(image1);

                        Picasso.with(container.getContext())
                                .load(R.drawable.lightroom)
                                .resize(255, 200).memoryPolicy(MemoryPolicy.NO_CACHE)
                                .into(image2);

                        Picasso.with(container.getContext())
                                .load(R.drawable.photoshop)
                                .resize(255, 200).memoryPolicy(MemoryPolicy.NO_CACHE)
                                .into(image3);

                        break;
                    case "Professional Skills":
                        linearFirst.setVisibility(View.GONE);
                        linearSecond.setVisibility(View.GONE);
                        linearThird.setVisibility(View.VISIBLE);
                        linearThird1.setVisibility(View.VISIBLE);
                        linearThird2.setVisibility(View.VISIBLE);
                        linearFourth.setVisibility(View.GONE);
                        linearFifth.setVisibility(View.GONE);
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
