import java.util.Map;

public class Menu {
    private RootState rootState;
    private FirstState firstState;
    private SecondState secondState;
    private ThirdState thirdState;
    private ExitState exitState;
    private State prevState;
    private State currentState;
    private final Map<State, State> relationMap;

    Menu() {
        rootState = new RootState(this);
        firstState = new FirstState(this);
        secondState = new SecondState(this);
        thirdState = new ThirdState(this);
        exitState = new ExitState(this);
        relationMap = Map.of(secondState, rootState,
                thirdState, rootState,
                firstState, rootState,
                rootState, rootState);
        setState(rootState);
    }

    private void setState(State state) {
        prevState = currentState;
        currentState = state;
        currentState.print();
        System.out.println(relationMap);
    }
    public void setFirstState() {
        setState(firstState);
    }

    public void setSecondState() {
        setState(secondState);
    }

    public void setThirdState() {
        setState(thirdState);
    }

    public void setExitState() {
        setState(exitState);
    }

    public void getBack() {
        currentState = prevState;
        currentState.print();
    }

    public void setParentState() {
        setState(relationMap.get(currentState));
    }

    public void setRootState() {
        setState(rootState);
    }
}
