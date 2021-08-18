package com.wsr.wsr_diagramms;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import org.eazegraph.lib.charts.BarChart;
import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.charts.ValueLineChart;
import org.eazegraph.lib.models.BarModel;
import org.eazegraph.lib.models.PieModel;
import org.eazegraph.lib.models.ValueLinePoint;
import org.eazegraph.lib.models.ValueLineSeries;

public class MainActivity extends AppCompatActivity {
    private PieChart pc;
    private BarChart bc;
    private ValueLineChart lc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        init_pie();
        init_bar();
        init_line();
    }
    private void init(){
        pc = findViewById(R.id.pc);
        bc = findViewById(R.id.barChart);
        lc = findViewById(R.id.lc);
    }
    private void init_pie(){
        pc.addPieSlice(new PieModel("Free time", 15, Color.parseColor("#FE6DA8")));
        pc.addPieSlice(new PieModel("Sleep", 25, Color.parseColor("#56B7F1")));
        pc.addPieSlice(new PieModel("Work", 35, Color.parseColor("#CDA67F")));

        pc.startAnimation();
    }
    private void init_bar(){
        bc.addBar(new BarModel("Lamp", (float) 50.1, Color.parseColor("#858585")));
        bc.addBar(new BarModel((float) 75, Color.parseColor("#000000")));
        bc.startAnimation();
    }
    private void init_line(){
        ValueLineSeries valueLineSeries = new ValueLineSeries();
        valueLineSeries.setColor(R.color.green);
        valueLineSeries.addPoint(new ValueLinePoint("Jan", 2.4f));
        valueLineSeries.addPoint(new ValueLinePoint(30f));
        lc.addSeries(valueLineSeries);
        lc.startAnimation();
    }
}