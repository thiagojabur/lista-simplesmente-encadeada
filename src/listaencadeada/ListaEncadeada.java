package listaencadeada;

public class ListaEncadeada {
    protected Node head;
    protected Node tail; 	
    protected long size;

    public ListaEncadeada() {
        size = 0;
        head = null;
        tail = null;
    }
    
    public void addFirst(Node newHead) {
        newHead.setNext(head);
        if (size == 1)
            tail = head;
        head = newHead;
         
        size += 1;
    }
    
    public void addLast(Node newTail) {
        System.out.println("tail: " + tail.getElement());
        
        tail.setNext(newTail);
        tail = newTail;
        size += 1;
    }
    
    public Node getFirst() {
        return head;
    }
    
    public boolean isEmpty() {
        return (head == null);        
    }
    
    public String toString() {    
        Node atual = head;
        String retorno = "";
        while (atual != null) { 
            retorno += atual.getElement() + "\n";
            atual = atual.getNext();
        }
        
        return retorno;
    }  
    
    public Node removeFromFront() throws EmptyListException {
        Node nodeRemovido = head;
        if (isEmpty()) {
            throw new EmptyListException( "Objeto" );
        }
        if (size == 1) { 
            head = null;
            tail = null;
        }    
        else {
            head = head.getNext();
        }
        return nodeRemovido;
    }    
    
    public Node removeFromBack() throws EmptyListException {
        Node nodeRemovido = head;
        if (isEmpty()) {
            throw new EmptyListException( "Objeto" );
        }
        if (size == 1) { 
            head = null;
            tail = null;
        }    
        else {
            //tem que percorrer a lista            
            Node atual = getFirst();
            
            System.out.println("Tail: " + tail.getElement());
            
            
            while (atual.getNext() != tail) 
                atual = atual.getNext();
            
            System.out.println("dd" + atual.getElement());
            
            tail = atual;
            atual.setNext(null); 
        }
        return nodeRemovido;
    }
    
    
    
}
