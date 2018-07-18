package com.example.huangcl.expandablerecyclerviewdemo;

import android.view.View;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

public class MyChildViewHolder extends ChildViewHolder {

    private TextView childContentView;

    public MyChildViewHolder(View itemView) {
        super(itemView);
        childContentView = (TextView) itemView.findViewById(R.id.tv_content_child);
    }

    public void setChildContent(String name) {
        childContentView.setText(name);
    }
}

