package ca.jrvs.apps.trading.model.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "amount",
        "id",
        "traderId"
})
public class Account implements Entity<Integer> {
    @JsonProperty("amount")
    private Double amount;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("traderId")
    private Integer traderId;

    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("traderId")
    public Integer getTraderId() {
        return traderId;
    }

    @JsonProperty("traderId")
    public void setTraderId(Integer traderId) {
        this.traderId = traderId;
    }

    @Override
    public String toString() {
        return "Account{" +
                "amount=" + amount +
                ", id=" + id +
                ", traderId=" + traderId +
                '}';
    }
}