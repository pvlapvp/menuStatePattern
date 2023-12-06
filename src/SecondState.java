import java.util.Scanner;

public class SecondState implements State{
    Menu menu;

    public SecondState(Menu menu) {
        this.menu = menu;
    }

    @Override
    public void print() {
        System.out.println("""
                1. БП ПСП
                2. БП ПРП
                3. БП ГРА
                4. <--
                """);
        Scanner scanner = new Scanner(System.in);
        var l = scanner.nextLine();
        switch (l) {
            case "1" -> {
                System.out.println("1-65-52");
                menu.setSecondState();
            }
            case "2" -> {
                System.out.println("2-65-52");
                menu.setSecondState();
            }
            case "3" -> {
                System.out.println("3-65-52");
                menu.setSecondState();
            }
            case "4" -> menu.setParentState();
        }
    }
}
