import java.util.Objects;

public class guillemMora {
    // conf
    private int edat;
    private String tel;

    public guillemMora() {
    }

    public void guillemMoracopia() {
        //copia
    }

    public int getEdat() {
        return edat;
    }

    public String getTel() {
        return tel;
    }

    public String toString() {
        return "guillemMora{" +
                "edat=" + edat +
                ", tel='" + tel + '\'' +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        guillemMora that = (guillemMora) o;
        return edat == that.edat &&
                Objects.equals(tel, that.tel);
    }

    guillemMora(int e, String t) {
        edat = e;
        tel = t;
    }
}
