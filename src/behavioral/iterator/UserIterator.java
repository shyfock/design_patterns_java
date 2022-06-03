package behavioral.iterator;

/**
 * Patrón iterador (iterator) permite recorrer listas, sin importar el tipo de
 * contenedor (lista, mapa, etc.)
 * Se implementan tres métodos: siguiente(), reinicia() y hayMas().
 * Si cambio el contenedor de mi clase no tengo que modificar nada en mi codigo
 * de iterador.
 */

public interface UserIterator {

    User next();

    void reset();

    boolean hasMore();

}
