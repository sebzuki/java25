void main(String[] args) {
    long t1, t2;
    double d = 0;
    BigDecimal bd = BigDecimal.ZERO;
    BigDecimal operator = new BigDecimal("0.1");

    // double
    t1 = System.nanoTime();
    for (int i = 0; i < 10_000_000; i++) {
        d += 0.1;
    }
    t2 = System.nanoTime();
    System.out.println("double: " + (t2 - t1)/1_000_000 + " ms");

    // BigDecimal
    t1 = System.nanoTime();
    for (int i = 0; i < 10_000_000; i++) {
        //bd = bd.add(new BigDecimal("0.1"));
        bd = bd.add(operator);
    }
    t2 = System.nanoTime();
    System.out.println("BigDecimal: " + (t2 - t1)/1_000_000 + " ms");
}