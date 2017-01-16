package model;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

/**
 * Created by androiddevelopment on 16.1.17..
 */
@DatabaseTable(tableName = "knjiga")
public class Knjiga {

    public static final String POLJE_NASLOV="naslov";
    public static final String POLJE_BROJ_STRANA="broj strana";
    public static final String POLJE_DATUM_IZDRAVANJA="datum izdavanja";


    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(columnName = POLJE_NASLOV)
    private String naslov;

    @DatabaseField(columnName = POLJE_BROJ_STRANA)
    private int brojStrana;

    @DatabaseField(columnName = POLJE_DATUM_IZDRAVANJA)
    private Date datumIzdanja;

    private Boolean prisutna;

    @ForeignCollectionField(foreignFieldName = "knjiga",eager=false,maxEagerLevel = 1)
    private ForeignCollection <Oblast> oblasti;

    //konstruktori
    public Knjiga() {
    }

    public Knjiga(String naslov, int brojStrana, Date datumIzdanja) {
        this.naslov = naslov;
        this.brojStrana = brojStrana;
        this.datumIzdanja = datumIzdanja;
    }
//------------------------------------------------------------------
    //geteri seteri

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public int getBrojStrana() {
        return brojStrana;
    }

    public void setBrojStrana(int brojStrana) {
        this.brojStrana = brojStrana;
    }

    public Date getDatumIzdanja() {
        return datumIzdanja;
    }

    public void setDatumIzdanja(Date datumIzdanja) {
        this.datumIzdanja = datumIzdanja;
    }

    public Boolean getPrisutna() {
        return prisutna;
    }

    public void setPrisutna(Boolean prisutna) {
        this.prisutna = prisutna;
    }
   //----------------------------------------------------------


    @Override
    public String toString() {
        return (id + naslov + brojStrana + datumIzdanja);
    }
}
