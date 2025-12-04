public class AreaPentagono {
    public static double computeArea(double lado){
        return (5.0 * Math.pow(lado, 2)) / (4.0 * Math.tan(Math.PI / 5.0));
    }
}
