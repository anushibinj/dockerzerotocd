package dev.fastorial.dockerzerotocd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
public class QuoteOfTheDayController {

    private static final List<String> QUOTES = List.of(
            "Be the change that you wish to see in the world.",
            "In three words I can sum up everything I've learned about life: it goes on.",
            "If you tell the truth, you don't have to remember anything.",
            "A friend is someone who knows all about you and still loves you.",
            "To live is the rarest thing in the world. Most people exist, that is all."
    );

    private static final Random RANDOM = new Random();

    @GetMapping("/quote")
    public QuoteResponse getQuote() {
        int index = RANDOM.nextInt(QUOTES.size());
        return new QuoteResponse(QUOTES.get(index));
    }

    public record QuoteResponse(String quote) {}
}
