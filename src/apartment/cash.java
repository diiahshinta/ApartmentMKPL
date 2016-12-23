package apartment;

//class concrete

public class cash extends observer {

    public cash(subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

//ststenya terdapat pada harga unit, jadi kalo harga unit berubah maka hasil method update cash dan cicil berubah tergantung komponen    
    
    @Override
    public void update() {
        int hargaUnit = subject.getState();
        int cash = (hargaUnit - ((10 / 100) * hargaUnit));
        System.out.println("\nPEMBAYARAN CASH");
        System.out.println("Pembayaran dilakukan melalui resepsionis pada jam kantor\nHarga yang harus dibayar : " + cash + "\nNB : Diskon 10% karena pembayaran secara cash");
    }

}
