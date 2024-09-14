public class Element{

    private String reg1;
    private String reg2;
    private String reg3;
    private String inst;

    public Element(String inst, String reg1, String reg2, String reg3){
        this.reg1 = reg1;
        this.reg2 = reg2;
        this.reg3 = reg3;
        this.inst = inst;
    }

    public void setInst(String inst){
        this.inst = inst;
    }
    public void setReg1(String reg1){
        this.reg1 = reg1;
    }

    public void setReg2(String reg2){
        this.reg2 = reg2;
    }

    public void setReg3(String reg3){
        this.reg3 = reg3;
    }

    public String getReg1(){
        return reg1;
    }

    public String getReg2(){
        return reg2;
    }

    public String getReg3(){
        return reg3;
    }
}