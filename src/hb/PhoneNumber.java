/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hb;

/**
 *
 * @author TATARAO
 */
public class PhoneNumber implements java.io.Serializable{
    
    private String numbertype;
    private long phonenum;
    private int unid;

    public int getUnid() {
        return unid;
    }

    public String getNumbertype() {
        return numbertype;
    }

    public long getPhonenum() {
        return phonenum;
    }

    public void setUnid(int unid) {
        this.unid = unid;
    }

    public void setNumbertype(String numbertype) {
        this.numbertype = numbertype;
    }

    public void setPhonenum(long phonenum) {
        this.phonenum = phonenum;
    }
    
    
    
}
