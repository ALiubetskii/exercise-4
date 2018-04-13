public class Output {

    public static void main(String[] args) {

        Label label = new Label(15.5,28.3,10,5,"BIG RED BUTTON");
        System.out.println();
        System.out.println("=====Class Label=====");
        System.out.println(label.draw());
        System.out.println(label.toString());
        System.out.println(label.toPrint());

        Button button = new Button(45.5,33.8,25,30,"GO!");
        System.out.println();
        System.out.println("=====Class Button=====");
        System.out.println(button.draw());
        System.out.println(button.toString());
        System.out.println(button.toPrint());
        System.out.println("\n" + "---button status---");
        System.out.println(button.click());
    }
}


