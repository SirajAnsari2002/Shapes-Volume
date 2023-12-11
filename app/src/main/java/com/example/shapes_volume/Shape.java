package com.example.shapes_volume;

public class Shape {
    String shape_name;
    int image_source;

    public Shape(String shape_name, int image_source) {
        this.shape_name = shape_name;
        this.image_source = image_source;
    }

    public String getShape_name() {
        return shape_name;
    }

    public int getImage_source() {
        return image_source;
    }

    public void setShape_name(String shape_name) {
        this.shape_name = shape_name;
    }

    public void setImage_source(int image_source) {
        this.image_source = image_source;
    }
}
