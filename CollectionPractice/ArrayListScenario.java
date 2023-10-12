package CollectionPractice;
import java.util.ArrayList;

class Equity {
    String symbol = "";
    String companyName = "";
    String series = "";
    String listingDate = "";
    Integer paidUpValue = 0;
    Integer marketLot = 0;
    String isinNo = "";
    Integer faceValue = 0;

    Equity(String sym, String name, String series, String dateList, Integer paidValue, Integer market, String isin,
            Integer face) {
        this.symbol = sym;
        this.companyName = name;
        this.series = series;
        this.listingDate = dateList;
        this.paidUpValue = paidValue;
        this.marketLot = market;
        this.isinNo = isin;
        this.faceValue = face;
    }

    String getSym() {
        return symbol;
    }
    void setSym(String symbol) {
        this.symbol = symbol;
    }

    String getName() {
        return companyName;
    }
    void setName(String company) {
        this.companyName = company;
    }

    String getSeries() {
        return series;
    }
    void setSeries(String series) {
        this.series = series;
    }

    String getListDate() {
        return listingDate;
    }
    void setListDate(String listingDate) {
        this.listingDate = listingDate;
    }

    Integer getPaidValue() {
        return paidUpValue;
    }
    void setPaidValue(Integer paidUpValue) {
        this.paidUpValue = paidUpValue;
    }

    Integer getMarketLot() {
        return marketLot;
    }
    void setMarketLot(Integer marketLot) {
        this.marketLot = marketLot;
    }

    String getIsin() {
        return isinNo;
    }
    void setIsin(String isinNo) {
        this.isinNo = isinNo;
    }

    Integer getFace() {
        return faceValue;
    }
    void setFace(int face) {
        this.faceValue = face;
    }

    @Override
    public String toString() {
        return "Equity [id=" + symbol +
                ", name=" + companyName + ", age=" + faceValue + "]";
    }
}

public class ArrayListScenario {
    public static void main(String[] args) {
        ArrayList<Equity> equity = new ArrayList<>();
        Equity eq1 = new Equity("APOLLO", "Apollo Micro Systems Limited", "EQ", "22-JAN-2018", 1, 1, "INE713T01028", 1);
        Equity eq2 = new Equity("BUTTERFLY", "Butterfly Gandhimathi Appliances Limited", "EQ", "28-APR-2014", 10, 1,
                "INE295F01017", 10);
        Equity eq3 = new Equity("CANBK", "Canara Bank", "EQ", "23-DEC-2002", 10, 1, "INE476A01014", 10);
        Equity eq4 = new Equity("FOCUS", "Focus Lighting and Fixtures Limited", "EQ", "24-NOV-2021", 10, 1,
                "INE593W01010", 10);
        Equity eq5 = new Equity("GABRIEL", "Gabriel India Limited", "EQ", "20-APR-2005", 1, 1, "INE524A01029", 1);

        Equity eq6 = new Equity("HCLTECH", "HCL Technologies Limited", "EQ", "06-JAN-2000", 2, 1, "INE860A01027", 2);
        Equity eq7 = new Equity("IRCTC", "Indian Railway Catering And Tourism Corporation Limited", "EQ", "14-OCT-2019",
                2, 1, "INE335Y01020", 2);
        Equity eq8 = new Equity("JETAIRWAYS", "Jet Airways (India) Limited", "BZ", "14-MAR-2005", 10, 1, "INE802G01018",
                10);
        Equity eq9 = new Equity("KOVAI", "Kovai Medical Center and Hospital Limited", "EQ", "05-AUG-2021", 10, 1,
                "INE177F01017", 10);

        Equity eq10 = new Equity("LT", "Larsen & Toubro Limited", "EQ", "23-JUN-2004", 2, 1, "INE018A01030", 2);

        // MRF,MRF Limited,EQ,18-SEP-1996,10,1,INE883A01011,10
        // NDTV,New Delhi Television Limited,EQ,19-MAY-2004,4,1,INE155G01029,4
        // ONGC,Oil & Natural Gas Corporation Limited,EQ,19-JUL-1995,5,1,INE213A01029,5
        // POLICYBZR,PB Fintech Limited,EQ,15-NOV-2021,2,1,INE417T01026,2
        // QUICKHEAL,Quick Heal Technologies Limited,EQ,18-FEB-2016,10,1,INE306L01010,10

        // RAINBOW,Rainbow Childrens Medicare
        // Limited,EQ,10-MAY-2022,10,1,INE961O01016,10
        // SUNTV,Sun TV Network Limited,EQ,24-APR-2006,5,1,INE424H01027,5
        // TATACOMM,Tata Communications Limited,EQ,12-APR-1995,10,1,INE151A01013,10
        // WONDERLA,Wonderla Holidays Limited,EQ,09-MAY-2014,10,1,INE066O01014,10
        // ZOMATO,Zomato Limited,EQ,23-JUL-2021,1,1,INE758T01015,1

        equity.add(eq1);
        equity.add(eq2);
        equity.add(eq3);
        equity.add(eq4);
        equity.add(eq5);
        equity.add(eq6);
        equity.add(eq7);
        equity.add(eq8);
        equity.add(eq9);
        equity.add(eq10);
        for (Equity e : equity) {
            System.out.println(e.symbol + " " + e.companyName + " " + e.series + " " + e.listingDate + " "
                    + e.paidUpValue + " " + e.marketLot + " " + e.isinNo + " " + e.faceValue);
        }
    }
}
