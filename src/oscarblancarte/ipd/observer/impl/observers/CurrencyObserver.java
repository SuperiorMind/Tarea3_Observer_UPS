package oscarblancarte.ipd.observer.impl.observers;

import oscarblancarte.ipd.observer.impl.ConfigurationManager;
import oscarblancarte.ipd.observer.impl.IObserver;

public class CurrencyObserver implements IObserver {

    @Override
    public void notifyObserver(String command, Object source) {
        if(command.equals("symbolFormat")){
            ConfigurationManager conf = (ConfigurationManager)source;
            System.out.println("Observer ==> CurrencyObserver.CurrencySymbolChange > "
                    + conf.getSymbolCurrencyFormat().getCurrencySymbol());
        }
    }
}
