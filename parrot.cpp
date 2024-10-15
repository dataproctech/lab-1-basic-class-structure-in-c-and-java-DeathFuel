#include <ctime>
#include <string>
#include <vector>

using namespace std;

class Parrot {
	public:
		Parrot(string s) {
			add_phrase(s);
		}
		void say() {
			// Select a random phrase.
			const char* phrase = phrases[rand() % phrases.size()].c_str();
			printf("%s\n", phrase);
		}
		void say(unsigned int n) { // Overloaded method to allow for repetition
			while (n--) { say(); }
		}
		void add_phrase(string p) {
			phrases.push_back(p);
		}
		void modify_phrase(string _old, string _new) {
			for (unsigned int i = 0; i < phrases.size(); i++) {
				if (phrases[i] == _old) { phrases[i] = _new; return; }
			}
		}
	private:
		vector<string> phrases;
};

int main() {
	// Seed the RNG
	srand(time(NULL));
	// Recite the forbidden rites
	Parrot p("ᛢᛗᚯ ᛕᚷ ᛰᛇ᛫");
	p.say();
	p.modify_phrase("ᛢᛗᚯ ᛕᚷ ᛰᛇ᛫", "ᛒᛓᚯ ᚴᚸᛟᚿᚼᚳᚧ ᛨᚤᚸᛩᛅᚱ ᚤᚢᛟᚸᛑ᛫");
	p.say();
	p.add_phrase("ᛘᛕᛣ ᛛᚦᛧᚫᚯᛚ ᛑᚤᛝᛏᛃᚣ ᛟᛢ᛫");
	p.add_phrase("ᚵ ᛩᛠᚪ ᛃᚯᚽᚿᚤᛮ ᚧᛣᚤᚠ ᛇᛎᛃ᛭");
	p.add_phrase("ᛞᚬ ᛀᛗᚰᚲ ᚾᚺᚾᚪᚬ ᛉᛢᛮ᛫");
	p.add_phrase("ᛎᚧᚠᛡᛇᚺ ᚺᛒᚣᛛᚻᚩ᛭");
	p.add_phrase("ᛂᚥᚷ ᛣᛍᛦᛂ ᚳᛛ᛫");
	p.add_phrase("ᛟᛛᛑᛖᛛ ᛛᛐᛄ᛬");
	p.add_phrase("ᛕᛅ ᛢᛛᛄᛆᛄᚩ᛫ ᛐᛞᚬ ᛮᚽ᛬");
	p.say(1);
    return 0;
}

