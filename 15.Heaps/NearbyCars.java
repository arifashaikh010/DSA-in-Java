//print Nearby k Cars
//Steps :
//1.Find distance d:x^2+y^2
//2.Insert car no and distance in priority queue
//3.Print k cars

import java.util.*;
public class NearbyCars {
    static class Point implements Comparable<Point>{
        int x;
        int y;
        int distSq;
        int idx;

        public Point(int x, int y, int distSq, int idx){
            this.x=x;
            this.y=y;
            this.distSq=distSq;
            this.idx=idx;
        }

        @Override
        public int compareTo(Point p2){
            return this.distSq - p2.distSq;                //sorting in ascending order
        }
    }
    public static void main(String[] args) {
        int pts[][]={{3,3}, {5,-1}, {-2,4}};
        int k=2;

        PriorityQueue<Point> pq = new PriorityQueue<>();
        for(int i=0;i<pts.length;i++){
            int distSq = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
            pq.add(new Point(pts[i][0], pts[i][1], distSq, i));
        }

        //nearest K cars
        System.out.println("Nearest "+k+" cars are : ");
        for(int i=0;i<k;i++){
            System.out.print("C"+pq.remove().idx+" ");
        }
    }
}
// Output:
// Nearest 2 cars are : 
// C0 C2