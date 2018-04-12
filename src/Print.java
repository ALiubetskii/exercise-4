public class Print extends Component{

    public Print(double xPosition, double yPosition, int width, int height, String text) {
        super(xPosition, yPosition, width, height, text);
    }


    public static void main(String[] args){

        Print print = new Print(15.5, 10.2, 15, 10, "Go");
        System.out.println(print.draw());


    }
}
