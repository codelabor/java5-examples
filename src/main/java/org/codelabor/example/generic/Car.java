package org.codelabor.example.generic;

/**
 * 참고: 자바의 신 2nd Edition 2권 58p
 *
 * @author bomber
 *
 */
public class Car {
	protected String name;

	public Car(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Car [name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}

}
