package apartment;

//class concrete

public class cash extends Observer {

    public cash(subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

//ststenya terdapat pada harga unit, jadi kalo harga unit berubah maka hasil method update cash dan cicil berubah tergantung komponen    
    
    @Override
    public void update() {
        int hargaUnit = subject.getState();
        int cash = (hargaUnit - ((30 / 100) * hargaUnit));
        System.out.println("\nPEMBAYARAN CASH");
        System.out.println("Pembayaran dilakukan melalui resepsionis pada jam kantor\nHarga yang harus dibayar : " + cash + "\nNB : Diskon 30% karena pembayaran secara cash");
    }

}
