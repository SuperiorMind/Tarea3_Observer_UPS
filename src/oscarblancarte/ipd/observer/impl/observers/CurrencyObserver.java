package oscarblancarte.ipd.observer.impl.observers;

import oscarblancarte.ipd.observer.impl.ConfigurationManager;
import oscarblancarte.ipd.observer.impl.IObserver;

public class CurrencyObserver implements IObserver {

    @Override
    public void notifyObserver(String command, Object source) {
        if(command.equals("simbolFormat")){
            ConfigurationManager conf = (ConfigurationManager)source;
            System.out.println("Observer ==> MoneyObserver.moneySimbolChange > "
                    + conf.getSymbolCurrencyFormat().getCurrencySymbol());
        }
    }
}
