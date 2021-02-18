package edu.mccnebu.tickr;

import net.jacobpeterson.alpaca.AlpacaAPI;
import net.jacobpeterson.alpaca.rest.exception.AlpacaAPIRequestException;
import net.jacobpeterson.domain.alpaca.marketdata.LastQuote;
import net.jacobpeterson.domain.alpaca.marketdata.LastQuoteResponse;
import org.springframework.stereotype.Service;

@Service
public class AlpacaService {
    AlpacaAPI alpacaAPI = new AlpacaAPI(System.getenv("KEY_ID"), System.getenv("SECRET"));

    public LastQuote getLastQuote(String symbol) {
        try {
            LastQuoteResponse lastQuoteResponse = alpacaAPI.getLastQuote(symbol);
            return lastQuoteResponse.getLast();
        } catch (AlpacaAPIRequestException e) {
            e.printStackTrace();
            return null;
        }
    }
}
