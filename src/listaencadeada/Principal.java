
package listaencadeada;

/**
 *
 * @author jabur
 */
public class Principal {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Início");
        
        //criando um node
        Node obj;
        
        ListaEncadeada lista1 = new ListaEncadeada();
        
        for (int index = 1; index <=2000; index++) {
        	obj = new Node("Elemento " + index);
        	lista1.addFirst(obj);
        }
        
        System.out.println("Imprimindo os elementos \n" + lista1);

        for (int index = 1; index <= 50; index++) {
        	lista1.removeFromBack();
        	lista1.removeFromFront();
        }
        
        System.out.println("Imprimindo os elementos \n" + lista1);
        
    }
}
