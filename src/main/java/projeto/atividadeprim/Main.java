/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto.atividadeprim;

import java.util.LinkedList;

/**
 *
 * @author LucianoNeto
 */
public class Main {
    public static void main(String[] args) {
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        LinkedList<Node> lista = new LinkedList<Node>();
        
        lista.add(a);
        lista.add(b);
        lista.add(c);
        
        Graph grafo = new Graph();
       
       
       
       
       
       grafo.addEdge(1, a, b);
       grafo.addEdge(2, a, c);
       grafo.addEdge(1, b, c);
       
       grafo.listToString();
       
       Prim algPrim = new Prim(grafo,lista);
       
       algPrim.run();
       
    }
}
