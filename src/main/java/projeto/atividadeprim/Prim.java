package projeto.atividadeprim;

//------- codigo DFS ----------


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Prim {
    private LinkedList<Node> listaDeNos;
    private LinkedList<Edge> Edges;
    
    
    public Prim(Graph grapf,LinkedList<Node> listaDeNos) {
        this.listaDeNos = listaDeNos;
        this.Edges=grapf.getList();
        
        for(Edge edge:this.Edges){
            edge.getNode1().setParent(null);
            edge.getNode2().setParent(null);
            edge.getNode1().setKey(0);
            edge.getNode2().setKey(0);
        }
    }

    
    public void run(){
        
        
        for(Node node:getListaDeNos()){
            LinkedList<Node> listaDeAdjacencia = new LinkedList<Node>();
            Node nodeExterno;
            for(Edge edge:getEdges()){
                
                nodeExterno=edge.compareAndReturn(node);
                
                if(nodeExterno != null){
                    listaDeAdjacencia.add(nodeExterno);
                    nodeExterno.setParent(node);
                
                }
                
                
            }
        }
        
        
    }
    
    
   public LinkedList<Node> getListaDeNos() {
        return listaDeNos;
    }

    public LinkedList<Edge> getEdges() {
        return Edges;
    }
    
  
   
    
   
}