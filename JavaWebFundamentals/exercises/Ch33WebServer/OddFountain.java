package solutions;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("odd")
public class OddFountain implements Fountain{
    private int next = -1;
    @Override
    public int nextInt() {
        next += 2;
        return next;
    }

    @Override
    public String toString() {
        return String.format("OddFountain next=%d", next);
    }
}
