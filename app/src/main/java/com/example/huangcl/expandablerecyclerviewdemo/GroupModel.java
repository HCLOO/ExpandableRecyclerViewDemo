package com.example.huangcl.expandablerecyclerviewdemo;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import java.util.List;

public class GroupModel extends ExpandableGroup<ChildModel> {

    public GroupModel(String groupTitle, List<ChildModel> childItem) {
        super(groupTitle, childItem);
    }
}
