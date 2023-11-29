
public class decimal {
    public static void main(String[] args) {
    System.out.println("%-10s %-10s %-10s %-10s\n","Degrees","Radians","Sine","Cosine","Tangent");
    int degrees=30;
    double radians=Math.toRadians(degrees);
    System.out.println("%-10d %-10.4f %-10.4f%-10.4f%-10.4f\n",degrees,radians,Math.sin(radians));
    

    }
}
