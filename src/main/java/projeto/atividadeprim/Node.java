package projeto.atividadeprim;

import java.util.Objects;

/*
 * Classe criada para representar os vértices de um grafo
 */
public class Node {
        private int color,key;
	private String value;
        private Node parent;

	public Node(String value) {
		this.value = value;

	}
	
	public String getValue() {
		return this.value;
	}
	
	public int getColor() {
		return this.color;
	}
	
	public void setColor(int newColor) {
		this.color = newColor;
	}
        
        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }
        
        public Node getParent() {
            return parent;
        }

        public void setParent(Node parent) {
            this.parent = parent;
        }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Node other = (Node) obj;
        return Objects.equals(this.value, other.value);
    }
    
    
    
    
	
}