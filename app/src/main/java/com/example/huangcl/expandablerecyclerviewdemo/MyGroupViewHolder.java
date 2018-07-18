package com.example.huangcl.expandablerecyclerviewdemo;

import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

import static android.view.animation.Animation.RELATIVE_TO_SELF;

public class MyGroupViewHolder extends GroupViewHolder {

    private TextView groupTitle;
    private ImageView icon;
    private LinearLayout groupItemLayout;

    public MyGroupViewHolder(View itemView) {
        super(itemView);
        groupTitle = (TextView) itemView.findViewById(R.id.tv_group_title);
        icon = (ImageView) itemView.findViewById(R.id.iv_group_display);
        groupItemLayout=(LinearLayout) itemView.findViewById(R.id.ll_group_item);
    }

    public void setGroupContent(ExpandableGroup genre) {
            groupTitle.setText(genre.getTitle());
    }

    @Override
    public void expand() {
        icon.setVisibility(View.VISIBLE);
        groupItemLayout.setBackgroundColor(0xFFFAEAEA);
    }

    @Override
    public void collapse() {
        icon.setVisibility(View.GONE);
        groupItemLayout.setBackgroundColor(0xFFFFFFFF);
    }
}
