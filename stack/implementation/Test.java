class Test{
  public static void main(String[] args) {
    Stack<Karten> pile = new Stack<Karten>();
    pile.push(new Karten("schwarz", "9"));
    System.out.println(pile.getTop().farbe);
  }
}