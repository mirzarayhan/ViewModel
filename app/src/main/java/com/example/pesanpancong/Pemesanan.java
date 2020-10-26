package com.example.pesanpancong;

import android.os.Parcel;
import android.os.Parcelable;

public class Pemesanan implements Parcelable {
    private String viewName, viewBawa, viewPancong, viewCoklat, viewKeju, viewKacang, viewOreo;

    public Pemesanan(String viewName, String viewBawa, String viewPancong, String viewCoklat, String viewKeju, String viewKacang, String viewOreo) {
        this.viewName = viewName;
        this.viewBawa = viewBawa;
        this.viewPancong = viewPancong;
        this.viewCoklat = viewCoklat;
        this.viewKeju = viewKeju;
        this.viewKacang = viewKacang;
        this.viewOreo = viewOreo;
    }

    public Pemesanan() {

    }

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    public String getViewBawa() {
        return viewBawa;
    }

    public void setViewBawa(String viewBawa) {
        this.viewBawa = viewBawa;
    }

    public String getViewPancong() {
        return viewPancong;
    }

    public void setViewPancong(String viewPancong) {
        this.viewPancong = viewPancong;
    }

    public String getViewCoklat() {
        return viewCoklat;
    }

    public void setViewCoklat(String viewCoklat) {
        this.viewCoklat = viewCoklat;
    }

    public String getViewKeju() {
        return viewKeju;
    }

    public void setViewKeju(String viewKeju) {
        this.viewKeju = viewKeju;
    }

    public String getViewKacang() {
        return viewKacang;
    }

    public void setViewKacang(String viewKacang) {
        this.viewKacang = viewKacang;
    }

    public String getViewOreo() {
        return viewOreo;
    }

    public void setViewOreo(String viewOreo) {
        this.viewOreo = viewOreo;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.viewName);
        dest.writeString(this.viewBawa);
        dest.writeString(this.viewPancong);
        dest.writeString(this.viewCoklat);
        dest.writeString(this.viewKeju);
        dest.writeString(this.viewKacang);
        dest.writeString(this.viewOreo);
    }

    protected Pemesanan(Parcel in) {
        this.viewName = in.readString();
        this.viewBawa = in.readString();
        this.viewPancong = in.readString();
        this.viewCoklat = in.readString();
        this.viewKeju = in.readString();
        this.viewKacang = in.readString();
        this.viewOreo = in.readString();
    }

    public static final Creator<Pemesanan> CREATOR = new Creator<Pemesanan>() {
        @Override
        public Pemesanan createFromParcel(Parcel source) {
            return new Pemesanan(source);
        }

        @Override
        public Pemesanan[] newArray(int size) {
            return new Pemesanan[size];
        }
    };
}
