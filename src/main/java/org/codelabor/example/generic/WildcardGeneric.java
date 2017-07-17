package org.codelabor.example.generic;

/**
 * 참고: 자바의 신 2nd Edition 2권 577p
 *
 * @author bomber
 *
 */
public class WildcardGeneric<T> {
	T wildcard;

	public T getWildcard() {
		return wildcard;
	}

	public void setWildcard(T wildcard) {
		this.wildcard = wildcard;
	}

}
