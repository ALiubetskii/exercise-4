public class Button extends Component {

    public Button (double xPosition, double yPosition, int width, int height, String text) {
        super(xPosition, yPosition, width, height, text);
    }

    @Override
    public String draw() {
        return "*****" + "\n" +
                getText() + "\n" +
                "*****";
    }

    @Override
    public String toString() {
        return "Don't push it!";
    }

    @Override
    public String toPrint() {
        return "Button{" +
                "xPosition=" + getxPosition() +
                ", yPosition=" + getyPosition() +
                ", width=" + getWidth() +
                ", height=" + getHeight() +
                ", text='" + getText() + '\'' +
                '}';
    }

    public String click() {

        boolean clc;
        String result;
        clc = false;

        if (clc == true) {

            result = "world is burning";
            }
            else {

            result = "we still have a chance";
        }
            return result;
    }


//    public static void main(String[] args) {
//
//        Button button = new Button(45.5,33.8,25,30,"GO!");
//        System.out.println();
//        System.out.println("=====Class Button=====");
//        System.out.println(button.draw());
//        System.out.println(button.toString());
//        System.out.println(button.toPrint());
//        System.out.println("\n" + "---button status---");
//        System.out.println(button.click());
//
//    }
}
