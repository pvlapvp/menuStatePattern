import java.util.Scanner;

public class ThirdState implements State{
    Menu menu;

    public ThirdState(Menu menu) {
        this.menu = menu;
    }

    @Override
    public void print() {
        System.out.println("welcome to the 3rd state, press any key to get back");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        menu.setParentState();
    }
}
