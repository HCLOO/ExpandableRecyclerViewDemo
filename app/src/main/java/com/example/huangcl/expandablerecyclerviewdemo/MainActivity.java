package com.example.huangcl.expandablerecyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import static com.example.huangcl.expandablerecyclerviewdemo.DataManager.makeCardGroups;
import static com.example.huangcl.expandablerecyclerviewdemo.DataManager.makeEcdGroups;
import static com.example.huangcl.expandablerecyclerviewdemo.DataManager.makeRecruitGroups;
import static com.example.huangcl.expandablerecyclerviewdemo.DataManager.makeTransGroups;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView,recyclerView1,recyclerView2,recyclerView3;
    ExpandableAdapter adapter,adapter1,adapter2,adapter3;
    RecyclerView.ItemAnimator animator;
    LinearLayoutManager layoutManager,layoutManager1,layoutManager2,layoutManager3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.rv_ecdlifes);
        animator = recyclerView.getItemAnimator();
        if (animator instanceof DefaultItemAnimator) {
            ((DefaultItemAnimator) animator).setSupportsChangeAnimations(false);
        }
        layoutManager = new LinearLayoutManager(this);
        adapter = new ExpandableAdapter(makeEcdGroups());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        recyclerView1 = (RecyclerView) findViewById(R.id.rv_recruit);
        animator = recyclerView1.getItemAnimator();
        if (animator instanceof DefaultItemAnimator) {
            ((DefaultItemAnimator) animator).setSupportsChangeAnimations(false);
        }
        layoutManager1 = new LinearLayoutManager(this);
        adapter1 = new ExpandableAdapter(makeRecruitGroups());
        recyclerView1.setLayoutManager(layoutManager1);
        recyclerView1.setAdapter(adapter1);

        recyclerView2 = (RecyclerView) findViewById(R.id.rv_card);
        animator = recyclerView2.getItemAnimator();
        if (animator instanceof DefaultItemAnimator) {
            ((DefaultItemAnimator) animator).setSupportsChangeAnimations(false);
        }
        layoutManager2 = new LinearLayoutManager(this);
        adapter2 = new ExpandableAdapter(makeCardGroups());
        recyclerView2.setLayoutManager(layoutManager2);
        recyclerView2.setAdapter(adapter2);

        recyclerView3 = (RecyclerView) findViewById(R.id.rv_translator);
        animator = recyclerView3.getItemAnimator();
        if (animator instanceof DefaultItemAnimator) {
            ((DefaultItemAnimator) animator).setSupportsChangeAnimations(false);
        }
        layoutManager3 = new LinearLayoutManager(this);
        adapter3 = new ExpandableAdapter(makeTransGroups());
        recyclerView3.setLayoutManager(layoutManager3);
        recyclerView3.setAdapter(adapter3);
    }
}
