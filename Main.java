class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");
    int avgInBag = 55;
    int bagNum = 9;
    double totalmm = avgInBag * bagNum;
    double Bluemm = totalmm * .24;
    double Brownmm = totalmm * .13;
    double Greenmm = totalmm * .16;
    double Orangemm = totalmm * .2;
    double Redmm = totalmm * .13;
    double Yellowmm = totalmm * .14;

    System.out.println("Total: " + totalmm);
    System.out.println("Blue:" + Bluemm);
    System.out.println("Brown:" + Brownmm);
    System.out.println("Green:" + Greenmm);
    System.out.println("Orange:" + Orangemm);
    System.out.println("Red:" + Redmm);
    System.out.println("Yellow:" + Yellowmm);

    double sumMM = Bluemm + Brownmm + Greenmm + Orangemm + Redmm + Yellowmm;

    System.out.println("Sum: " + sumMM);

    if (Bluemm > Brownmm && Greenmm > Redmm)
    {
      System.out.println("Blue over Brown and Green over Red");
    }
    if (Brownmm <= Orangemm)
    {
      System.out.println("Brown is less than equal to Orange");
    }
    if (sumMM == totalmm)
    {
      System.out.println("Numbers Match"); //This doesn't match due to a rounding difference from the decimals.  Not sure if this was intended or if I goofed something up.  
    }
  }
}