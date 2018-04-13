public class Label extends Component {


    public Label(double xPosition, double yPosition, int width, int height, String text) {
        super(xPosition, yPosition, width, height, text);
    }

    @Override
    public String draw() {
        return "| Label |";
    }

    @Override
    public void print() {
        System.out.println("DELL");
    }

    @Override
    public String toString() {
        return "Label{Good Records}";
    }
}
