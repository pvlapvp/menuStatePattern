import java.util.Scanner;

public class RootState implements State {
    Menu menu;

    public RootState(Menu menu) {
        this.menu = menu;
    }

    @Override
    public void print() {
        System.out.println("""
                Выберите пункт меню:
                1. Координаты
                2. Телефоны
                3. Хуйня
                x - выход
                """);
        Scanner scanner = new Scanner(System.in);
        var l = scanner.nextLine();
        switch (l) {
            case "1" -> menu.setFirstState();
            case "2" -> menu.setSecondState();
            case "3" -> menu.setThirdState();
            case "x" -> menu.setExitState();
        }
    }
}
