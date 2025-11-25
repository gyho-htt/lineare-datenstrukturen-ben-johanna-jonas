
public class Stack<ContentType> {
  public class Node{
    private Node vorgaenger;
    private ContentType inhalt;    
    public Node(ContentType pInhalt){
      this.inhalt = pInhalt;
      //this.nf = null;  (Attribute werden automatisch beim Erzeugen auf null gesetzt, kann man weglassen)
    }
        
    public ContentType getInhalt(){
      return this.inhalt;
    }
        
    public Node getVorgaenger(){
      return this.vorgaenger;
    }
        
    public void setVorgaenger(Node pVG){
      this.vorgaenger = pVG;
    }
  }
  Node top;
  public Stack(){
    
  }
  
  public boolean isEmpty(){
    if(this.top == null)
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
    this.top= top.getVorgaenger();
  }
  public ContentType getTop(){
    if(this.top !=null){
      return top.getInhalt();
    }
    return null;
  } 
} 
