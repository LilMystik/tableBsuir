package TableBSU.TableBSUApi;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
@Component
public class TableBSUApi {
    RestTemplate restTemplate;
    public TableBSUApi() {
        restTemplate = new RestTemplate();
    }
    public String fetchPlayerData(String accountId) {
            UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("https://iis.bsuir.by/api/v1/schedule?studentGroup=" + accountId);
        return restTemplate.getForObject(builder.toUriString(), String.class);
    }
}