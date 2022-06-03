package behavioral.state;

/**
 * El patrón de estados (state) permite hacer flujos de trabajo (workflows)
 * Los estados se pueden establecer a través de clases que van repitiendo el
 * código pero cambiando los estados. En cualquier punto pueden reiniciarse
 * uno o varios o todos los estados y cambiar uno o varios o todos los estados.
 */

abstract public class State {

    public Telephone telephone;

    public State(Telephone telephone) {
        this.telephone = telephone;
    }

    abstract public String unlock();

    abstract public String openCamera();

    abstract public String takePicture();
}
