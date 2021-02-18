package edu.mccnebu.tickr.controller;

import edu.mccnebu.tickr.AlpacaService;
import net.jacobpeterson.domain.alpaca.marketdata.LastQuote;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/stock")
public class StocksController {

    private final AlpacaService alpacaService;

    StocksController(AlpacaService alpacaService) {
        this.alpacaService = alpacaService;
    }

    @GetMapping(value = "/{symbol}")
    public LastQuote getQuote(@PathVariable String symbol) {
        return alpacaService.getLastQuote(symbol);
    }
}
