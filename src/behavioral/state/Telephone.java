package behavioral.state;

public class Telephone {
    public State state;

    public Telephone() {
        state = new LockedState(this);
    }

    public void stateChange(State state) {
        System.out.println("Initial state: " + this.state.getClass().getName());
        this.state = state;
        System.out.println("Final state: " + this.state.getClass().getName());
    }

    public State getState() {
        return state;
    }
}
