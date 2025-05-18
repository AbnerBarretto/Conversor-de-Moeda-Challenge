package Convertion;

import com.google.gson.JsonObject;

import java.util.HashMap;
import java.util.Map;

public class CurrencyFilter {
    public Map<String, Double> filtrarMoedas(JsonObject conversionRates) {

        String[] moedasDesejadas = {"ARS", "BOB", "BRL", "CLP", "COP", "USD"};
        Map<String, Double> filtradas = new HashMap<>();

        for (String moeda : moedasDesejadas) {
            if (conversionRates.has(moeda)) {
                filtradas.put(moeda, conversionRates.get(moeda).getAsDouble());
            }
        }
        return filtradas;
    }
}