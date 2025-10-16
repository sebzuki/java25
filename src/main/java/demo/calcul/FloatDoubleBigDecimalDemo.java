void main(String[] args) {

    IO.println("=== Comparaison float / double / BigDecimal ===\n");

    // --- Exemple 1 : addition simple ---
    float fSum = 0.10000000003f + 0.20000000003f;
    double dSum = 0.10000000003 + 0.20000000003;
    BigDecimal bdSum = new BigDecimal("0.10000000003").add(new BigDecimal("0.20000000003"));

    IO.println("Addition 0.1 + 0.2");
    IO.println("float      = " + fSum);
    IO.println("double     = " + dSum);
    IO.println("BigDecimal = " + bdSum);
    IO.println();

    // --- Exemple 2 : multiplication ---
    float fMul = 1.23f * 100f;
    double dMul = 1.23 * 100;
    BigDecimal bdMul = new BigDecimal("1.23").multiply(new BigDecimal("100"));

    IO.println("Multiplication 1.23 * 100");
    IO.println("float      = " + fMul);
    IO.println("double     = " + dMul);
    IO.println("BigDecimal = " + bdMul);
    IO.println();

    // --- Exemple 3 : comparaison d’égalité ---
    double a = 0.1 + 0.2;
    boolean equalsDouble = (a == 0.3);
    boolean equalsBigDecimal = new BigDecimal("0.1").add(new BigDecimal("0.2")).compareTo(new BigDecimal("0.3")) == 0;

    IO.println("Comparaison 0.1 + 0.2 == 0.3");
    IO.println("double     = " + equalsDouble);
    IO.println("BigDecimal = " + equalsBigDecimal);
    IO.println();

    // --- Exemple 4 : affichage de la précision ---
    float f = 1.123456789f;
    double d = 1.1234567890123456;
    BigDecimal bd = new BigDecimal("1.1234567890123456");

    IO.println("Valeurs avec beaucoup de décimales");
    IO.println("float      = " + f);
    IO.println("double     = " + d);
    IO.println("BigDecimal = " + bd);
}