package edu.mccnebu.tickr.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Getter
@Setter
public class Stock {

    private String symbol;
    @JsonProperty("askprice")
    private BigDecimal askPrice;
    @JsonProperty("asksize")
    private int askSize;
    @JsonProperty("askexchange")
    private int askExchange;
    @JsonProperty("bidprice")
    private BigDecimal bidPrice;
    @JsonProperty("bidsize")
    private int bidSize;
    @JsonProperty("bidexchange")
    private int bidExchange;
    private Timestamp timestamp;

//    @JsonSetter("timestamp")
//    public void setTimestamp(Timestamp timestamp) {
//        this.timestamp = timestamp;
//    }

}
