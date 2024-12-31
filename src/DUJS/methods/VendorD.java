package DUJS.methods;

public class VendorD {
    private String vname,varea,vmobno,vyoe;
    public VendorD(String vname,String varea,String vmobno,String vyoe){
        this.varea = varea;
        this.vname = vname;
        this.vmobno = vmobno;
        this.vyoe = vyoe;
    }
    public String getVName(){
        return vname;
    }
    public String getVArea(){
        return varea;
    }
    public String getVMobNo(){
        return vmobno;
    }
    public String getVyoe(){
        return vyoe;
    }
}
