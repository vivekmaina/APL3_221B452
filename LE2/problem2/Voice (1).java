class Voice {
	Animal[] animal = new Animal[5];
	void prepareVoice() {
		animal[0] = new Cow();
		animal[1] = new Tiger();
		animal[2] = new Lion();
		animal[3] = new Goat();
		animal[4] = new Lion();
	}
	void hear() {
		for(int i=0; i<5; i++) {
			animal[i].makeVoice();
		}
	}

}