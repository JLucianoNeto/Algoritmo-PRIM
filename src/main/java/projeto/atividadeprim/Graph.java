package projeto.atividadeprim;


import java.util.Arrays;
import java.util.LinkedList;
import projeto.atividadeprim.Node;

/*
 * Classe criada para representar um grafo por meio de ums lista de adjacencia
 */

public class Graph {
	
    private LinkedList<Edge> list; // Lista de listas ligadas do tipo EDGE 
	
    public Graph(){
          this.list=new LinkedList<Edge>();
    }
    
    public void addEdge(int weight, Node node1, Node node2){
        this.list.add(new Edge(node1,node2,weight));
        
        
    }
    public LinkedList<Edge> getList(){
        return list;
    }

    public void setList(LinkedList<Edge> list){
        this.list = list;
    }
    
    
    public void listToString(){
        for(Edge edge:this.list){
            edge.printEdge();
        }
    }
        
        
}