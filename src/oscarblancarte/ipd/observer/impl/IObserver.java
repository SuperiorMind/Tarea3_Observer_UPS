package oscarblancarte.ipd.observer.impl;

/**
 * @author Oscar Javier Blancarte Iturralde
 *
 */
public interface IObserver {
    
    public void notifyObserver(String command, Object source);
}