package com.amigoscode._3_oop._6_solid;

public class ImmutableRectangle implements LspShape{

    private final int width;
    private final int height;

    public ImmutableRectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public int area() {
        return height * width;
    }
}
