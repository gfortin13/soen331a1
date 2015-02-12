package org.soen331.graph;

import java.util.ArrayList;
import java.util.List;


public class Graph {
	List<Edge> edges;
	List<Vertex> vertices;
	
	public Graph() {
		this.edges = new ArrayList<Edge>();
		this.vertices = new ArrayList<Vertex>();
	}
	
	public Graph(List<Edge> edges, List<Vertex> vertices) {
		this.edges = edges;
		this.vertices = vertices;
	}

	public List<Edge> getEdges() {
		return edges;
	}

	public void setEdges(List<Edge> edges) {
		this.edges = edges;
	}

	public List<Vertex> getVertices() {
		return vertices;
	}

	public void setVertices(List<Vertex> vertices) {
		this.vertices = vertices;
	}
	
	
}
