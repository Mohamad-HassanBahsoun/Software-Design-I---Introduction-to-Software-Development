package MISPractice;

public class Circle {

    Point center;
    double r;

    public Circle(Point p, double r){
        this.center=p;
        this.r=r;
    }

    public Point getCenter(){
        return center;
    }

    public double getRadius(){
        return r;
    }

    public void setRadius(double x){
        this.r = x;
    }

    public void translate(double x, double y){
        center.translate(x,y);
    }
}
