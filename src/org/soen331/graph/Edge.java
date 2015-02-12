package org.soen331.graph;

public class Edge {
	private Vertex from, to;

	public Edge(Vertex from, Vertex to) {
		this.from = from;
		this.to = to;
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
}