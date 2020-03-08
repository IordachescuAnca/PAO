package package1;

    public class Dreptunghi{
        private int lungime;
        private int latime;
        private String culoare;
        
        public Dreptunghi(){
            this.lungime = 0;
            this.latime = 0;
            this.culoare = "";
        }
        public void setter(int lungime, int latime, String culoare){
            this.lungime = lungime;
            this.latime = latime;
            this.culoare = culoare;
        }
        public int getLungime(){
            return this.lungime;
        }
        public int getLatime(){
            return this.latime;
        }
        public String getCuloare(){
            return this.culoare;
        }
        public void informatii(){
            System.out.println("Dreptunghiul de culoare " + this.culoare + " are aria " + this.latime*this.lungime);
        }
    }