package org.soen331.graph;

import java.util.HashSet;
import java.util.Set;

public class DirectedGraph<T> extends Graph<T> {
	
	public DirectedGraph<T> newdirectedgraph(){
		return new DirectedGraph<T>();
	}
	
	public DirectedGraph<T> insertDirectedEdge(Vertex v, Vertex w, T x){
		this.edges.add(new Edge<T>(v, w, x));
		
		return this;
	}
	
	public Set<Edge<T>> incomingEdgesOf(Vertex v){
		Set<Edge<T>> inEdges = new HashSet<Edge<T>>();
		
		for(Edge<T> edge : edges){
			if(edge.getTo() == v){
				inEdges.add(edge);
			}
		}
		
		return inEdges;
	}
	
	public Set<Edge<T>> outgoingEdgesOf(Vertex v){
		Set<Edge<T>> outEdges = new HashSet<Edge<T>>();
		
		for(Edge<T> edge : edges){
			if(edge.getFrom() == v){
				outEdges.add(edge);
			}
		}
		
		return outEdges;
	}
	
	public int inDegreeOf(Vertex v){
		int inDeg = 0;
		
		for(Edge<T> edge : edges){
			if(edge.getTo() == v){
				inDeg++;
			}
		}
		
		return inDeg;
	}
	
	public int outDegreeOf(Vertex v){
		int outDeg = 0;
		
		for(Edge<T> edge : edges){
			if(edge.getTo() == v){
				outDeg++;
			}
		}
		
		return outDeg;
	}
	
	public DirectedGraph(){
		super();
	}
	
	public DirectedGraph(Set<Edge<T>> edges, Set<Vertex> vertices) {
		super(edges, vertices);
	}

}
