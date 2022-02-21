package com.company;

public class Point {
    private int x;
    private int y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        double distance = (double) Math.sqrt( ((0-x)*(0-x)) + ((0-y)*(0-y)));
        return distance;

    }
    public double distance(int x, int y) {
        double distance = (double) Math.sqrt( ((x-this.x)*(x-this.x)) + ((y-this.y)*(y-this.y)) );
        return distance;
    }
    public double distance(Point otherPoint) {
        double distance = (double) Math.sqrt( ((otherPoint.getX()-this.x)*(otherPoint.getX()-this.x)) + ((otherPoint.getY()-this.y)*(otherPoint.getY()-this.y)));
        return distance;
    }

}
