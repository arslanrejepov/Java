public class Triangle {
    public static void main(String[] args){
        double  x1 = 1.5, y1 = -3.4;
        double x2 = 4.6, y2 = 5.0;
        double x3 = 9.5, y3 = -3.4;

        double area=Math.abs(x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2)) / 2;

        System.out.println("Area of Triangle:"+area);
    }
}
