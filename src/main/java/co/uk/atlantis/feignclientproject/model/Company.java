
package co.uk.atlantis.feignclientproject.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "catchPhrase",
    "bs"
})
public class Company {

    @JsonProperty("name")
    public String name;
    @JsonProperty("catchPhrase")
    public String catchPhrase;
    @JsonProperty("bs")
    public String bs;
}
