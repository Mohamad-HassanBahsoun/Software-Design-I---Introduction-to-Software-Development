package MISPractice;

public class Point {

    double x;
    double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public void setX(double x){
        this.x=x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void translateX(double x){
        this.x +=x;
    }

    public void translateY(double y){
        this.y+=y;
    }

    public void translate(double x, double y){
        translateX(x);
        translateY(y);
    }

    public double distanceFrom(Point p){
        return (Math.sqrt(Math.pow(x-p.getX(),2) + Math.pow(y-p.getY(),2)));
    }
}
