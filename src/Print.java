public class Print extends Component{

    public Print(double xPosition, double yPosition, int width, int height, String text) {
        super(xPosition, yPosition, width, height, text);
    }

    @Override
    public String draw() {
            return "Component{" +
                    "xPosition=" + getxPosition() +
                    ", yPosition=" + getyPosition() +
                    ", width=" + getWidth() +
                    ", height=" + getHeight() +
                    ", text='" + getText() + '\'' +
                    '}';
    }


    public static void main(String[] args){

        Print print = new Print(15.5, 10.2, 15, 10, "Go");
        System.out.println("=====Class Component=====");
        System.out.println(print.draw());
        System.out.println(print.toString());

        Label label = new Label(15, 45.5,10,3, "WHAT?");
        System.out.println();
        System.out.println("=====Class Label====");
        System.out.println(label.draw());
        System.out.println(label.toString());



    }
}
