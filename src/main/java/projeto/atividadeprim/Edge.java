/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto.atividadeprim;

import java.util.Objects;

/**
 *
 * @author LucianoNeto
 */
public class Edge {
    private int weigth;
    private Node node1,node2;
    
    
    
    public Edge (Node node1, Node node2,int weigth){
        this.node1=node1;
        this.node2=node2;
        this.weigth=weigth;
    }
    
    
    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public Node getNode1() {
        return node1;
    }

    public void setNode1(Node node1) {
        this.node1 = node1;
    }

    public Node getNode2() {
        return node2;
    }

    public void setNode2(Node node2) {
        this.node2 = node2;
    }
    
    public void printEdge(){
        System.out.println(this.node1.getValue()+" -- "+getWeigth()+" -- "+this.node2.getValue());
    }

    public Node compareAndReturn(Node nodeExterno){
        if(nodeExterno.equals(this.node1)){
            return this.node2;
        }else if(nodeExterno.equals(this.node2)){
            return this.node1;
        }
        return null;
                
      
    }

    
    
}
