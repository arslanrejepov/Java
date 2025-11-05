public class Rectangle {
    private double length,width;

    public Rectangle(){
        this.length=10.0;
        this.width=10.0;
    }
    public Rectangle(double len, double wid){
        this.length=len>0?len:10;
        this.width=wid>0?wid:10;
    }
    public double getArea(){
        return ((length >= 10 && length <= 50) && (width >= 10 && width <= 50)) ? length * width : -1;
    }
    public double getPerimeter(){
        return 2*(length+width);
    }
    public void drawRect() {
    int l, w;
    if (length >= 10 && length <= 50 && width >= 10 && width <= 50) {
        l = (int) length;
        w = (int) width;
    } else {
        l = 10;
        w = 10;
    }
    for (int i = 0; i < l; i++) {
        for (int j = 0; j < w; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
}