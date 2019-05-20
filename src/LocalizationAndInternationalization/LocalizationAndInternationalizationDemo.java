package LocalizationAndInternationalization;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizationAndInternationalizationDemo {
    //L10N - Localization
    // I18N - Internationalization

    //Local
    //ResourceBundle --> java.util.*
    public static void main(String[] args) {
        String lang = "ge";
        String country = "GE";
        Locale locale = new Locale(lang, country);
        ResourceBundle resourceBundle = ResourceBundle.getBundle("LocalizationAndInternationalization/Bundle", locale);

        String string = resourceBundle.getString("wish");
        System.out.println(string);
        System.out.println("Happy Birthday");

    }
}
