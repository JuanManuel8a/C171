package B4;

public class Estudiante {
    public static double prom;
    private String nom;
        private String ape;
        private String tel;
        private String ced;
        private String carr;

        public Estudiante(String nom, String ape, String tel, String ced, double prom, String carr) {
            this.nom = nom;
            this.ape = ape;
            this.tel = tel;
            this.ced = ced;
            Estudiante.prom = prom;
            this.carr = carr;
        }
}
