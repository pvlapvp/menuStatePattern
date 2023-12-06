import java.util.Scanner;

public class FirstState implements State{
    Menu menu;

    public FirstState(Menu menu) {
        this.menu = menu;
    }

    @Override
    public void print() {
        System.out.println("welcome to the 1st state press any key to get back");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        menu.getBack();
    }
}
