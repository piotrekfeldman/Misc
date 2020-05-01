package javaExercises.builder;

public class Pojazd {

    private Integer id;
    private String marka;
    private Integer kola;
    private Integer poduszkiPowietrzne;
    private Integer predkoscMax;
    private String rejestracja;

    public static class Builder {
        private Integer id = 0;
        private String marka = null;
        private Integer kola = 0;
        private Integer poduszkiPowietrzne = 0;
        private Integer predkoscMax = 0;
        private String rejestracja = null;




        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder marka(String marka){
            this.marka = marka;
            return  this;
        }

        public Builder kola(Integer kola){
            this.kola = kola;
            return this;
        }

        public Builder poduszkiPowietrzne(Integer poduszkiPowietrzne){
            this.poduszkiPowietrzne = poduszkiPowietrzne;
            return this;
        }

        public Builder predkoscMax(Integer predkoscMax){
            this.predkoscMax = predkoscMax;
            return this;
        }

        public Builder rejestracja(String rejestracja){
            this.rejestracja = rejestracja;
            return this;
        }

        public Pojazd build() {
            return new Pojazd(this);
        }
    }

    private Pojazd(Builder builder){
        this.id = builder.id;
        this.marka = builder.marka;
        this.kola = builder.kola;
        this.poduszkiPowietrzne = builder.poduszkiPowietrzne;
        this.predkoscMax = builder.predkoscMax;
        this.rejestracja = builder.rejestracja;

    }

    public Integer getId() {
        return id;
    }

    public String getMarka() {
        return marka;
    }

    public Integer getKola() {
        return kola;
    }

    public Integer getPoduszkiPowietrzne() {
        return poduszkiPowietrzne;
    }

    public Integer getPredkoscMax() {
        return predkoscMax;
    }

    public String getRejestracja() {
        return rejestracja;
    }
}
