package Convertion;

import java.io.IOException;

public class Conversion {
    ConversionCurrency conversionCurrency = new ConversionCurrency();
    CurrencyFilter currencyFilter = new CurrencyFilter();

    public double converse(String moedaBase, String moedaDestino, double valor) throws IOException, InterruptedException {
        var moeda = conversionCurrency.Currency(moedaBase);

        if (moeda == null) {
            throw new RuntimeException("Não foi possível achar a moeda base: " + moedaBase);
        }

        if (!moeda.has(moedaDestino)) {
            throw new IllegalArgumentException("Moeda destino não disponível: " + moedaDestino);
        }

        double taxaDestino = moeda.get(moedaDestino).getAsDouble();


        return valor * taxaDestino;
    }
}
