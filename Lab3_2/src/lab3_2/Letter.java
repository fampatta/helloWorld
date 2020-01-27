package lab3_2;

public class Letter {
    
    private String nameFrom;
    private String nameTo;
    private String lines = " ";
    
    public Letter(String from,String to){
        nameFrom = from;
        nameTo = to;
             
    }
    public void addLine(String line){
        lines = this.lines+"\n"+line;          
    }
    
    public String getText(){
        return "Dear "+nameFrom+":\n"+lines+"\n\nSincerely,\n\n"+nameTo;

    }
    
}
