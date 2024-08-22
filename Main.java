public class Main {
    int id;
    String nama;
    double IPK;

    public Main(int id, String nama, double IPK) {
        this.id = id;
        this.nama = nama;
        this.IPK = IPK;
    }

    public void uraikan() {
        System.out.println("Idnya: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("IPKnya: " + IPK);
    }
}