public class BankovskiySchet {
    private String vladelec;
    private int nomerScheta;
    private double balans;

    public BankovskiySchet() {
        this.vladelec = "Неизвестно";
        this.nomerScheta = 0;
        this.balans = 0.0;
    }

    public BankovskiySchet(String vladelec, int nomerScheta) {
        this.vladelec = vladelec;
        this.nomerScheta = nomerScheta;
        this.balans = 0.0;
    }

    public BankovskiySchet(String vladelec, int nomerScheta, double balans) {
        this.vladelec = vladelec;
        this.nomerScheta = nomerScheta;
        this.balans = balans;
    }

    public void pokazatDetali() {
        System.out.println("Владелец: " + this.vladelec);
        System.out.println("Номер счета: " + this.nomerScheta);
        System.out.println("Баланс: " + this.balans);
    }

    public void polozhitPostoyanno() {
        this.balans += 100.0;
        System.out.println("Текущий баланс после фиксированного депозита 100 евро: " + this.balans);
    }

    public void polozhit(double summa) {
        this.balans += summa;
        System.out.println("Текущий баланс после депозита " + summa + " евро: " + this.balans);
    }

    public void snyat(double summa) {
        if (summa > this.balans) {
            System.out.println("Недостаточно средств");
        } else {
            this.balans -= summa;
            System.out.println("Снятие успешно");
            System.out.println("Баланс после снятия " + summa + ": " + this.balans);
        }
    }

    public static void main(String[] args) {
        BankovskiySchet schet1 = new BankovskiySchet();
        BankovskiySchet schet2 = new BankovskiySchet("Иван Иванов", 2);
        BankovskiySchet schet3 = new BankovskiySchet("Иван Иванов", 1, 150.0);

        System.out.println("Детали первого конструктора:");
        schet1.pokazatDetali();
        schet1.polozhitPostoyanno();
        schet1.polozhit(30.0);
        schet1.snyat(50.0);
        System.out.println("");

        System.out.println("Детали второго конструктора:");
        schet2.pokazatDetali();
        schet2.polozhitPostoyanno();
        schet2.polozhit(30.0);
        schet2.snyat(10.0);
        System.out.println("");

        System.out.println("Детали третьего конструктора:");
        schet3.pokazatDetali();
        schet3.polozhitPostoyanno();
        schet3.polozhit(30.0);
        schet3.snyat(280.0);
    }
}
