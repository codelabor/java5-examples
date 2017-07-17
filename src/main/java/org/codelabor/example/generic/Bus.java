package org.codelabor.example.generic;

/**
 * 참고: 자바의 신 2nd Edition 2권 580p
 *
 * @author bomber
 *
 */
public class Bus extends Car {

	public Bus(String name) {
		super(name);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bus [name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}

}
