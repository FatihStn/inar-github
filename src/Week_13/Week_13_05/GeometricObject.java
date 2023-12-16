package Week_13.Week_13_05;

import java.util.Date;

public abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    protected GeometricObject(){
        dateCreated = new Date();
    }
    protected GeometricObject(String color, boolean filled){
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    public String toString(){
        return "created on" + dateCreated + "\ncolor: " + color + "\nFilled: " + filled;
    }
    public abstract double getArea();
    public  abstract double getPerimeter();


    public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
        if (o2.getArea() > o1.getArea()) {
            return o2;
        } else {
            return o1;
        }
    }

}