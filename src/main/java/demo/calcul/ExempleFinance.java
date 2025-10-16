void main() {
    float poisson = 7.49f;
    float dentifrice = 4.99f;
    float casserolle = 23.35f;
    float crayon = 1.89f;
    float jus = 2.99f;

    float somme = poisson+dentifrice+casserolle+crayon+jus;
    IO.println(somme*1000);

    BigDecimal poissonB = new BigDecimal("7.49");
    BigDecimal dentifriceB = new BigDecimal("4.99");
    BigDecimal casserolleB = new BigDecimal("23.35");
    BigDecimal crayonB = new BigDecimal("1.89");
    BigDecimal jusB = new BigDecimal("2.99");

    BigDecimal sommeB = poissonB
            .add(dentifriceB)
            .add(casserolleB)
            .add(crayonB)
            .add(jusB)
            .multiply(new BigDecimal("1000"));

    IO.println(sommeB.toPlainString());
}
