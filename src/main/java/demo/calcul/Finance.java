void main() {
    int a = 2;
    int b = 3;
    IO.println(a/b);

    float c0 = 0.1f;
    float d0 = 0.2f;
    IO.println(c0+d0);
    IO.println((c0+d0)*3);

    double c1 = 0.1d;
    double d1 = 0.2d;
    IO.println(c1+d1);
    IO.println((c1+d1)*3);

    BigDecimal e = new BigDecimal(0.1);
    BigDecimal f = new BigDecimal(0.2);
    IO.println(e.add(f));

    BigDecimal g = new BigDecimal("0.1");
    BigDecimal h = new BigDecimal("0.2");
    IO.println(g.add(h));
    IO.println(g.add(h).multiply(new BigDecimal("3")));

    BigDecimal i = new BigDecimal("2");
    BigDecimal j = new BigDecimal("3");
    IO.println(i.divide(j, 10, RoundingMode.FLOOR));
    IO.println(i.divide(j, 10, RoundingMode.CEILING));
    var res = i.divide(j, 10, RoundingMode.CEILING)
            .multiply(new BigDecimal("3"))
            .setScale(9, RoundingMode.FLOOR)
            .stripTrailingZeros()
            .toPlainString();
    IO.println(res);

    IO.println(i.divide(j, 20, RoundingMode.FLOOR));
    IO.println(i.divide(j, 20, RoundingMode.CEILING));
    var res2 = i.divide(j, 20, RoundingMode.CEILING)
            .multiply(new BigDecimal("3"))
            .setScale(19, RoundingMode.FLOOR)
            .stripTrailingZeros()
            .toPlainString();
    IO.println(res2);
}