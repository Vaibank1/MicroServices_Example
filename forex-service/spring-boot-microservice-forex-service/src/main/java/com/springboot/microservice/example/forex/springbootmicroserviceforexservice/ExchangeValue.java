package com.springboot.microservice.example.forex.springbootmicroserviceforexservice;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;


@Entity
public class ExchangeValue {
    @Id
    private Long id;
    @Column(name ="currency_to")
    private  String to;
    @Column (name = "currency_from")
    private String from;

    private BigDecimal conversionMultiple;

    private  int port;

    public ExchangeValue() {

    }

    public ExchangeValue( long id, String to, String from, BigDecimal num)
    {
        super();
        this.id = id;
        this.to =to;
        this.from= from;
        this.conversionMultiple = num;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getPort() {
        return port;
    }

    public long getId() {
        return id;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }
}
