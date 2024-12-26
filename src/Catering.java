public class Catering {
    static final String HLINE = "============================================================";
    static final String HLINE2 = "------------------------------------------------------------";
    static final String LOGO = "█▄▄ █▀█ █▀█ ▀█▀   █▀▀ █▀▄▀█ █▄▄ █░█\n█▄█ █▀▄ █▄█ ░█░   █▄█ █░▀░█ █▄█ █▀█";
    static final String INTRO = HLINE+"\n"+LOGO+"\n";
    static final String RECEIPT_TEMPLATE = "──────▄▀── Pizza: %d x %.2f Euro = %.2f Euro ──────────────\n─█▀▀▀█▀█────────────────────────────────────────────────────\n──▀▄░▄▀─── Soda: %d liters x %.2f Euro = %.2f Euro ────────\n────█───────────────────────────────────────────────────────\n──▄▄█▄▄─── Wine: %.2f liters x %.2f Euro = %.2f Euro ─────";
    
    static final double PIZZA_PRICE = 3.90;
    static final double SODA_PRICE = 2.90;
    static final double WINE_PRICE = 22.90;
    public static void main(String[] args) {
        Out.println(INTRO);
        Out.print("Please enter the number of people: ");
        int personCount = In.readInt();

        //full amount
        int pizzaSlice = 2*personCount;
        int soda = (int) Math.ceil(1.2*personCount);
        float wine = (float) 0.35*personCount;

        //actual prices
        double price1 = (double)pizzaSlice*PIZZA_PRICE;
        double price2 = (double)soda*SODA_PRICE;
        double price3 = (double)wine*WINE_PRICE;
        double overall = price1+price2+price3;

        Out.println(HLINE);
        Out.println(RECEIPT_TEMPLATE.formatted(pizzaSlice,PIZZA_PRICE,price1,soda,SODA_PRICE,price2,wine,WINE_PRICE,price3));
        Out.println(HLINE2);
        Out.println("OVERALL: %.2f Euro".formatted(overall));
        Out.println(HLINE);
    }
}
