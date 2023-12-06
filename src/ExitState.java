public class ExitState implements State{
    Menu menu;

    public ExitState(Menu menu) {
        this.menu = menu;
    }

    @Override
    public void print() {
        System.out.println("bye");
    }
}
