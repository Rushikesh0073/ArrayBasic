import java.util.Arrays;
import java.util.Scanner;
class Movie {
    private String m_name;
    private int rating;


    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getM_name() {
        return m_name;
    }

    public int getRating() {
        return rating;
    }

    public String to_String(String m_name, int rating) {
        return m_name + "" + rating;
    }
}

class Theater {

    private int t_id;
    private String t_name;
    private Movie m;


    public void setT_id(int t_id) {
        this.t_id = t_id;
    }


    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    public void setM(Movie m) {
        this.m = m;
    }
    public String getT_name() {
        return t_name;
    }
    public Movie getM() {
        return m;
    }
    public int getT_id() {
        return t_id;
    }

    public String to_String() {

        return t_id + "" + t_name + "" + m;
    }
}
public class MainApp3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Theater[] tr = new Theater[2];


        float rate;

        for (int i = 0; i < tr.length; i++) {

            System.out.println("Enter theater  id :");
            int tid = sc.nextInt();
            System.out.println("Enter theater name :");

            String tname = sc.next();
            System.out.println("Enter movie name");
            String mname = sc.next();
            System.out.println("Enter rating");
            int rating = sc.nextInt();

            Theater t = new Theater();
            t.setT_id(tid);
            t.setT_name(tname);
            t.setM(new Movie());
            t.getM().setM_name(mname);
            t.getM().setRating(rating);
            tr[i] = t;
        }
        System.out.println(Arrays.toString(tr));


        for (int i = 0; i < tr.length; i++) {
            for (int j = i + 1; j < tr.length; j++) {
                if (tr[i].getM().getRating() < tr[i].getM().getRating()) {
                    Theater temp = tr[i];
                    tr[i] = tr[j];
                    tr[j] = temp;
                }
            }
            System.out.println(Arrays.toString(tr));
        }

    }
}







