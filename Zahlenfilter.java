class Main {
  public static void main(String[] args) {
    for(int ZAHL = 0; ZAHL <= 200; ZAHL++){
      dividedByFive(ZAHL);
      endsWithNine(ZAHL);
      dividedByThree(ZAHL);
    }
  }
  public static void dividedByFive(int ZAHL) {
    if(ZAHL % 5 == 0){
      System.out.println(ZAHL + " ist durch 5 teilbar");
    }
  }
  public static void endsWithNine(int ZAHL){
    if(ZAHL % 10 == 9){
      System.out.println(ZAHL + " endet auf 9");
    }
  }
  public static void dividedByThree(int ZAHL) {
    if((ZAHL + ZAHL -1) % 3 == 0) {
      System.out.println(ZAHL + " und " + (ZAHL - 1) + " ist durch 3 teilbar!");
    }
  }
}
