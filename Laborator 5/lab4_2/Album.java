package lab4_2;

public class Album implements Comparable<Album>{
    String nume;
    int anul_publicarii;
    double rating;
    Album(String nume, int anul_publicarii, double rating){
        this.nume = nume;
        this.anul_publicarii = anul_publicarii;
        this.rating = rating;
    }

    public void setNume(String nume) {this.nume = nume;}
    public void setAnul_publicarii(int anul_publicarii) {this.anul_publicarii = anul_publicarii;}
    public void setRating(double rating) {this.rating = rating;}

    public String getNume(){ return this.nume;}
    public int getAnul_publicarii() {return this.anul_publicarii;}
    public double getRating(){return this.rating;}

    @Override
    public int compareTo(Album o) {
        if(this.rating == o.rating){
            if(this.nume.compareTo(o.nume) > 0) return 1;
            return -1;
        }
        if(this.rating < o.rating){
            return 1;
        }
        return -1;
    }
    @Override
    public String toString() {
        return "Nume: " + this.nume + "\nAn publicare: "
                + this.anul_publicarii + "\nRating: " + this.rating;
    }
}
