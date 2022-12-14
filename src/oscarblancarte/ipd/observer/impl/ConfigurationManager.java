package oscarblancarte.ipd.observer.impl;

import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;

/**
 * @author Oscar Javier Blancarte Iturralde
 *
 */
public class ConfigurationManager extends AbstractObservable {

    private SimpleDateFormat defaultDateFormat;
    private NumberFormat moneyFormat;

    private DecimalFormatSymbols decimalFormatSymbols;

    private static ConfigurationManager configurationManager;

    private ConfigurationManager() {
    }

    public static ConfigurationManager getInstance() {
        if (configurationManager == null) {
            configurationManager = new ConfigurationManager();
        }
        return configurationManager;
    }

    public SimpleDateFormat getDefaultDateFormat() {
        return defaultDateFormat;
    }

    public void setDefaultDateFormat(SimpleDateFormat defaultDateFormat) {
//        System.out.println("Date Format change > " + 
//                (this.defaultDateFormat!=null 
//                        ?this.defaultDateFormat.toPattern():"Null") + " to " 
//                + defaultDateFormat.toPattern());
        this.defaultDateFormat = defaultDateFormat;
        notifyAllObservers("defaultDateFormat", this);
    }

    public NumberFormat getMoneyFormat() {
        return moneyFormat;
    }

    public void setMoneyFormat(NumberFormat moneyFormat) {
//        System.out.println("Date Format change > ");
        this.moneyFormat = moneyFormat;
        notifyAllObservers("moneyFormat", this);
    }

    public DecimalFormatSymbols getSymbolCurrencyFormat() {
        return decimalFormatSymbols;
    }

    public void setSymbolCurrencyFormat(DecimalFormatSymbols decimalFormatSymbols) {
        this.decimalFormatSymbols = decimalFormatSymbols;
        notifyAllObservers("symbolFormat", this);
    }
}