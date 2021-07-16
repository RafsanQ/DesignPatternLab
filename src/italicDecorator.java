public class italicDecorator extends Decorator {

    public italicDecorator(Subject subject){
        this.subject = subject;
    }

    public String getOutput(){
        return "<i>" + subject.getOutput() + "</i>";
    }

}
