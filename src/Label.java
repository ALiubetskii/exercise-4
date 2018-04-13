public class Label extends Component {


    public Label(double xPosition, double yPosition, int width, int height, String text) {
        super(xPosition, yPosition, width, height, text);
    }

    @Override
    public String draw() {
        return "| " +
                getText() +
                " |";
    }

    @Override
    public String toPrint() {
        return  "Label{" +
                "xPosition=" + getxPosition() +
                ", yPosition=" + getyPosition() +
                ", width=" + getWidth() +
                ", height=" + getHeight() +
                ", text='" + getText() + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return "Label{Good Records}";
    }

//    public static void main(String[] args) {
//
//        Label label = new Label(15.5,28.3,10,5,"BIG RED BUTTON");
//        System.out.println();
//        System.out.println("=====Class Label=====");
//        System.out.println(label.draw());
//        System.out.println(label.toString());
//        System.out.println(label.toPrint());
//    }
}

