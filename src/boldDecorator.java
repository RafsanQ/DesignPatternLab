public class boldDecorator extends Decorator {

    public boldDecorator(Subject subject){
        this.subject = subject;
    }

    public String getOutput(){

        return "<b>" + subject.getOutput() + "</b>";
    }

}
