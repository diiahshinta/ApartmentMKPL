package apartment;

//class concrete

public class cicil extends observer {

    public cicil(subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

//ststenya terdapat pada harga unit, jadi kalo harga unit berubah maka hasil method update cash dan cicil berubah tergantung komponen    
    
    @Override
    public void update() {
        int hargaUnit = subject.getState();
        int cicil12 = (hargaUnit / 12);
        int cicil6 = (hargaUnit / 6);
        System.out.println("\nPEMBAYARAN CICIL");
        System.out.println("Harga yang harus dibayar selama 12x : " + cicil12);
        System.out.println("Harga yang harus dibayar selama 6x  : " + cicil6);

    }

}
