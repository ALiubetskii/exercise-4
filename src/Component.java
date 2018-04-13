public abstract class Component {

    private double xPosition;
    private double yPosition;
    private int width;
    private int height;
    private String text;

    public Component(double xPosition, double yPosition, int width, int height, String text) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.width = width;
        this.height = height;
        this.text = text;
    }


    public double getxPosition() {
        return xPosition;
    }

//    public void setxPosition() {
//        this.xPosition = xPosition;
//    }

    public double getyPosition() {
        return yPosition;
    }

//    public void setyPosition() {
//        this.yPosition = yPosition;
//    }

    public int getWidth() {
        return width;
    }

//    public void setWidth() {
//        this.width = width;
//    }

    public int getHeight() {
        return height;
    }

//    public void setHeight() {
//        this.height = height;
//    }

    public String getText() {
        return text;
    }

//    public void setText() {
//        this.text = text;
//    }

    @Override
    public String toString() {
        return "BIG RED BUTTON";
    }

    public abstract String toPrint();

    public abstract String draw();

}
