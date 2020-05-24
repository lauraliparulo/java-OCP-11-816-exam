package de.demo.enumer;

public enum Trend {

	UP() {
		int i = 12;

		int getNumber() {
			return i++;
		}

	},

	DOWN() {
		int i = 10;

		int getNumber() {
			return i++;
		}

	};

	int i = 0;

	abstract int getNumber();

}
