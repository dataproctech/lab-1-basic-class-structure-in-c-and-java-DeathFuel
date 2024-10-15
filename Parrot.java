import java.util.ArrayList;
import java.util.Random;

public class Parrot {
    private final ArrayList<String> phrases = new ArrayList<String>();
    private final Random rng = new Random();

    public Parrot(String s) {
        this.addPhrase(s);
    }
    public void say() {
        // Select a random phrase.
        String phrase = this.phrases.get(this.rng.nextInt(0, this.phrases.size()));
        System.out.println(phrase);
    }
    public void say(int n) { // Overloaded method to allow for repetition
        while (n-- > 0) { this.say(); }
    }
    public void addPhrase(String p) {
        this.phrases.add(p);
    }
    public void modifyPhrase(String _old, String _new) {
        int i = this.phrases.indexOf(_old);
        if (i >= 0) {
            this.phrases.set(i, _new);
        }
    }

    public static void main(String[] args) {
        // Begin the ritual
        Parrot p = new Parrot(" ුම් ි ම ීත");
        p.say();
        p.modifyPhrase(" ුම් ි ම ීත", "නෝර්වීජියානු නිල්");
        p.say();
        p.addPhrase("ක ේ ධි දක ද ්මැ ණ් ු ක ත්ප නි ැර න ආක");
        p.addPhrase("ම දාවලවඉසය ුවේ");
        p.addPhrase("ය උ  න සි  නඉධේ න කත්ණාරජ   ල  නසපවඉ");
        p.addPhrase("යජ බවම ජ ානණ ී මඅ න  කහ ව ඉඉම තා ුි ීන");
        p.addPhrase("ය සි ඉ න කතණාරජ ල නසපව");
        p.addPhrase("න   න ණ ේ  තයාදණ් රරරරරරරරරරරරරරරරරරරරරරරරරරරරරරරරර ලසයම ඉ ම ඉ ම ඉ ම ඉ ම ඉ ම ඉ ම ඉ ම ඉ ධ  ඉ ව   ව ඉධරර ම් වව ර ස නම ");
        p.addPhrase("ක ේ ධිදකක ේධ  ේ ධි දක ද ්මැ ණ් ු කත්ප නි ැර න ආකක ද ්මැණ ුකත්පන ැර න");
        p.say(5);
    }
};


