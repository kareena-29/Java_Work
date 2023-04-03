package Assignments.Assign2;

import java.io.Serializable;

public class DataStorage implements Serializable {
    private int bid,bookp,bookq,totalcost;
    private String bname, aname, dateofpub, pname;


//    public DataStorage(int bid, String bname, String aname, String pname, String dateofpub, int bookp, int bookq, int totalcost){
//        this.bid = bid;
//        this.bname = bname;
//        this.aname = aname;
//        this.pname = pname;
//        this.dateofpub = dateofpub;
//        this.bookp = bookp;
//        this.bookq = bookq;
//        this.totalcost = totalcost;
//    }

    public int getBid(){
        return bid;
    }
    public void setBid(int bid){
        this.bid = bid;
    }
    public int getBookp(){
        return bookp;
    }
    public void setBookp(int bookp){
        this.bookp = bookp;
    }

    public int getBookq(){
        return bookq;
    }
    public void setBookq(int bookq){
        this.bookq = bookq;
    }

    public int getTotalcost(){
        return totalcost;
    }
    public void setTotalcost(int totalcost){
        this.totalcost = totalcost;
    }

    public String getBname(){
        return bname;
    }
    public void setBname(String bname){
        this.bname = bname;
    }

    public String getAname(){
        return aname;
    }
    public void setAname(String aname){
        this.aname = aname;
    }

    public String getPname(){
        return pname;
    }
    public void setPname(String pname){
        this.pname = pname;
    }

    public String getDateofpub(){
        return dateofpub;
    }
    public void setDateofpub(String dateofpub){
        this.dateofpub = dateofpub;
    }

    public String toString(){
        return "DataClass{" + "book-id:" + bid + ", book-name:" + bname + ", author-name:" + aname + ", publication-name:" + pname +
                ", date-of-publication:" + dateofpub + ", book-price:" + bookp + ", book-qty:" + bookq + ", total-cost:" + totalcost +
                "}";
    }

}
