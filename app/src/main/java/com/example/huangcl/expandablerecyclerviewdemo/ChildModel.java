package com.example.huangcl.expandablerecyclerviewdemo;

import android.os.Parcel;
import android.os.Parcelable;

public class ChildModel implements Parcelable {

    private String childText;

    public ChildModel(String childText) {
        this.childText = childText;
    }

    protected ChildModel(Parcel in) {
        childText = in.readString();
    }

    public String getName() {
        return childText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ChildModel)) return false;
        ChildModel artist = (ChildModel) o;
        return getName() != null ? getName().equals(artist.getName()) : artist.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        return result;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(childText);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<ChildModel> CREATOR = new Creator<ChildModel>() {
        @Override
        public ChildModel createFromParcel(Parcel in) {
            return new ChildModel(in);
        }

        @Override
        public ChildModel[] newArray(int size) {
            return new ChildModel[size];
        }
    };
}
