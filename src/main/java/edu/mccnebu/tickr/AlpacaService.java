package edu.mccnebu.tickr;

import net.jacobpeterson.alpaca.AlpacaAPI;
import net.jacobpeterson.alpaca.rest.exception.AlpacaAPIRequestException;
import net.jacobpeterson.domain.alpaca.marketdata.LastQuoteResponse;
import org.springframework.stereotype.Service;

@Service
public class AlpacaService {
    AlpacaAPI alpacaAPI = new AlpacaAPI();

    public void getLastQuote(String symbol) {
        try {
            // Print out the last quote of AAPL
            LastQuoteResponse lastQuoteResponse = alpacaAPI.getLastQuote(symbol);
            System.out.println(lastQuoteResponse.toString());
        } catch (AlpacaAPIRequestException e) {
            e.printStackTrace();
        }
    }
}
