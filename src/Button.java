public class Button extends Component {

    public Button(double xPosition, double yPosition, int width, int height, String text) {
        super(xPosition, yPosition, width, height, text);
    }

    @Override
    public String draw() {
        return "This is new class Button";
    }
}
