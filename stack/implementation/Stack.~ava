
public class Stack<ContentType> {
  class Node{
        private Node vorgaenger;
        private ContentType inhalt;
        
        public Node(ContentType pInhalt){
            this.inhalt = pInhalt;
            //this.nf = null;  (Attribute werden automatisch beim Erzeugen auf null gesetzt, kann man weglassen)
        }
        
        public ContentType getInhalt(){
            return this.inhalt;
        }
        
        public Node getvorgaenger(){
            return this.nf;
        }
        
        public void setVorgaenger(Node pNF){
            this.nf = pNF;
        }

    }
  Node top;
  Node bottom;
  public Stack(){
    
  }
  
  public boolean isEmpty(){
    if(this.bottom == null)
    {
      return true;
      }
    return false;
    }
  public void push(ContentType pContent)
  {
    Node pNode = new Node(pContent);
    this.top = pNode;
     
    
    
    }
    
  public void pop()
  {
    this.top=null
  
    }
  
  
} 
