package src.review;

/**
 *
 * Created by Fantasy on 2016/12/13.
 */
public class distancePoint {
    public static class Point {
        double x, y, z;
         Point(double x,double y,double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
        void setX(double x,double y , double z){
             this.x = x;
             this.y = y;
             this.z = z;
        }
        double getDistance(Point p){
            return(p.x - x)*(p.x - x)+(p.y - y)*(p.y - y)+(p.z - z)*(p.z - z);
        }
    }
    public static void main(String []args){
        Point p = new Point(1.5,2.7,3.7);
        Point p1 = new Point(2.5,1.7,2.7);
        System.out.println(p.getDistance(p1));
        p.setX(3.5,0.7,1.7);
        System.out.println(p1.getDistance(new Point(4.5,3.7,4.7)));
    }
}
