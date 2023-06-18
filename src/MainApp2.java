import java.util.Scanner;

class Ords{
    private int Oid;
    private int Quanty;


    /*public Ords(int Oid,int Quanty)
    {
        this.Oid=Oid;
        this.Quanty=Quanty;
    }*/

    public void setOid(int oid) {
        Oid = oid;
    }

    public void setQuanty(int quanty) {
        Quanty = quanty;
    }

    public int getOid() {
        return Oid;
    }

    public int getQuanty() {
        return Quanty;
    }

    public String toString() {
        return Oid + "" + Quanty;
    }
}

public class MainApp2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Ords[] ods = new Ords[2];
        Ords o1=new Ords();

        for(int i=0;i< ods.length;i++)
        {
            System.out.println(" enter id :");
            int ID= sc.nextInt();

            System.out.println("enter qty :");
            int Qty= sc.nextInt();
            o1.setOid(ID);
            o1.setQuanty(Qty);
            o1.getOid();
            o1.getQuanty();

            ods[i]=o1;
        }
       /* for (int i=0;i< ods.length;i++)
        {
            System.out.println(""+o1.getOid()+""+o1.getQuanty());
        }*/


            for (int i = 0; i < ods.length; i++) {
                if (o1.getQuanty() > 2) {
                    System.out.println(" \t id of ord >2 :" + o1.getOid() + " \t" +
                            "\nQty of ord >2 " + o1.getQuanty());
                }
            }

    }
}
