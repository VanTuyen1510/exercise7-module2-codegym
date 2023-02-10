package Main7;

public class Square extends Shape  {

    private double edge;

    public Square(){

    }
    public Square(double edge){
        this.edge = edge;
    }
    public Square(double edge, String color, boolean filled) {
        super(color, filled);
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }
    public double getArea(){
        return edge * edge ;
    }

    @Override
    public String toString() {
        return "Square{" +
                "edge=" + edge +
                '}';
    }
    public void resize(double percent) {
        System.out.println("Diện tích hình vuông trước khi tăng là " + this.getArea() + " Diện tích hình vuông sau khi tăng là " + this.getArea() * percent);
    }

}
