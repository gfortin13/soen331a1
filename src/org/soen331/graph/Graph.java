package org.soen331.graph;

import java.util.HashSet;
import java.util.Set;

public class Graph<T> {
	Set<Edge<T>> edges;
	Set<Vertex> vertices;
	
	public Graph<T> newgraph(){
		return new Graph<T>();
	}
	
	public Set<Vertex> vertices(){
		return getVertices();
	}
	
	public Set<Edge<T>> edges(){
		return getEdges();
	}
	
	public int countAllVertices(){
		return vertices.size();
	}
	
	public int countAllEdges(){
		return edges.size();
	}
	
	public Edge<T> getEdge(Vertex v, Vertex w){
		for(Edge<T> edge : edges){
			if((edge.getTo() == v && edge.getFrom() == w) || (edge.getTo() == w && edge.getFrom() == v)){
				return edge;
			}
		}
		return null;
	}
	
	public Set<Edge<T>> incidentEdges(Vertex v){
		Set<Edge<T>> incEdges = new HashSet<Edge<T>>();
		
		for(Edge<T> edge : edges){
			if(edge.getFrom() == v || edge.getTo() == v){
				incEdges.add(edge);
			}
		}
		
		return incEdges;
	}
	
	public Vertex opposite(Vertex v, Edge<T> e){
		Vertex opp = null;
		
		if(e.getTo() == v){
			opp = e.getFrom(); 
		}
		if(e.getFrom() == v){
			opp = e.getTo(); 
		}
		
		return opp;
	}
	
	public Set<Vertex> endVertices(Edge<T> e){
		Set<Vertex> endVertices = new HashSet<Vertex>();
		
		endVertices.add(e.getFrom());
		endVertices.add(e.getTo());
		
		return endVertices;
	}
	
	public boolean areAdjacent(Vertex v, Vertex w){
		for(Edge<T> edge : edges){
			if((edge.getTo() == v && edge.getFrom() == w) || (edge.getTo() == w && edge.getFrom() == v)){
				return true;
			}
		}
		return false;
	}
	
	public Graph<T> insertVertex(Vertex v){
		this.vertices.add(v);
		
		return this;
	}
	
	public Graph<T> removeVertex(Vertex v){
		this.vertices.remove(v);
		
		return this;
	}
	
	public Graph<T> insertEdge(Vertex v, Vertex w, T x){
		this.edges.add(new Edge<T>(v, w, x));
		
		return this;
	}
	
	public Graph<T> removeEdge(Vertex v, Vertex w){
		this.edges.remove(getEdge(v, w));
		
		return this;
	}
	
	public T getEdgeElem(Edge<T> e){
		return e.getElement();
	}
	
	public Graph<T> replaceEdgeElem(Edge<T> e, T x){
		this.edges.remove(e);
		e.setElement(x);
		this.edges.add(e);
		
		return this;
	}
	
	public Graph() {
		this.edges = new HashSet<Edge<T>>();
		this.vertices = new HashSet<Vertex>();
	}
	
	public Graph(Set<Edge<T>> edges, Set<Vertex> vertices) {
		this.edges = edges;
		this.vertices = vertices;
	}

	public Set<Edge<T>> getEdges() {
		return edges;
	}

	public void setEdges(Set<Edge<T>> edges) {
		this.edges = edges;
	}

	public Set<Vertex> getVertices() {
		return vertices;
	}

	public void setVertices(Set<Vertex> vertices) {
		this.vertices = vertices;
	}
	
	
}
