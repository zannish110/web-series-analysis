package design;
import java.util.*;
public class Rectangle {
	private float length;
    private float width;
    public void setLength(float Length) {
        this.length = length;
    }
    public void setWidth(float width){
        this.width = width;
    }
    public Rectangle() {
    length = 1;
    width = 1;
    }
    public Rectangle(float w , float l){
        this.width = w;
        this.length = l;
    }

    public void cal_perimeter(){
        if((length >= 0.0 && length <= 20.0) && (width >= 0.0 && width <= 20.0)) {
            float perimeter = 2*(width + length);
            System.out.println("Perimeter of the Rectangle is " + perimeter);
        }
        else{
            System.out.println("Out of range");
        }
    }
    public void cal_Area(){
        if((length >= 0.0 && length <= 20.0)&&(width >= 0.0 && width <=20.0)){
            float area = (width * length);
            System.out.println("Area of Rectangle is " + area);
        }
        else{
            System.out.println("Value is out of range ");
        }

    }
    public static void main(String[] args){
        Scanner fizza = new Scanner(System.in);
        System.out.println("Enter length of the Rectangle:");
        float len = fizza.nextFloat();
        System.out.println("Enter width of the Rectangle:");
        float wid = fizza.nextFloat();

        Rectangle calculate = new Rectangle(wid,len);
        calculate.cal_perimeter();
        calculate.cal_Area();
    }
}