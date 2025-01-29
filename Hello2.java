class Hello2 {
    public static void main(String[] args)
    {
      calculateSI(10000, 2.5f, 3.5f);
    }
    public static void calculateSI(int p, float r, float t){
      float si = p*t*r/100;
      System.out.println(si);
    }
  }
  