package reshenie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// PZ8 Pirogov.a.p. KI-35
public class Name {
    public Name() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String username = reader.readLine();
        System.out.println("Отлично, значит ты у нас... " + username +  "! Точно, помню тебя. Ну что же, давай приступим.");
    }
}
