package best_price_finder;

import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightService {

    public Stream<CompletableFuture<Quote>> getQuotes(){
        var sites = List.of("Site1", "Site2", "Site3");
        return sites.stream()
                .map(this::getQuote);// map(site -> getQuote(site))


    }

    public CompletableFuture<Quote> getQuote(String site){

        return CompletableFuture.supplyAsync(() ->{
            System.out.println("Getting a quote from " + site);
            var ran = new Random();

            LongTask.simulate(1000 + ran.nextInt(2000));
            var price = 100 + ran.nextInt(10);
            return new Quote(site, price);
        });
    }
}
