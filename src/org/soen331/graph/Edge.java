/*
Guillaume Fortin - 6325300
Emmanuel Tsapekis - 5849004
*/
package org.soen331.graph;

public class Edge<T> {
	private Vertex from, to;
	private T element;

	public Edge(Vertex from, Vertex to, T element) {
		this.from = from;
		this.to = to;
		this.element = element;
	}

	public Vertex getFrom() {
		return from;
	}

	public void setFrom(Vertex from) {
		this.from = from;
	}

	public Vertex getTo() {
		return to;
	}

	public void setTo(Vertex to) {
		this.to = to;
	}
	
	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}
}
