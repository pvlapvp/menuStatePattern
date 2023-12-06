import java.util.Map;

public class Menu {
    private final RootState rootState;
    private final FirstState firstState;
    private final SecondState secondState;
    private final ThirdState thirdState;
    private final ExitState exitState;
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
        currentState = state;
        currentState.print();
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

    public void setParentState() {
        setState(relationMap.get(currentState));
    }

}
