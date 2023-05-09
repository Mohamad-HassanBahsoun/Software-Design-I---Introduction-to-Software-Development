package MISPractice;

public class Line {

    Point end;
    Point start;

    public Line(Point start, Point end){
        this.start=start;
        this.end=end;
    }

    public void translateX(double x){
        start.translateX(x);
        end.translateX(x);
    }

    public void translateY(double y){
        start.translateX(y);
        end.translateX(y);
    }

    public double length(){
        return start.distanceFrom(end);
    }

    Point p1 = new Point(0,0);

}
